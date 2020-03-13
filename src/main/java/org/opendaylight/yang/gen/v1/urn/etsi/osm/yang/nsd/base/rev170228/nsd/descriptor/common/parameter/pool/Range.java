package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.parameter.pool;
import java.lang.Long;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.ParameterPool;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Create a range of values to populate the pool with
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * container range {
 *   leaf start-value {
 *     type uint32;
 *   }
 *   leaf end-value {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool/range</i>
 * 
 * <p>To create instances of this class use {@link RangeBuilder}.
 * @see RangeBuilder
 *
 */
public interface Range
    extends
    ChildOf<ParameterPool>,
    Augmentable<Range>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("range");

    /**
     * Generated pool values start at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>startValue</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getStartValue();
    
    /**
     * Generated pool values stop at this value
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>endValue</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getEndValue();

}

