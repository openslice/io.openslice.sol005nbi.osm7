package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.placement.groups;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VNFDs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list member-vnfd {
 *   key member-vnf-index-ref;
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-placement-groups/placement-groups/member-vnfd</i>
 * 
 * <p>To create instances of this class use {@link MemberVnfdBuilder}.
 * @see MemberVnfdBuilder
 * @see MemberVnfdKey
 *
 */
public interface MemberVnfd
    extends
    ChildOf<PlacementGroups>,
    Augmentable<MemberVnfd>,
    Identifiable<MemberVnfdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("member-vnfd");

    /**
     * Member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    @Override
    MemberVnfdKey key();

}

