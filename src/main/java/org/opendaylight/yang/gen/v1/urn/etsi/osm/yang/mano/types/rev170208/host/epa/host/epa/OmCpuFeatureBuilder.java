package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa;
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
 * Class that builds {@link OmCpuFeatureBuilder} instances.
 * 
 * @see OmCpuFeatureBuilder
 *
 */
public class OmCpuFeatureBuilder implements Builder<OmCpuFeature> {

    private String _feature;
    private OmCpuFeatureKey key;


    Map<Class<? extends Augmentation<OmCpuFeature>>, Augmentation<OmCpuFeature>> augmentation = Collections.emptyMap();

    public OmCpuFeatureBuilder() {
    }

    public OmCpuFeatureBuilder(OmCpuFeature base) {
        this.key = base.key();
        this._feature = base.getFeature();
        if (base instanceof OmCpuFeatureImpl) {
            OmCpuFeatureImpl impl = (OmCpuFeatureImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<OmCpuFeature>>, Augmentation<OmCpuFeature>> aug =((AugmentationHolder<OmCpuFeature>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public OmCpuFeatureKey key() {
        return key;
    }
    
    public String getFeature() {
        return _feature;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<OmCpuFeature>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public OmCpuFeatureBuilder withKey(final OmCpuFeatureKey key) {
        this.key = key;
        return this;
    }
    
    public OmCpuFeatureBuilder setFeature(final String value) {
        this._feature = value;
        return this;
    }
    
    public OmCpuFeatureBuilder addAugmentation(Class<? extends Augmentation<OmCpuFeature>> augmentationType, Augmentation<OmCpuFeature> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OmCpuFeatureBuilder removeAugmentation(Class<? extends Augmentation<OmCpuFeature>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public OmCpuFeature build() {
        return new OmCpuFeatureImpl(this);
    }

    private static final class OmCpuFeatureImpl implements OmCpuFeature {
    
        private final String _feature;
        private final OmCpuFeatureKey key;
    
        private Map<Class<? extends Augmentation<OmCpuFeature>>, Augmentation<OmCpuFeature>> augmentation = Collections.emptyMap();
    
        OmCpuFeatureImpl(OmCpuFeatureBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new OmCpuFeatureKey(base.getFeature());
            }
            this._feature = key.getFeature();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<OmCpuFeature> getImplementedInterface() {
            return OmCpuFeature.class;
        }
    
        @Override
        public OmCpuFeatureKey key() {
            return key;
        }
        
        @Override
        public String getFeature() {
            return _feature;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<OmCpuFeature>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_feature);
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
            if (!OmCpuFeature.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            OmCpuFeature other = (OmCpuFeature)obj;
            if (!Objects.equals(_feature, other.getFeature())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OmCpuFeatureImpl otherImpl = (OmCpuFeatureImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<OmCpuFeature>>, Augmentation<OmCpuFeature>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("OmCpuFeature");
            CodeHelpers.appendValue(helper, "_feature", _feature);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
