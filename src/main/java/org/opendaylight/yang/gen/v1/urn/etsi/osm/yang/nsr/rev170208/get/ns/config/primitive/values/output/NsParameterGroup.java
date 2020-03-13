package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.GetNsConfigPrimitiveValuesOutput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.get.ns.config.primitive.values.output.ns.parameter.group.Parameter;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Automatically generated parameters in parameter group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ns-parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-config-primitive-values/output/ns-parameter-group</i>
 * 
 * <p>To create instances of this class use {@link NsParameterGroupBuilder}.
 * @see NsParameterGroupBuilder
 * @see NsParameterGroupKey
 *
 */
public interface NsParameterGroup
    extends
    ChildOf<GetNsConfigPrimitiveValuesOutput>,
    Augmentable<NsParameterGroup>,
    Identifiable<NsParameterGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter-group");

    /**
     * Parameter group name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Automatically generated group parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();
    
    @Override
    NsParameterGroupKey key();

}

