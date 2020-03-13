package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.IpProfile;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping internal_vld_params {
 *   leaf name {
 *     type string;
 *   }
 *   leaf vim-network-name {
 *     type string;
 *   }
 *   container ip-profile {
 *     uses ip-profile-update-schema;
 *   }
 *   list internal-connection-point {
 *     key id-ref;
 *     leaf id-ref {
 *       type string;
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/internal_vld_params</i>
 *
 */
public interface InternalVldParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal_vld_params");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimNetworkName();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.IpProfile</code> <code>ipProfile</code>, or <code>null</code> if not present
     */
    @Nullable
    IpProfile getIpProfile();
    
    /**
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalConnectionPoint> getInternalConnectionPoint();

}

