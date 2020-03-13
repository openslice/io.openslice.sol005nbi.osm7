package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params;
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
 * Class that builds {@link VolumeBuilder} instances.
 * 
 * @see VolumeBuilder
 *
 */
public class VolumeBuilder implements Builder<Volume> {

    private String _name;
    private String _vimVolumeId;
    private VolumeKey key;


    Map<Class<? extends Augmentation<Volume>>, Augmentation<Volume>> augmentation = Collections.emptyMap();

    public VolumeBuilder() {
    }

    public VolumeBuilder(Volume base) {
        this.key = base.key();
        this._name = base.getName();
        this._vimVolumeId = base.getVimVolumeId();
        if (base instanceof VolumeImpl) {
            VolumeImpl impl = (VolumeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Volume>>, Augmentation<Volume>> aug =((AugmentationHolder<Volume>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VolumeKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getVimVolumeId() {
        return _vimVolumeId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Volume>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VolumeBuilder withKey(final VolumeKey key) {
        this.key = key;
        return this;
    }
    
    public VolumeBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VolumeBuilder setVimVolumeId(final String value) {
        this._vimVolumeId = value;
        return this;
    }
    
    public VolumeBuilder addAugmentation(Class<? extends Augmentation<Volume>> augmentationType, Augmentation<Volume> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VolumeBuilder removeAugmentation(Class<? extends Augmentation<Volume>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Volume build() {
        return new VolumeImpl(this);
    }

    private static final class VolumeImpl implements Volume {
    
        private final String _name;
        private final String _vimVolumeId;
        private final VolumeKey key;
    
        private Map<Class<? extends Augmentation<Volume>>, Augmentation<Volume>> augmentation = Collections.emptyMap();
    
        VolumeImpl(VolumeBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VolumeKey(base.getName());
            }
            this._name = key.getName();
            this._vimVolumeId = base.getVimVolumeId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Volume> getImplementedInterface() {
            return Volume.class;
        }
    
        @Override
        public VolumeKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getVimVolumeId() {
            return _vimVolumeId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Volume>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vimVolumeId);
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
            if (!Volume.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Volume other = (Volume)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vimVolumeId, other.getVimVolumeId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VolumeImpl otherImpl = (VolumeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Volume>>, Augmentation<Volume>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Volume");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_vimVolumeId", _vimVolumeId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
