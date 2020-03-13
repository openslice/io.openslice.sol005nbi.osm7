package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.scaling.group.descriptor;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.ScalingGroupDescriptor;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of VDUs in this scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu {
 *   key vdu-id-ref;
 *   leaf vdu-id-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 *   leaf count {
 *     type uint32;
 *     default 1;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/scaling-group-descriptor/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
public interface Vdu
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<Vdu>,
    Identifiable<VduKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    /**
     * Reference to the VDU id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduIdRef();
    
    /**
     * count of this VDU id within this scaling group.The count allows to define the 
     * number of instanceswhen a scaling action targets this scaling group
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCount();
    
    @Override
    VduKey key();

}

