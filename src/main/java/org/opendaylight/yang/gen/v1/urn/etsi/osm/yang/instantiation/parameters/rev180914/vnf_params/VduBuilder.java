package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vdu_params.Volume;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VduBuilder} instances.
 * 
 * @see VduBuilder
 *
 */
public class VduBuilder implements Builder<Vdu> {

    private String _id;
    private List<Interface> _interface;
    private List<Volume> _volume;
    private VduKey key;


    Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }
    public VduBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams arg) {
        this._id = arg.getId();
        this._volume = arg.getVolume();
        this._interface = arg.getInterface();
    }

    public VduBuilder(Vdu base) {
        this.key = base.key();
        this._id = base.getId();
        this._interface = base.getInterface();
        this._volume = base.getVolume();
        if (base instanceof VduImpl) {
            VduImpl impl = (VduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> aug =((AugmentationHolder<Vdu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams)arg).getId();
            this._volume = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams)arg).getVolume();
            this._interface = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams)arg).getInterface();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VduParams]");
    }

    public VduKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<Interface> getInterface() {
        return _interface;
    }
    
    public List<Volume> getVolume() {
        return _volume;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VduBuilder withKey(final VduKey key) {
        this.key = key;
        return this;
    }
    
    public VduBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public VduBuilder setInterface(final List<Interface> values) {
        this._interface = values;
        return this;
    }
    
    public VduBuilder setVolume(final List<Volume> values) {
        this._volume = values;
        return this;
    }
    
    
    public VduBuilder addAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduBuilder removeAugmentation(Class<? extends Augmentation<Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    private static final class VduImpl implements Vdu {
    
        private final String _id;
        private final List<Interface> _interface;
        private final List<Volume> _volume;
        private final VduKey key;
    
        private Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();
    
        VduImpl(VduBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VduKey(base.getId());
            }
            this._id = key.getId();
            this._interface = base.getInterface();
            this._volume = base.getVolume();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Vdu> getImplementedInterface() {
            return Vdu.class;
        }
    
        @Override
        public VduKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<Interface> getInterface() {
            return _interface;
        }
        
        @Override
        public List<Volume> getVolume() {
            return _volume;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_volume);
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
            if (!Vdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vdu other = (Vdu)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_volume, other.getVolume())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdu");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_interface", _interface);
            CodeHelpers.appendValue(helper, "_volume", _volume);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
