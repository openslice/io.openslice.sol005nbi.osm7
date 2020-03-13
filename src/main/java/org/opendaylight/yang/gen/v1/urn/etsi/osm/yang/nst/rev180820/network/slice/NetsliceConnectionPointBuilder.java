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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceConnectionPointBuilder} instances.
 * 
 * @see NetsliceConnectionPointBuilder
 *
 */
public class NetsliceConnectionPointBuilder implements Builder<NetsliceConnectionPoint> {

    private Connection _connection;
    private String _name;
    private Boolean _floatingIpRequired;
    private NetsliceConnectionPointKey key;


    Map<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> augmentation = Collections.emptyMap();

    public NetsliceConnectionPointBuilder() {
    }
    public NetsliceConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints arg) {
        this._connection = arg.getConnection();
        this._name = arg.getName();
        this._floatingIpRequired = arg.isFloatingIpRequired();
    }
    public NetsliceConnectionPointBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon arg) {
        this._name = arg.getName();
        this._floatingIpRequired = arg.isFloatingIpRequired();
    }

    public NetsliceConnectionPointBuilder(NetsliceConnectionPoint base) {
        this.key = base.key();
        this._name = base.getName();
        this._connection = base.getConnection();
        this._floatingIpRequired = base.isFloatingIpRequired();
        if (base instanceof NetsliceConnectionPointImpl) {
            NetsliceConnectionPointImpl impl = (NetsliceConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> aug =((AugmentationHolder<NetsliceConnectionPoint>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints) {
            this._connection = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints)arg).getConnection();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon)arg).getName();
            this._floatingIpRequired = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon)arg).isFloatingIpRequired();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.SliceConnectionPoints, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon]");
    }

    public NetsliceConnectionPointKey key() {
        return key;
    }
    
    public Connection getConnection() {
        return _connection;
    }
    
    public String getName() {
        return _name;
    }
    
    public Boolean isFloatingIpRequired() {
        return _floatingIpRequired;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceConnectionPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsliceConnectionPointBuilder withKey(final NetsliceConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setConnection(final Connection value) {
        this._connection = value;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NetsliceConnectionPointBuilder setFloatingIpRequired(final Boolean value) {
        this._floatingIpRequired = value;
        return this;
    }
    
    public NetsliceConnectionPointBuilder addAugmentation(Class<? extends Augmentation<NetsliceConnectionPoint>> augmentationType, Augmentation<NetsliceConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsliceConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<NetsliceConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetsliceConnectionPoint build() {
        return new NetsliceConnectionPointImpl(this);
    }

    private static final class NetsliceConnectionPointImpl implements NetsliceConnectionPoint {
    
        private final Connection _connection;
        private final String _name;
        private final Boolean _floatingIpRequired;
        private final NetsliceConnectionPointKey key;
    
        private Map<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> augmentation = Collections.emptyMap();
    
        NetsliceConnectionPointImpl(NetsliceConnectionPointBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceConnectionPointKey(base.getName());
            }
            this._name = key.getName();
            this._connection = base.getConnection();
            this._floatingIpRequired = base.isFloatingIpRequired();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetsliceConnectionPoint> getImplementedInterface() {
            return NetsliceConnectionPoint.class;
        }
    
        @Override
        public NetsliceConnectionPointKey key() {
            return key;
        }
        
        @Override
        public Connection getConnection() {
            return _connection;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Boolean isFloatingIpRequired() {
            return _floatingIpRequired;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetsliceConnectionPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connection);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_floatingIpRequired);
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
            if (!NetsliceConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetsliceConnectionPoint other = (NetsliceConnectionPoint)obj;
            if (!Objects.equals(_connection, other.getConnection())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_floatingIpRequired, other.isFloatingIpRequired())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceConnectionPointImpl otherImpl = (NetsliceConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceConnectionPoint>>, Augmentation<NetsliceConnectionPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceConnectionPoint");
            CodeHelpers.appendValue(helper, "_connection", _connection);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_floatingIpRequired", _floatingIpRequired);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
