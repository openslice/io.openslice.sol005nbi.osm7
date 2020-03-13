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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params.Vnf;
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

    private String _id;
    private String _sshKeys;
    private String _vimAccountId;
    private List<Vld> _vld;
    private List<Vnf> _vnf;
    private NetsliceSubnetKey key;


    Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> augmentation = Collections.emptyMap();

    public NetsliceSubnetBuilder() {
    }
    public NetsliceSubnetBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams arg) {
        this._id = arg.getId();
        this._vimAccountId = arg.getVimAccountId();
        this._sshKeys = arg.getSshKeys();
        this._vnf = arg.getVnf();
        this._vld = arg.getVld();
    }
    public NetsliceSubnetBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams arg) {
        this._vimAccountId = arg.getVimAccountId();
        this._sshKeys = arg.getSshKeys();
        this._vnf = arg.getVnf();
        this._vld = arg.getVld();
    }

    public NetsliceSubnetBuilder(NetsliceSubnet base) {
        this.key = base.key();
        this._id = base.getId();
        this._sshKeys = base.getSshKeys();
        this._vimAccountId = base.getVimAccountId();
        this._vld = base.getVld();
        this._vnf = base.getVnf();
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
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams)arg).getId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams) {
            this._vimAccountId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVimAccountId();
            this._sshKeys = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getSshKeys();
            this._vnf = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVnf();
            this._vld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams)arg).getVld();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.NetsliceSubnetParams, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams]");
    }

    public NetsliceSubnetKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getSshKeys() {
        return _sshKeys;
    }
    
    public String getVimAccountId() {
        return _vimAccountId;
    }
    
    public List<Vld> getVld() {
        return _vld;
    }
    
    public List<Vnf> getVnf() {
        return _vnf;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceSubnet>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsliceSubnetBuilder withKey(final NetsliceSubnetKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceSubnetBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setSshKeys(final String value) {
        this._sshKeys = value;
        return this;
    }
    
    public NetsliceSubnetBuilder setVimAccountId(final String value) {
        this._vimAccountId = value;
        return this;
    }
    public NetsliceSubnetBuilder setVld(final List<Vld> values) {
        this._vld = values;
        return this;
    }
    
    public NetsliceSubnetBuilder setVnf(final List<Vnf> values) {
        this._vnf = values;
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
    
        private final String _id;
        private final String _sshKeys;
        private final String _vimAccountId;
        private final List<Vld> _vld;
        private final List<Vnf> _vnf;
        private final NetsliceSubnetKey key;
    
        private Map<Class<? extends Augmentation<NetsliceSubnet>>, Augmentation<NetsliceSubnet>> augmentation = Collections.emptyMap();
    
        NetsliceSubnetImpl(NetsliceSubnetBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceSubnetKey(base.getId());
            }
            this._id = key.getId();
            this._sshKeys = base.getSshKeys();
            this._vimAccountId = base.getVimAccountId();
            this._vld = base.getVld();
            this._vnf = base.getVnf();
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
        public String getId() {
            return _id;
        }
        
        @Override
        public String getSshKeys() {
            return _sshKeys;
        }
        
        @Override
        public String getVimAccountId() {
            return _vimAccountId;
        }
        
        @Override
        public List<Vld> getVld() {
            return _vld;
        }
        
        @Override
        public List<Vnf> getVnf() {
            return _vnf;
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_sshKeys);
            result = prime * result + Objects.hashCode(_vimAccountId);
            result = prime * result + Objects.hashCode(_vld);
            result = prime * result + Objects.hashCode(_vnf);
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
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_sshKeys, other.getSshKeys())) {
                return false;
            }
            if (!Objects.equals(_vimAccountId, other.getVimAccountId())) {
                return false;
            }
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (!Objects.equals(_vnf, other.getVnf())) {
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
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_sshKeys", _sshKeys);
            CodeHelpers.appendValue(helper, "_vimAccountId", _vimAccountId);
            CodeHelpers.appendValue(helper, "_vld", _vld);
            CodeHelpers.appendValue(helper, "_vnf", _vnf);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
