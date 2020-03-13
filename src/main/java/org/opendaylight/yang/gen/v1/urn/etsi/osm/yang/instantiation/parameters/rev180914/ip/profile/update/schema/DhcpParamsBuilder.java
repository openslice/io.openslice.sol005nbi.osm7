package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link DhcpParamsBuilder} instances.
 * 
 * @see DhcpParamsBuilder
 *
 */
public class DhcpParamsBuilder implements Builder<DhcpParams> {

    private Short _count;
    private IpAddress _startAddress;
    private Boolean _enabled;


    Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> augmentation = Collections.emptyMap();

    public DhcpParamsBuilder() {
    }

    public DhcpParamsBuilder(DhcpParams base) {
        this._count = base.getCount();
        this._startAddress = base.getStartAddress();
        this._enabled = base.isEnabled();
        if (base instanceof DhcpParamsImpl) {
            DhcpParamsImpl impl = (DhcpParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> aug =((AugmentationHolder<DhcpParams>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Short getCount() {
        return _count;
    }
    
    public IpAddress getStartAddress() {
        return _startAddress;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<DhcpParams>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkCountRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public DhcpParamsBuilder setCount(final Short value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    
    public DhcpParamsBuilder setStartAddress(final IpAddress value) {
        this._startAddress = value;
        return this;
    }
    
    public DhcpParamsBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public DhcpParamsBuilder addAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType, Augmentation<DhcpParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DhcpParamsBuilder removeAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DhcpParams build() {
        return new DhcpParamsImpl(this);
    }

    private static final class DhcpParamsImpl implements DhcpParams {
    
        private final Short _count;
        private final IpAddress _startAddress;
        private final Boolean _enabled;
    
        private Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> augmentation = Collections.emptyMap();
    
        DhcpParamsImpl(DhcpParamsBuilder base) {
            this._count = base.getCount();
            this._startAddress = base.getStartAddress();
            this._enabled = base.isEnabled();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<DhcpParams> getImplementedInterface() {
            return DhcpParams.class;
        }
    
        @Override
        public Short getCount() {
            return _count;
        }
        
        @Override
        public IpAddress getStartAddress() {
            return _startAddress;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<DhcpParams>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_startAddress);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!DhcpParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            DhcpParams other = (DhcpParams)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_startAddress, other.getStartAddress())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DhcpParamsImpl otherImpl = (DhcpParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DhcpParams");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_startAddress", _startAddress);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
