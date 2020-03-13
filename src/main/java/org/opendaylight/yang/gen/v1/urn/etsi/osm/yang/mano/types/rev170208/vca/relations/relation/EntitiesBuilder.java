package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation;
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
 * Class that builds {@link EntitiesBuilder} instances.
 * 
 * @see EntitiesBuilder
 *
 */
public class EntitiesBuilder implements Builder<Entities> {

    private String _endpoint;
    private String _id;
    private EntitiesKey key;


    Map<Class<? extends Augmentation<Entities>>, Augmentation<Entities>> augmentation = Collections.emptyMap();

    public EntitiesBuilder() {
    }

    public EntitiesBuilder(Entities base) {
        this.key = base.key();
        this._id = base.getId();
        this._endpoint = base.getEndpoint();
        if (base instanceof EntitiesImpl) {
            EntitiesImpl impl = (EntitiesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Entities>>, Augmentation<Entities>> aug =((AugmentationHolder<Entities>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public EntitiesKey key() {
        return key;
    }
    
    public String getEndpoint() {
        return _endpoint;
    }
    
    public String getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Entities>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public EntitiesBuilder withKey(final EntitiesKey key) {
        this.key = key;
        return this;
    }
    
    public EntitiesBuilder setEndpoint(final String value) {
        this._endpoint = value;
        return this;
    }
    
    public EntitiesBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public EntitiesBuilder addAugmentation(Class<? extends Augmentation<Entities>> augmentationType, Augmentation<Entities> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EntitiesBuilder removeAugmentation(Class<? extends Augmentation<Entities>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Entities build() {
        return new EntitiesImpl(this);
    }

    private static final class EntitiesImpl implements Entities {
    
        private final String _endpoint;
        private final String _id;
        private final EntitiesKey key;
    
        private Map<Class<? extends Augmentation<Entities>>, Augmentation<Entities>> augmentation = Collections.emptyMap();
    
        EntitiesImpl(EntitiesBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new EntitiesKey(base.getId());
            }
            this._id = key.getId();
            this._endpoint = base.getEndpoint();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Entities> getImplementedInterface() {
            return Entities.class;
        }
    
        @Override
        public EntitiesKey key() {
            return key;
        }
        
        @Override
        public String getEndpoint() {
            return _endpoint;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Entities>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endpoint);
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
            if (!Entities.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Entities other = (Entities)obj;
            if (!Objects.equals(_endpoint, other.getEndpoint())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EntitiesImpl otherImpl = (EntitiesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Entities>>, Augmentation<Entities>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Entities");
            CodeHelpers.appendValue(helper, "_endpoint", _endpoint);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
