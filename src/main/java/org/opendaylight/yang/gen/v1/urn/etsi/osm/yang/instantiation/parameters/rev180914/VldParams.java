package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping vld_params {
 *   uses vld_common_params;
 *   list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:constituent-vnfd/nsd:member-vnf-index;
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type leafref {
 *         path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:connection-point/vnfd:name;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_params</i>
 *
 */
public interface VldParams
    extends
    DataObject,
    VldCommonParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vld_params");

    /**
     * @return <code>java.util.List</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdConnectionPointRef> getVnfdConnectionPointRef();

}

