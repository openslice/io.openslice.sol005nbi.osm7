package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.NsParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.VnfPrimitiveGroup;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   list ns-parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 *   list ns-parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 *   list vnf-primitive-group {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *     list primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       list parameter {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-config-primitive-values/output</i>
 * 
 * <p>To create instances of this class use {@link GetNsConfigPrimitiveValuesOutputBuilder}.
 * @see GetNsConfigPrimitiveValuesOutputBuilder
 *
 */
public interface GetNsConfigPrimitiveValuesOutput
    extends
    RpcOutput,
    Augmentable<GetNsConfigPrimitiveValuesOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsParameter> getNsParameter();
    
    /**
     * Automatically generated parameters in parameter group
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsParameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsParameterGroup> getNsParameterGroup();
    
    /**
     * List of service primitives grouped by VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitiveGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfPrimitiveGroup> getVnfPrimitiveGroup();

}

