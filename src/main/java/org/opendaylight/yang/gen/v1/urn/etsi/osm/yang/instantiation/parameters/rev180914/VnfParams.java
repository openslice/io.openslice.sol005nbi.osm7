package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.InternalVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.Vdu;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping vnf_params {
 *   leaf member-vnf-index {
 *     type string;
 *   }
 *   leaf vimAccountId {
 *     type string;
 *   }
 *   list vdu {
 *     key id;
 *     uses vdu_params;
 *   }
 *   list internal-vld {
 *     key name;
 *     uses internal_vld_params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vnf_params</i>
 *
 */
public interface VnfParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf_params");

    /**
     * @return <code>java.lang.String</code> <code>memberVnfIndex</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndex();
    
    /**
     * @return <code>java.lang.String</code> <code>vimAccountId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimAccountId();
    
    /**
     * @return <code>java.util.List</code> <code>vdu</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vdu> getVdu();
    
    /**
     * @return <code>java.util.List</code> <code>internalVld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalVld> getInternalVld();

}

