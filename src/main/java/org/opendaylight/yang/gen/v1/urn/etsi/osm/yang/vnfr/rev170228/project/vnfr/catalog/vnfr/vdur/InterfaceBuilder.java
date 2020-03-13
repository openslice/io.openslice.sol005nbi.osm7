package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.InterfaceType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur._interface.ConnectionPointType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.virtual._interface.VirtualInterface;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link InterfaceBuilder} instances.
 * 
 * @see InterfaceBuilder
 *
 */
public class InterfaceBuilder implements Builder<Interface> {

    private ConnectionPointType _connectionPointType;
    private String _name;
    private Long _position;
    private InterfaceType _type;
    private VirtualInterface _virtualInterface;
    private InterfaceKey key;


    Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();

    public InterfaceBuilder() {
    }
    public InterfaceBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
    }

    public InterfaceBuilder(Interface base) {
        this.key = base.key();
        this._name = base.getName();
        this._connectionPointType = base.getConnectionPointType();
        this._position = base.getPosition();
        this._type = base.getType();
        this._virtualInterface = base.getVirtualInterface();
        if (base instanceof InterfaceImpl) {
            InterfaceImpl impl = (InterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> aug =((AugmentationHolder<Interface>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface) {
            this._virtualInterface = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.VirtualInterface]");
    }

    public InterfaceKey key() {
        return key;
    }
    
    public ConnectionPointType getConnectionPointType() {
        return _connectionPointType;
    }
    
    public String getName() {
        return _name;
    }
    
    public Long getPosition() {
        return _position;
    }
    
    public InterfaceType getType() {
        return _type;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Interface>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InterfaceBuilder withKey(final InterfaceKey key) {
        this.key = key;
        return this;
    }
    
    public InterfaceBuilder setConnectionPointType(final ConnectionPointType value) {
        this._connectionPointType = value;
        return this;
    }
    
    public InterfaceBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    private static void checkPositionRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public InterfaceBuilder setPosition(final Long value) {
    if (value != null) {
        checkPositionRange(value);
        
    }
        this._position = value;
        return this;
    }
    
    public InterfaceBuilder setType(final InterfaceType value) {
        this._type = value;
        return this;
    }
    
    public InterfaceBuilder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
        return this;
    }
    
    public InterfaceBuilder addAugmentation(Class<? extends Augmentation<Interface>> augmentationType, Augmentation<Interface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InterfaceBuilder removeAugmentation(Class<? extends Augmentation<Interface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Interface build() {
        return new InterfaceImpl(this);
    }

    private static final class InterfaceImpl implements Interface {
    
        private final ConnectionPointType _connectionPointType;
        private final String _name;
        private final Long _position;
        private final InterfaceType _type;
        private final VirtualInterface _virtualInterface;
        private final InterfaceKey key;
    
        private Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();
    
        InterfaceImpl(InterfaceBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new InterfaceKey(base.getName());
            }
            this._name = key.getName();
            this._connectionPointType = base.getConnectionPointType();
            this._position = base.getPosition();
            this._type = base.getType();
            this._virtualInterface = base.getVirtualInterface();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Interface> getImplementedInterface() {
            return Interface.class;
        }
    
        @Override
        public InterfaceKey key() {
            return key;
        }
        
        @Override
        public ConnectionPointType getConnectionPointType() {
            return _connectionPointType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Long getPosition() {
            return _position;
        }
        
        @Override
        public InterfaceType getType() {
            return _type;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Interface>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPointType);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualInterface);
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
            if (!Interface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Interface other = (Interface)obj;
            if (!Objects.equals(_connectionPointType, other.getConnectionPointType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InterfaceImpl otherImpl = (InterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Interface");
            CodeHelpers.appendValue(helper, "_connectionPointType", _connectionPointType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_position", _position);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_virtualInterface", _virtualInterface);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
