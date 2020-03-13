package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.initial.config.primitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice primitive-type {
 *   case primitive-definition {
 *     leaf name {
 *       type string;
 *     }
 *     uses primitive-parameter-value;
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/initial-config-primitive/primitive-type</i>
 *
 */
public interface PrimitiveType
    extends
    ChoiceIn<InitialConfigPrimitive>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-type");


}

