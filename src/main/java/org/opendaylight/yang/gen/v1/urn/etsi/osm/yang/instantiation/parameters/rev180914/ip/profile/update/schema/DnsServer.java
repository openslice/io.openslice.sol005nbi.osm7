package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema;
import java.lang.Override;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list dns-server {
 *   key address;
 *   leaf address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ip-profile-update-schema/dns-server</i>
 * 
 * <p>To create instances of this class use {@link DnsServerBuilder}.
 * @see DnsServerBuilder
 * @see DnsServerKey
 *
 */
public interface DnsServer
    extends
    ChildOf<IpProfileUpdateSchema>,
    Augmentable<DnsServer>,
    Identifiable<DnsServerKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dns-server");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getAddress();
    
    @Override
    DnsServerKey key();

}

