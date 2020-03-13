package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.classifier.common.MatchAttributes;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ClassifierBuilder} instances.
 * 
 * @see ClassifierBuilder
 *
 */
public class ClassifierBuilder implements Builder<Classifier> {

    private String _id;
    private List<MatchAttributes> _matchAttributes;
    private String _memberVnfIndexRef;
    private String _name;
    private String _rspIdRef;
    private String _vnfdConnectionPointRef;
    private Object _vnfdIdRef;
    private ClassifierKey key;


    Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }
    public ClassifierBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._rspIdRef = arg.getRspIdRef();
        this._matchAttributes = arg.getMatchAttributes();
    }

    public ClassifierBuilder(Classifier base) {
        this.key = base.key();
        this._id = base.getId();
        this._matchAttributes = base.getMatchAttributes();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._name = base.getName();
        this._rspIdRef = base.getRspIdRef();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof ClassifierImpl) {
            ClassifierImpl impl = (ClassifierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> aug =((AugmentationHolder<Classifier>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getName();
            this._rspIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getRspIdRef();
            this._matchAttributes = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon)arg).getMatchAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.ClassifierCommon]");
    }

    public ClassifierKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<MatchAttributes> getMatchAttributes() {
        return _matchAttributes;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getRspIdRef() {
        return _rspIdRef;
    }
    
    public String getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Classifier>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ClassifierBuilder withKey(final ClassifierKey key) {
        this.key = key;
        return this;
    }
    
    public ClassifierBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public ClassifierBuilder setMatchAttributes(final List<MatchAttributes> values) {
        this._matchAttributes = values;
        return this;
    }
    
    
    public ClassifierBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public ClassifierBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ClassifierBuilder setRspIdRef(final String value) {
        this._rspIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfdConnectionPointRef(final String value) {
        this._vnfdConnectionPointRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public ClassifierBuilder addAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ClassifierBuilder removeAugmentation(Class<? extends Augmentation<Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl implements Classifier {
    
        private final String _id;
        private final List<MatchAttributes> _matchAttributes;
        private final String _memberVnfIndexRef;
        private final String _name;
        private final String _rspIdRef;
        private final String _vnfdConnectionPointRef;
        private final Object _vnfdIdRef;
        private final ClassifierKey key;
    
        private Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();
    
        ClassifierImpl(ClassifierBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ClassifierKey(base.getId());
            }
            this._id = key.getId();
            this._matchAttributes = base.getMatchAttributes();
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._name = base.getName();
            this._rspIdRef = base.getRspIdRef();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Classifier> getImplementedInterface() {
            return Classifier.class;
        }
    
        @Override
        public ClassifierKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<MatchAttributes> getMatchAttributes() {
            return _matchAttributes;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public String getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Classifier>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_matchAttributes);
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!Classifier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Classifier other = (Classifier)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_matchAttributes, other.getMatchAttributes())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Classifier");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_matchAttributes", _matchAttributes);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rspIdRef", _rspIdRef);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
