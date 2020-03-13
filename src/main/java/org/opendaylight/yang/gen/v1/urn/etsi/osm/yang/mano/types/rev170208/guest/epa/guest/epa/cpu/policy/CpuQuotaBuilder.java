package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
 * Class that builds {@link CpuQuotaBuilder} instances.
 * 
 * @see CpuQuotaBuilder
 *
 */
public class CpuQuotaBuilder implements Builder<CpuQuota> {

    private org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota _cpuQuota;


    Map<Class<? extends Augmentation<CpuQuota>>, Augmentation<CpuQuota>> augmentation = Collections.emptyMap();

    public CpuQuotaBuilder() {
    }

    public CpuQuotaBuilder(CpuQuota base) {
        this._cpuQuota = base.getCpuQuota();
        if (base instanceof CpuQuotaImpl) {
            CpuQuotaImpl impl = (CpuQuotaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CpuQuota>>, Augmentation<CpuQuota>> aug =((AugmentationHolder<CpuQuota>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota getCpuQuota() {
        return _cpuQuota;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CpuQuota>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CpuQuotaBuilder setCpuQuota(final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota value) {
        this._cpuQuota = value;
        return this;
    }
    
    public CpuQuotaBuilder addAugmentation(Class<? extends Augmentation<CpuQuota>> augmentationType, Augmentation<CpuQuota> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpuQuotaBuilder removeAugmentation(Class<? extends Augmentation<CpuQuota>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CpuQuota build() {
        return new CpuQuotaImpl(this);
    }

    private static final class CpuQuotaImpl implements CpuQuota {
    
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota _cpuQuota;
    
        private Map<Class<? extends Augmentation<CpuQuota>>, Augmentation<CpuQuota>> augmentation = Collections.emptyMap();
    
        CpuQuotaImpl(CpuQuotaBuilder base) {
            this._cpuQuota = base.getCpuQuota();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CpuQuota> getImplementedInterface() {
            return CpuQuota.class;
        }
    
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.cpu.policy.cpu.quota.CpuQuota getCpuQuota() {
            return _cpuQuota;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CpuQuota>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuQuota);
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
            if (!CpuQuota.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CpuQuota other = (CpuQuota)obj;
            if (!Objects.equals(_cpuQuota, other.getCpuQuota())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpuQuotaImpl otherImpl = (CpuQuotaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CpuQuota>>, Augmentation<CpuQuota>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CpuQuota");
            CodeHelpers.appendValue(helper, "_cpuQuota", _cpuQuota);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
