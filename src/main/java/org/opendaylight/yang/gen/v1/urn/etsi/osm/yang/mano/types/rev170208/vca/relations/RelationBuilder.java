package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation.Entities;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link RelationBuilder} instances.
 * 
 * @see RelationBuilder
 *
 */
public class RelationBuilder implements Builder<Relation> {

    private List<Entities> _entities;
    private String _name;
    private RelationKey key;


    Map<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> augmentation = Collections.emptyMap();

    public RelationBuilder() {
    }

    public RelationBuilder(Relation base) {
        this.key = base.key();
        this._name = base.getName();
        this._entities = base.getEntities();
        if (base instanceof RelationImpl) {
            RelationImpl impl = (RelationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> aug =((AugmentationHolder<Relation>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public RelationKey key() {
        return key;
    }
    
    public List<Entities> getEntities() {
        return _entities;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Relation>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public RelationBuilder withKey(final RelationKey key) {
        this.key = key;
        return this;
    }
    public RelationBuilder setEntities(final List<Entities> values) {
        this._entities = values;
        return this;
    }
    
    
    public RelationBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public RelationBuilder addAugmentation(Class<? extends Augmentation<Relation>> augmentationType, Augmentation<Relation> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RelationBuilder removeAugmentation(Class<? extends Augmentation<Relation>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Relation build() {
        return new RelationImpl(this);
    }

    private static final class RelationImpl implements Relation {
    
        private final List<Entities> _entities;
        private final String _name;
        private final RelationKey key;
    
        private Map<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> augmentation = Collections.emptyMap();
    
        RelationImpl(RelationBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new RelationKey(base.getName());
            }
            this._name = key.getName();
            this._entities = base.getEntities();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Relation> getImplementedInterface() {
            return Relation.class;
        }
    
        @Override
        public RelationKey key() {
            return key;
        }
        
        @Override
        public List<Entities> getEntities() {
            return _entities;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Relation>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_entities);
            result = prime * result + Objects.hashCode(_name);
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
            if (!Relation.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Relation other = (Relation)obj;
            if (!Objects.equals(_entities, other.getEntities())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RelationImpl otherImpl = (RelationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Relation");
            CodeHelpers.appendValue(helper, "_entities", _entities);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
