package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.lang.Integer;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping five-qi {
 *   leaf id {
 *     type uint16;
 *   }
 *   leaf resource-type {
 *     type resource-type;
 *   }
 *   leaf priority-level {
 *     type uint16;
 *   }
 *   leaf packet-delay-budget {
 *     type uint16;
 *   }
 *   leaf packet-error-rate {
 *     type uint16;
 *   }
 *   leaf default-max-data-burst {
 *     type uint16;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/five-qi</i>
 *
 */
public interface FiveQi
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("five-qi");

    /**
     * Quality of service identifier
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getId();
    
    /**
     * Quality of service resource type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.ResourceType</code> <code>resourceType</code>, or <code>null</code> if not present
     */
    @Nullable
    ResourceType getResourceType();
    
    /**
     * Priority level of the service
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>priorityLevel</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getPriorityLevel();
    
    /**
     * Packet delay budget in miliseconds (ms)
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>packetDelayBudget</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getPacketDelayBudget();
    
    /**
     * Packet error rate (PER) given in powers of ten
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>packetErrorRate</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getPacketErrorRate();
    
    /**
     * Maximum data burst given in bytes (B)
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>defaultMaxDataBurst</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getDefaultMaxDataBurst();

}

