package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.ConfigMethod;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping configuration-method {
 *   choice config-method {
 *     case script {
 *       container script {
 *         leaf script-type {
 *           type enumeration {
 *             enum rift;
 *           }
 *         }
 *       }
 *     }
 *     case juju {
 *       container juju {
 *         leaf charm {
 *           type string;
 *         }
 *         leaf proxy {
 *           type boolean;
 *           default true;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method</i>
 *
 */
public interface ConfigurationMethod
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("configuration-method");

    /**
     * Defines the configuration method for the VNF or VDU.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.ConfigMethod</code> <code>configMethod</code>, or <code>null</code> if not present
     */
    @Nullable
    ConfigMethod getConfigMethod();

}

