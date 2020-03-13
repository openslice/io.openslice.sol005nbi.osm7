package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access.SshAccess;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates the way to access to the xNF or xDU for VCA configuration.For the 
 * moment there is a single way (ssh-access).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container config-access {
 *   container ssh-access {
 *     leaf required {
 *       type boolean;
 *       default false;
 *     }
 *     leaf default-user {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-config-access/config-access</i>
 * 
 * <p>To create instances of this class use {@link ConfigAccessBuilder}.
 * @see ConfigAccessBuilder
 *
 */
public interface ConfigAccess
    extends
    ChildOf<VcaConfigAccess>,
    Augmentable<ConfigAccess>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-access");

    /**
     * If the xNF requires ssh and this parameter is set, SSH keyswill be injected so 
     * that VCA can configure the xNF or xDU via ssh.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access.SshAccess</code> <code>sshAccess</code>, or <code>null</code> if not present
     */
    @Nullable
    SshAccess getSshAccess();

}

