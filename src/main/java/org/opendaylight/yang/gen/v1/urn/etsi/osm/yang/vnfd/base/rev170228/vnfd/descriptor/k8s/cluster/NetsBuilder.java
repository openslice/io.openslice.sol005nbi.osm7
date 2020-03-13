package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.k8s.cluster;
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
 * Class that builds {@link NetsBuilder} instances.
 * 
 * @see NetsBuilder
 *
 */
public class NetsBuilder implements Builder<Nets> {

    private String _externalConnectionPointRef;
    private String _id;
    private NetsKey key;


    Map<Class<? extends Augmentation<Nets>>, Augmentation<Nets>> augmentation = Collections.emptyMap();

    public NetsBuilder() {
    }

    public NetsBuilder(Nets base) {
        this.key = base.key();
        this._id = base.getId();
        this._externalConnectionPointRef = base.getExternalConnectionPointRef();
        if (base instanceof NetsImpl) {
            NetsImpl impl = (NetsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nets>>, Augmentation<Nets>> aug =((AugmentationHolder<Nets>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NetsKey key() {
        return key;
    }
    
    public String getExternalConnectionPointRef() {
        return _externalConnectionPointRef;
    }
    
    public String getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Nets>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsBuilder withKey(final NetsKey key) {
        this.key = key;
        return this;
    }
    
    public NetsBuilder setExternalConnectionPointRef(final String value) {
        this._externalConnectionPointRef = value;
        return this;
    }
    
    public NetsBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetsBuilder addAugmentation(Class<? extends Augmentation<Nets>> augmentationType, Augmentation<Nets> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsBuilder removeAugmentation(Class<? extends Augmentation<Nets>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nets build() {
        return new NetsImpl(this);
    }

    private static final class NetsImpl implements Nets {
    
        private final String _externalConnectionPointRef;
        private final String _id;
        private final NetsKey key;
    
        private Map<Class<? extends Augmentation<Nets>>, Augmentation<Nets>> augmentation = Collections.emptyMap();
    
        NetsImpl(NetsBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsKey(base.getId());
            }
            this._id = key.getId();
            this._externalConnectionPointRef = base.getExternalConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Nets> getImplementedInterface() {
            return Nets.class;
        }
    
        @Override
        public NetsKey key() {
            return key;
        }
        
        @Override
        public String getExternalConnectionPointRef() {
            return _externalConnectionPointRef;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Nets>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_externalConnectionPointRef);
            result = prime * result + Objects.hashCode(_id);
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
            if (!Nets.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Nets other = (Nets)obj;
            if (!Objects.equals(_externalConnectionPointRef, other.getExternalConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsImpl otherImpl = (NetsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nets>>, Augmentation<Nets>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nets");
            CodeHelpers.appendValue(helper, "_externalConnectionPointRef", _externalConnectionPointRef);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
