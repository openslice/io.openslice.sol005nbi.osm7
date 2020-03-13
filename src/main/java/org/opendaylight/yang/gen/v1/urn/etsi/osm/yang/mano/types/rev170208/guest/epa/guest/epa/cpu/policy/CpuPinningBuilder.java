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
 * Class that builds {@link CpuPinningBuilder} instances.
 * 
 * @see CpuPinningBuilder
 *
 */
public class CpuPinningBuilder implements Builder<CpuPinning> {

    private CpuPinning.CpuPinningPolicy _cpuPinningPolicy;
    private CpuPinning.CpuThreadPinningPolicy _cpuThreadPinningPolicy;


    Map<Class<? extends Augmentation<CpuPinning>>, Augmentation<CpuPinning>> augmentation = Collections.emptyMap();

    public CpuPinningBuilder() {
    }

    public CpuPinningBuilder(CpuPinning base) {
        this._cpuPinningPolicy = base.getCpuPinningPolicy();
        this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
        if (base instanceof CpuPinningImpl) {
            CpuPinningImpl impl = (CpuPinningImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CpuPinning>>, Augmentation<CpuPinning>> aug =((AugmentationHolder<CpuPinning>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public CpuPinning.CpuPinningPolicy getCpuPinningPolicy() {
        return _cpuPinningPolicy;
    }
    
    public CpuPinning.CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
        return _cpuThreadPinningPolicy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CpuPinning>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CpuPinningBuilder setCpuPinningPolicy(final CpuPinning.CpuPinningPolicy value) {
        this._cpuPinningPolicy = value;
        return this;
    }
    
    public CpuPinningBuilder setCpuThreadPinningPolicy(final CpuPinning.CpuThreadPinningPolicy value) {
        this._cpuThreadPinningPolicy = value;
        return this;
    }
    
    public CpuPinningBuilder addAugmentation(Class<? extends Augmentation<CpuPinning>> augmentationType, Augmentation<CpuPinning> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpuPinningBuilder removeAugmentation(Class<? extends Augmentation<CpuPinning>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CpuPinning build() {
        return new CpuPinningImpl(this);
    }

    private static final class CpuPinningImpl implements CpuPinning {
    
        private final CpuPinning.CpuPinningPolicy _cpuPinningPolicy;
        private final CpuPinning.CpuThreadPinningPolicy _cpuThreadPinningPolicy;
    
        private Map<Class<? extends Augmentation<CpuPinning>>, Augmentation<CpuPinning>> augmentation = Collections.emptyMap();
    
        CpuPinningImpl(CpuPinningBuilder base) {
            this._cpuPinningPolicy = base.getCpuPinningPolicy();
            this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CpuPinning> getImplementedInterface() {
            return CpuPinning.class;
        }
    
        @Override
        public CpuPinning.CpuPinningPolicy getCpuPinningPolicy() {
            return _cpuPinningPolicy;
        }
        
        @Override
        public CpuPinning.CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
            return _cpuThreadPinningPolicy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CpuPinning>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuPinningPolicy);
            result = prime * result + Objects.hashCode(_cpuThreadPinningPolicy);
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
            if (!CpuPinning.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CpuPinning other = (CpuPinning)obj;
            if (!Objects.equals(_cpuPinningPolicy, other.getCpuPinningPolicy())) {
                return false;
            }
            if (!Objects.equals(_cpuThreadPinningPolicy, other.getCpuThreadPinningPolicy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpuPinningImpl otherImpl = (CpuPinningImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CpuPinning>>, Augmentation<CpuPinning>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CpuPinning");
            CodeHelpers.appendValue(helper, "_cpuPinningPolicy", _cpuPinningPolicy);
            CodeHelpers.appendValue(helper, "_cpuThreadPinningPolicy", _cpuThreadPinningPolicy);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
