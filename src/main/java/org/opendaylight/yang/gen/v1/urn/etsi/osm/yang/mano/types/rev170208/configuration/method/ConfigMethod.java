package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the configuration method for the VNF or VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice config-method {
 *   case script {
 *     container script {
 *       leaf script-type {
 *         type enumeration {
 *           enum rift;
 *         }
 *       }
 *     }
 *   }
 *   case juju {
 *     container juju {
 *       leaf charm {
 *         type string;
 *       }
 *       leaf proxy {
 *         type boolean;
 *         default true;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method</i>
 *
 */
public interface ConfigMethod
    extends
    ChoiceIn<ConfigurationMethod>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-method");


}

