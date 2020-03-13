package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.netslice_vld_params.NssConnectionPointRef;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceVldBuilder} instances.
 * 
 * @see NetsliceVldBuilder
 *
 */
public class NetsliceVldBuilder implements Builder<NetsliceVld> {

    private IpProfile _ipProfile;
    private String _name;
    private List<NssConnectionPointRef> _nssConnectionPointRef;
    private String _vimNetworkName;
    private NetsliceVldKey key;


    Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();

    public NetsliceVldBuilder() {
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams arg) {
        this._nssConnectionPointRef = arg.getNssConnectionPointRef();
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams arg) {
        this._name = arg.getName();
        this._vimNetworkName = arg.getVimNetworkName();
        this._ipProfile = arg.getIpProfile();
    }

    public NetsliceVldBuilder(NetsliceVld base) {
        this.key = base.key();
        this._name = base.getName();
        this._ipProfile = base.getIpProfile();
        this._nssConnectionPointRef = base.getNssConnectionPointRef();
        this._vimNetworkName = base.getVimNetworkName();
        if (base instanceof NetsliceVldImpl) {
            NetsliceVldImpl impl = (NetsliceVldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> aug =((AugmentationHolder<NetsliceVld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams) {
            this._nssConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams)arg).getNssConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getName();
            this._vimNetworkName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getVimNetworkName();
            this._ipProfile = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams)arg).getIpProfile();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceVldParams, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VldCommonParams]");
    }

    public NetsliceVldKey key() {
        return key;
    }
    
    public IpProfile getIpProfile() {
        return _ipProfile;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<NssConnectionPointRef> getNssConnectionPointRef() {
        return _nssConnectionPointRef;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceVld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsliceVldBuilder withKey(final NetsliceVldKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceVldBuilder setIpProfile(final IpProfile value) {
        this._ipProfile = value;
        return this;
    }
    
    public NetsliceVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetsliceVldBuilder setNssConnectionPointRef(final List<NssConnectionPointRef> values) {
        this._nssConnectionPointRef = values;
        return this;
    }
    
    
    public NetsliceVldBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public NetsliceVldBuilder addAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType, Augmentation<NetsliceVld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsliceVldBuilder removeAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetsliceVld build() {
        return new NetsliceVldImpl(this);
    }

    private static final class NetsliceVldImpl implements NetsliceVld {
    
        private final IpProfile _ipProfile;
        private final String _name;
        private final List<NssConnectionPointRef> _nssConnectionPointRef;
        private final String _vimNetworkName;
        private final NetsliceVldKey key;
    
        private Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();
    
        NetsliceVldImpl(NetsliceVldBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceVldKey(base.getName());
            }
            this._name = key.getName();
            this._ipProfile = base.getIpProfile();
            this._nssConnectionPointRef = base.getNssConnectionPointRef();
            this._vimNetworkName = base.getVimNetworkName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetsliceVld> getImplementedInterface() {
            return NetsliceVld.class;
        }
    
        @Override
        public NetsliceVldKey key() {
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
        public List<NssConnectionPointRef> getNssConnectionPointRef() {
            return _nssConnectionPointRef;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetsliceVld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nssConnectionPointRef);
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
            if (!NetsliceVld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetsliceVld other = (NetsliceVld)obj;
            if (!Objects.equals(_ipProfile, other.getIpProfile())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nssConnectionPointRef, other.getNssConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceVldImpl otherImpl = (NetsliceVldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceVld");
            CodeHelpers.appendValue(helper, "_ipProfile", _ipProfile);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nssConnectionPointRef", _nssConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
