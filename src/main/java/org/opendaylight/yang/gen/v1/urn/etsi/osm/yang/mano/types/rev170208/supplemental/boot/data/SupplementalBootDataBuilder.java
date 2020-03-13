package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.supplemental.boot.data;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
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
 * Class that builds {@link SupplementalBootDataBuilder} instances.
 * 
 * @see SupplementalBootDataBuilder
 *
 */
public class SupplementalBootDataBuilder implements Builder<SupplementalBootData> {

    private Boolean _bootDataDrive;


    Map<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> augmentation = Collections.emptyMap();

    public SupplementalBootDataBuilder() {
    }

    public SupplementalBootDataBuilder(SupplementalBootData base) {
        this._bootDataDrive = base.isBootDataDrive();
        if (base instanceof SupplementalBootDataImpl) {
            SupplementalBootDataImpl impl = (SupplementalBootDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> aug =((AugmentationHolder<SupplementalBootData>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Boolean isBootDataDrive() {
        return _bootDataDrive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupplementalBootData>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public SupplementalBootDataBuilder setBootDataDrive(final Boolean value) {
        this._bootDataDrive = value;
        return this;
    }
    
    public SupplementalBootDataBuilder addAugmentation(Class<? extends Augmentation<SupplementalBootData>> augmentationType, Augmentation<SupplementalBootData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupplementalBootDataBuilder removeAugmentation(Class<? extends Augmentation<SupplementalBootData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupplementalBootData build() {
        return new SupplementalBootDataImpl(this);
    }

    private static final class SupplementalBootDataImpl implements SupplementalBootData {
    
        private final Boolean _bootDataDrive;
    
        private Map<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> augmentation = Collections.emptyMap();
    
        SupplementalBootDataImpl(SupplementalBootDataBuilder base) {
            this._bootDataDrive = base.isBootDataDrive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SupplementalBootData> getImplementedInterface() {
            return SupplementalBootData.class;
        }
    
        @Override
        public Boolean isBootDataDrive() {
            return _bootDataDrive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupplementalBootData>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bootDataDrive);
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
            if (!SupplementalBootData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupplementalBootData other = (SupplementalBootData)obj;
            if (!Objects.equals(_bootDataDrive, other.isBootDataDrive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupplementalBootDataImpl otherImpl = (SupplementalBootDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupplementalBootData");
            CodeHelpers.appendValue(helper, "_bootDataDrive", _bootDataDrive);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
