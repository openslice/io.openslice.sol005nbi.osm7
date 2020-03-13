package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.init.params;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.InitParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vim-network-profile {
 *   leaf ip-profile-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-vld-common/init-params/vim-network-profile</i>
 *
 */
public interface VimNetworkProfile
    extends
    DataObject,
    Augmentable<VimNetworkProfile>,
    InitParams
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vim-network-profile");

    /**
     * Named reference to IP-profile object
     *
     *
     *
     * @return <code>java.lang.String</code> <code>ipProfileRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getIpProfileRef();

}

