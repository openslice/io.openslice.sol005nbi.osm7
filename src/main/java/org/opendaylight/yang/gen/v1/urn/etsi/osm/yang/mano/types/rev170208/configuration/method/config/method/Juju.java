package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.ConfigMethod;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configure the VNF or VDU through Juju.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case juju {
 *   container juju {
 *     leaf charm {
 *       type string;
 *     }
 *     leaf proxy {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method/juju</i>
 *
 */
public interface Juju
    extends
    DataObject,
    Augmentable<Juju>,
    ConfigMethod
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.juju.Juju</code> <code>juju</code>, or <code>null</code> if not present
     */
    @Nullable
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.juju.Juju getJuju();

}

