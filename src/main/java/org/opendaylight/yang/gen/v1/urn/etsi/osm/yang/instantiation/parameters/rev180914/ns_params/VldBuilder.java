package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_common_params.IpProfile;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vld_params.VnfdConnectionPointRef;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VldBuilder} instances.
 * 
 * @see VldBuilder
 *
 */
public class VldBuilder implements Builder<Vld> {

    private IpProfile _ipProfile;
    private String _name;
    private String _vimNetworkName;
    private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
    private VldKey key;


    Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> augmentation = Collections.emptyMap();

    public VldBuilder() {
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams arg) {
        this._vnfdConnectionPointRef = arg.getVnfdConnectionPointRef();
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }
    public VldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams arg) {
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }

    public VldBuilder(Vld base) {
        this.key = base.key();
        this._name = base.getName();
        this._ipProfile = base.getIpProfile();
        this._vimNetworkName = base.getVimNetworkName();
        this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
        if (base instanceof VldImpl) {
            VldImpl impl = (VldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> aug =((AugmentationHolder<Vld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams) {
            this._vnfdConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams)arg).getVnfdConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getName();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getVimNetworkName();
            this._ipProfile = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getIpProfile();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldParams, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams]");
    }

    public VldKey key() {
        return key;
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
    
    public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VldBuilder withKey(final VldKey key) {
        this.key = key;
        return this;
    }
    
    public VldBuilder setIpProfile(final IpProfile value) {
        this._ipProfile = value;
        return this;
    }
    
    public VldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VldBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    public VldBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> values) {
        this._vnfdConnectionPointRef = values;
        return this;
    }
    
    
    public VldBuilder addAugmentation(Class<? extends Augmentation<Vld>> augmentationType, Augmentation<Vld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldBuilder removeAugmentation(Class<? extends Augmentation<Vld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vld build() {
        return new VldImpl(this);
    }

    private static final class VldImpl implements Vld {
    
        private final IpProfile _ipProfile;
        private final String _name;
        private final String _vimNetworkName;
        private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
        private final VldKey key;
    
        private Map<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> augmentation = Collections.emptyMap();
    
        VldImpl(VldBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VldKey(base.getName());
            }
            this._name = key.getName();
            this._ipProfile = base.getIpProfile();
            this._vimNetworkName = base.getVimNetworkName();
            this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Vld> getImplementedInterface() {
            return Vld.class;
        }
    
        @Override
        public VldKey key() {
            return key;
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
        
        @Override
        public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
            return _vnfdConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ipProfile);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
            if (!Vld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vld other = (Vld)obj;
            if (!Objects.equals(_ipProfile, other.getIpProfile())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldImpl otherImpl = (VldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vld>>, Augmentation<Vld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vld");
            CodeHelpers.appendValue(helper, "_ipProfile", _ipProfile);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
