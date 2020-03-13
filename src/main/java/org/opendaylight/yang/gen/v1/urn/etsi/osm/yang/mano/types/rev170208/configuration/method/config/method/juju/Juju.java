package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.juju;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container juju {
 *   leaf charm {
 *     type string;
 *   }
 *   leaf proxy {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/configuration-method/config-method/juju/juju</i>
 * 
 * <p>To create instances of this class use {@link JujuBuilder}.
 * @see JujuBuilder
 *
 */
public interface Juju
    extends
    ChildOf<ConfigurationMethod>,
    Augmentable<Juju>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    /**
     * Juju charm to use with the VNF or VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>charm</code>, or <code>null</code> if not present
     */
    @Nullable
    String getCharm();
    
    /**
     * Is this a proxy charm?
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>proxy</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isProxy();

}

