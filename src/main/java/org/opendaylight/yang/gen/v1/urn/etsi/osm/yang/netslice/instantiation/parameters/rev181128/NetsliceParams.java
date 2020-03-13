package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params.NetsliceVld;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>netslice-instantiation-parameters</b>
 * <pre>
 * grouping netslice_params {
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   leaf ssh_keys {
 *     type string;
 *   }
 *   list netslice-subnet {
 *     key id;
 *     uses netslice_subnet_params;
 *   }
 *   list netslice-vld {
 *     key name;
 *     uses netslice_vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>netslice-instantiation-parameters/netslice_params</i>
 *
 */
public interface NetsliceParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice_params");

    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimAccountId();
    
    /**
     * @return <code>java.lang.String</code> <code>sshKeys</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSshKeys();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceSubnet</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceSubnet> getNetsliceSubnet();
    
    /**
     * @return <code>java.util.List</code> <code>netsliceVld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NetsliceVld> getNetsliceVld();

}

