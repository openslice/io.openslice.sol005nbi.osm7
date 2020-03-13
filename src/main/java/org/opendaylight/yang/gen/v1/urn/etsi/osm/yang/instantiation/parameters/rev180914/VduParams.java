package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Volume;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * grouping vdu_params {
 *   leaf id {
 *     type string;
 *   }
 *   list volume {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf vim-volume-id {
 *       type string;
 *     }
 *   }
 *   list interface {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type ietf-yang:mac-address;
 *     }
 *     leaf floating-ip-required {
 *       type boolean;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vdu_params</i>
 *
 */
public interface VduParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu_params");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * @return <code>java.util.List</code> <code>volume</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Volume> getVolume();
    
    /**
     * @return <code>java.util.List</code> <code>interface</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Interface> getInterface();

}

