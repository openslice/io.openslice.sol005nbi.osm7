package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslice.subnet.InstantiationParameters;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceSubnetBuilder} instances.
 * 
 * @see NetsliceSubnetBuilder
 *
 */
public class NetsliceSubnetBuilder implements Builder<NetsliceSubnet> {

    private String _description;
    private String _id;
    private InstantiationParameters _instantiationParameters;
    private String _nsdRef;
    private Boolean _isSharedNss;
    private NetsliceSubnetKey key;


    Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> augmentation = Collections.emptyMap();

    public NetsliceSubnetBuilder() {
    }
    public NetsliceSubnetBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet arg) {
        this._id = arg.getId();
        this._description = arg.getDescription();
        this._isSharedNss = arg.isIsSharedNss();
        this._nsdRef = arg.getNsdRef();
        this._instantiationParameters = arg.getInstantiationParameters();
    }

    public NetsliceSubnetBuilder(NetsliceSubnet base) {
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._instantiationParameters = base.getInstantiationParameters();
        this._nsdRef = base.getNsdRef();
        this._isSharedNss = base.isIsSharedNss();
        if (base instanceof NetsliceSubnetImpl) {
            NetsliceSubnetImpl impl = (NetsliceSubnetImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> aug =((AugmentationHolder<NetsliceSubnet>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getId();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getDescription();
            this._isSharedNss = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).isIsSharedNss();
            this._nsdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getNsdRef();
            this._instantiationParameters = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet)arg).getInstantiationParameters();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetsliceSubnet]");
    }

    public NetsliceSubnetKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public InstantiationParameters getInstantiationParameters() {
        return _instantiationParameters;
    }
    
    public String getNsdRef() {
        return _nsdRef;
    }
    
    public Boolean isIsSharedNss() {
        return _isSharedNss;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceSubnet>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsliceSubnetBuilder withKey(final NetsliceSubnetKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceSubnetBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    private static void check_idLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NetsliceSubnetBuilder setId(final String value) {
    if (value != null) {
        check_idLength(value);
        
    }
        this._id = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setInstantiationParameters(final InstantiationParameters value) {
        this._instantiationParameters = value;
        return this;
    }
    private static void check_nsdRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NetsliceSubnetBuilder setNsdRef(final String value) {
    if (value != null) {
        check_nsdRefLength(value);
        
    }
        this._nsdRef = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setIsSharedNss(final Boolean value) {
        this._isSharedNss = value;
        return this;
    }
    
    public NetsliceSubnetBuilder addAugmentation(Class<? extends Augmentation<NetsliceSubnet>> augmentationType, Augmentation<NetsliceSubnet> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsliceSubnetBuilder removeAugmentation(Class<? extends Augmentation<NetsliceSubnet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetsliceSubnet build() {
        return new NetsliceSubnetImpl(this);
    }

    private static final class NetsliceSubnetImpl implements NetsliceSubnet {
    
        private final String _description;
        private final String _id;
        private final InstantiationParameters _instantiationParameters;
        private final String _nsdRef;
        private final Boolean _isSharedNss;
        private final NetsliceSubnetKey key;
    
        private Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> augmentation = Collections.emptyMap();
    
        NetsliceSubnetImpl(NetsliceSubnetBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceSubnetKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._instantiationParameters = base.getInstantiationParameters();
            this._nsdRef = base.getNsdRef();
            this._isSharedNss = base.isIsSharedNss();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetsliceSubnet> getImplementedInterface() {
            return NetsliceSubnet.class;
        }
    
        @Override
        public NetsliceSubnetKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public InstantiationParameters getInstantiationParameters() {
            return _instantiationParameters;
        }
        
        @Override
        public String getNsdRef() {
            return _nsdRef;
        }
        
        @Override
        public Boolean isIsSharedNss() {
            return _isSharedNss;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetsliceSubnet>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_instantiationParameters);
            result = prime * result + Objects.hashCode(_nsdRef);
            result = prime * result + Objects.hashCode(_isSharedNss);
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
            if (!NetsliceSubnet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetsliceSubnet other = (NetsliceSubnet)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_instantiationParameters, other.getInstantiationParameters())) {
                return false;
            }
            if (!Objects.equals(_nsdRef, other.getNsdRef())) {
                return false;
            }
            if (!Objects.equals(_isSharedNss, other.isIsSharedNss())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceSubnetImpl otherImpl = (NetsliceSubnetImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceSubnet");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_instantiationParameters", _instantiationParameters);
            CodeHelpers.appendValue(helper, "_nsdRef", _nsdRef);
            CodeHelpers.appendValue(helper, "_isSharedNss", _isSharedNss);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
