package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.math.BigInteger;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping allocation-properties {
 *   leaf limit {
 *     type uint64;
 *   }
 *   leaf reserve {
 *     type uint64;
 *   }
 *   leaf shares {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/allocation-properties</i>
 *
 */
public interface AllocationProperties
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("allocation-properties");

    /**
     * Defines the maximum allocation. The value 0 indicates that usage is not 
     * limited.This parameter ensures that the instance never uses more than the 
     * defined amount of resource.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>limit</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getLimit();
    
    /**
     * Defines the guaranteed minimum reservation.If needed, the machine will 
     * definitely get allocated the reserved amount of resources.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>reserve</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getReserve();
    
    /**
     * Number of shares allocated.Specifies the proportional weighted share for the 
     * domain.If this element is omitted, the service defaults to the OS provided 
     * defaults
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>shares</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getShares();

}

