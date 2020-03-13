/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm7
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package OSM7Util.OSM7ArchiveExtractor;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;


public class OSM7NSExtractor {
	private static int BUFFER_SIZE = 4 * 1024;

	private File NSDescriptorFile;

	private String descriptorYAMLfile;
	
	private ByteArrayOutputStream iconfilePath;	

	public OSM7NSExtractor(File NSDescriptorFile) {
		this.NSDescriptorFile = NSDescriptorFile;
	}

	public Nsd extractNsDescriptor() throws IOException  {
		
		Nsd descriptor = null;
				
		try (InputStream in = new FileInputStream(NSDescriptorFile);
				GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
				TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)) {
			TarArchiveEntry entry = null;

			while ((entry = tarIn.getNextTarEntry()) != null) {
	

                if (entry.getName().endsWith(".yaml")) {
					ByteArrayOutputStream file = new ByteArrayOutputStream();

					int count;
					byte data[] = new byte[BUFFER_SIZE];

					while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						file.write(data, 0, count);
					}

					ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

					this.descriptorYAMLfile = new String(file.toByteArray());


                    JsonNode tr = null;
					if ( !this.descriptorYAMLfile.equals("") ) {
						tr = mapper.readTree(this.descriptorYAMLfile).findValue("nsd:nsd");
                    	if ( tr == null ) {
    						tr = mapper.readTree(this.descriptorYAMLfile).findValue("nsd"); 
                        }
                    }                        
					
					

                    if ( tr != null ) 
                    {
                    	if (tr.get(0) != null){ 
                    		tr = tr.get(0);
                    	}
    					String s = tr.toString();
    					
    					s = s.replaceAll("rw-nsd:", ""); //some yaml files contain  rw-nsd: prefix in every key which is not common in json    					
    					s = s.replaceAll("nsd:", ""); //some yaml files contain  nsd: prefix in every key which is not common in json
    					
//    					try {
    					descriptor = mapper.readValue( s , Nsd.class);
//    					}catch (Exception e) {
//    						System.out.println("ERROR: " + entry.getName() + " cannot be read as Nsd class! " + e.getMessage());
//    						
//						}                        	
    					
                    	
                    }else {
						System.out.println("ERROR: " + entry.getName() + " does not contain nsd tag! " );
                    }


				}
				


                if  ( entry.getName().endsWith(".png") || entry.getName().endsWith(".jpg")) {    	
                	
                	this.iconfilePath = new ByteArrayOutputStream();

					int count;
					byte data[] = new byte[BUFFER_SIZE];

					while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
						this.iconfilePath.write(data, 0, count);
					}
					
					
                }
			}
		}

		return descriptor;
	}
	
//	public NSDescriptor extractDescriptor() throws IOException {
//		try (InputStream in = new FileInputStream(NSDescriptorFile);
//				GzipCompressorInputStream gzipIn = new GzipCompressorInputStream(in);
//				TarArchiveInputStream tarIn = new TarArchiveInputStream(gzipIn)) {
//			
//			TarArchiveEntry entry, root = null;
//
//			while ((entry = tarIn.getNextTarEntry()) != null) {
//				if (root == null && entry.getName().indexOf("/") == entry.getName().length() - 1) {
//					root = entry;
//					continue;
//				}
//
//				if (entry.getName().indexOf("/", root.getName().length()) == -1 && entry.getName().endsWith(".yaml")) {
//					ByteArrayOutputStream file = new ByteArrayOutputStream();
//
//					int count;
//					byte data[] = new byte[BUFFER_SIZE];
//
//					while ((count = tarIn.read(data, 0, BUFFER_SIZE)) != -1) {
//						file.write(data, 0, count);
//					}
//
//					ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
//					mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//					this.descriptorYAMLfile = new String(file.toByteArray());
//					NSTopLevelContainer container = mapper.readValue(file.toByteArray(), NSTopLevelContainer.class);
//
//					if (container != null) {
//						NSDescriptor descriptor = container.catalog.descriptors.get(0);
//
//						try {
//							mapper = new ObjectMapper(new YAMLFactory());
//							mapper.readValue(file.toByteArray(), NSTopLevelContainer.class);
//							descriptor.unknownFields = false;
//						} catch (JsonMappingException ex) {
//							ex.printStackTrace();
//							descriptor.unknownFields = true;
//						}
//
//						return descriptor;
//					} else {
//						return null;
//					}
//				}
//			}
//		}
//
//		return null;
//	}

	public String getDescriptorYAMLfile() {
		return descriptorYAMLfile;
	}

	public void setDescriptorYAMLfile(String descriptorYAMLfile) {
		this.descriptorYAMLfile = descriptorYAMLfile;
	}
	

    public ByteArrayOutputStream getIconfilePath() {
		return iconfilePath;
	}

	
}
