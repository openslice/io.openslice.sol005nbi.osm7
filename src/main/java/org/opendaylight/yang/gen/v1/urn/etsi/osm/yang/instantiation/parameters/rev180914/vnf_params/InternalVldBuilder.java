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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params.IpProfile;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InternalVldBuilder} instances.
 * 
 * @see InternalVldBuilder
 *
 */
public class InternalVldBuilder implements Builder<InternalVld> {

    private List<InternalConnectionPoint> _internalConnectionPoint;
    private IpProfile _ipProfile;
    private String _name;
    private String _vimNetworkName;
    private InternalVldKey key;


    Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> augmentation = Collections.emptyMap();

    public InternalVldBuilder() {
    }
    public InternalVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams arg) {
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
        this._internalConnectionPoint = arg.getInternalConnectionPoint();
    }

    public InternalVldBuilder(InternalVld base) {
        this.key = base.key();
        this._name = base.getName();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._ipProfile = base.getIpProfile();
        this._vimNetworkName = base.getVimNetworkName();
        if (base instanceof InternalVldImpl) {
            InternalVldImpl impl = (InternalVldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> aug =((AugmentationHolder<InternalVld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams)arg).getName();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams)arg).getVimNetworkName();
            this._ipProfile = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams)arg).getIpProfile();
            this._internalConnectionPoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams)arg).getInternalConnectionPoint();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.InternalVldParams]");
    }

    public InternalVldKey key() {
        return key;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public IpProfile getIpProfile() {
        return _ipProfile;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InternalVld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InternalVldBuilder withKey(final InternalVldKey key) {
        this.key = key;
        return this;
    }
    public InternalVldBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
        return this;
    }
    
    
    public InternalVldBuilder setIpProfile(final IpProfile value) {
        this._ipProfile = value;
        return this;
    }
    
    public InternalVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InternalVldBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public InternalVldBuilder addAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType, Augmentation<InternalVld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalVldBuilder removeAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalVld build() {
        return new InternalVldImpl(this);
    }

    private static final class InternalVldImpl implements InternalVld {
    
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final IpProfile _ipProfile;
        private final String _name;
        private final String _vimNetworkName;
        private final InternalVldKey key;
    
        private Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> augmentation = Collections.emptyMap();
    
        InternalVldImpl(InternalVldBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InternalVldKey(base.getName());
            }
            this._name = key.getName();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._ipProfile = base.getIpProfile();
            this._vimNetworkName = base.getVimNetworkName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<InternalVld> getImplementedInterface() {
            return InternalVld.class;
        }
    
        @Override
        public InternalVldKey key() {
            return key;
        }
        
        @Override
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public IpProfile getIpProfile() {
            return _ipProfile;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InternalVld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_ipProfile);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vimNetworkName);
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
            if (!InternalVld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InternalVld other = (InternalVld)obj;
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_ipProfile, other.getIpProfile())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVldImpl otherImpl = (InternalVldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalVld");
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_ipProfile", _ipProfile);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
