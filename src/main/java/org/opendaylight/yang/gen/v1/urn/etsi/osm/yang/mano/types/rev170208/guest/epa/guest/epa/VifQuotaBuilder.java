package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VifQuotaBuilder} instances.
 * 
 * @see VifQuotaBuilder
 *
 */
public class VifQuotaBuilder implements Builder<VifQuota> {

    private BigInteger _limit;
    private BigInteger _reserve;
    private BigInteger _shares;


    Map<Class<? extends Augmentation<VifQuota>>, Augmentation<VifQuota>> augmentation = Collections.emptyMap();

    public VifQuotaBuilder() {
    }
    public VifQuotaBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties arg) {
        this._limit = arg.getLimit();
        this._reserve = arg.getReserve();
        this._shares = arg.getShares();
    }

    public VifQuotaBuilder(VifQuota base) {
        this._limit = base.getLimit();
        this._reserve = base.getReserve();
        this._shares = base.getShares();
        if (base instanceof VifQuotaImpl) {
            VifQuotaImpl impl = (VifQuotaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VifQuota>>, Augmentation<VifQuota>> aug =((AugmentationHolder<VifQuota>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties) {
            this._limit = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getLimit();
            this._reserve = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getReserve();
            this._shares = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties)arg).getShares();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AllocationProperties]");
    }

    public BigInteger getLimit() {
        return _limit;
    }
    
    public BigInteger getReserve() {
        return _reserve;
    }
    
    public BigInteger getShares() {
        return _shares;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VifQuota>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static final Range<java.math.BigInteger>[] CHECKLIMITRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKLIMITRANGE_RANGES = a;
    }
    private static void checkLimitRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKLIMITRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKLIMITRANGE_RANGES, value);
    }
    
    public VifQuotaBuilder setLimit(final BigInteger value) {
    if (value != null) {
        checkLimitRange(value);
        
    }
        this._limit = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKRESERVERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKRESERVERANGE_RANGES = a;
    }
    private static void checkReserveRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKRESERVERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKRESERVERANGE_RANGES, value);
    }
    
    public VifQuotaBuilder setReserve(final BigInteger value) {
    if (value != null) {
        checkReserveRange(value);
        
    }
        this._reserve = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSHARESRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSHARESRANGE_RANGES = a;
    }
    private static void checkSharesRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSHARESRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSHARESRANGE_RANGES, value);
    }
    
    public VifQuotaBuilder setShares(final BigInteger value) {
    if (value != null) {
        checkSharesRange(value);
        
    }
        this._shares = value;
        return this;
    }
    
    public VifQuotaBuilder addAugmentation(Class<? extends Augmentation<VifQuota>> augmentationType, Augmentation<VifQuota> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VifQuotaBuilder removeAugmentation(Class<? extends Augmentation<VifQuota>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VifQuota build() {
        return new VifQuotaImpl(this);
    }

    private static final class VifQuotaImpl implements VifQuota {
    
        private final BigInteger _limit;
        private final BigInteger _reserve;
        private final BigInteger _shares;
    
        private Map<Class<? extends Augmentation<VifQuota>>, Augmentation<VifQuota>> augmentation = Collections.emptyMap();
    
        VifQuotaImpl(VifQuotaBuilder base) {
            this._limit = base.getLimit();
            this._reserve = base.getReserve();
            this._shares = base.getShares();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VifQuota> getImplementedInterface() {
            return VifQuota.class;
        }
    
        @Override
        public BigInteger getLimit() {
            return _limit;
        }
        
        @Override
        public BigInteger getReserve() {
            return _reserve;
        }
        
        @Override
        public BigInteger getShares() {
            return _shares;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VifQuota>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_limit);
            result = prime * result + Objects.hashCode(_reserve);
            result = prime * result + Objects.hashCode(_shares);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!VifQuota.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VifQuota other = (VifQuota)obj;
            if (!Objects.equals(_limit, other.getLimit())) {
                return false;
            }
            if (!Objects.equals(_reserve, other.getReserve())) {
                return false;
            }
            if (!Objects.equals(_shares, other.getShares())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VifQuotaImpl otherImpl = (VifQuotaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VifQuota>>, Augmentation<VifQuota>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VifQuota");
            CodeHelpers.appendValue(helper, "_limit", _limit);
            CodeHelpers.appendValue(helper, "_reserve", _reserve);
            CodeHelpers.appendValue(helper, "_shares", _shares);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
