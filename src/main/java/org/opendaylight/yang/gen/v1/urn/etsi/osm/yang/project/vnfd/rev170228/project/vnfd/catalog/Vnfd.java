package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.VnfdCatalog;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.VnfdBuilder.VnfdImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-vnfd</b>
 * <pre>
 * list vnfd {
 *   key id;
 *   uses vnfd-base:vnfd-descriptor;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-vnfd/project/(urn:etsi:osm:yang:project-vnfd?revision=2017-02-28)vnfd-catalog/vnfd</i>
 * 
 * <p>To create instances of this class use {@link VnfdBuilder}.
 * @see VnfdBuilder
 * @see VnfdKey
 *
 */
@JsonDeserialize(as = VnfdImpl.class)
//@JsonIgnoreProperties( {"meta", "http-endpoint", "_admin"} )
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Vnfd
    extends
    ChildOf<VnfdCatalog>,
    Augmentable<Vnfd>,
    VnfdDescriptor,
    Identifiable<VnfdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");

    @Override
    VnfdKey key();

}

