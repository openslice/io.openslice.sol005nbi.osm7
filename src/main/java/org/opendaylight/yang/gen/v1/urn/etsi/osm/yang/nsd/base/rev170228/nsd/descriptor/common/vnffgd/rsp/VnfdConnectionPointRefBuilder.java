package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.descriptor.common.vnffgd.rsp;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfdConnectionPointRefBuilder} instances.
 * 
 * @see VnfdConnectionPointRefBuilder
 *
 */
public class VnfdConnectionPointRefBuilder implements Builder<VnfdConnectionPointRef> {

    private String _memberVnfIndexRef;
    private Short _order;
    private String _vnfdEgressConnectionPointRef;
    private Object _vnfdIdRef;
    private String _vnfdIngressConnectionPointRef;
    private VnfdConnectionPointRefKey key;


    Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();

    public VnfdConnectionPointRefBuilder() {
    }

    public VnfdConnectionPointRefBuilder(VnfdConnectionPointRef base) {
        this.key = base.key();
        this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        this._order = base.getOrder();
        this._vnfdEgressConnectionPointRef = base.getVnfdEgressConnectionPointRef();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfdIngressConnectionPointRef = base.getVnfdIngressConnectionPointRef();
        if (base instanceof VnfdConnectionPointRefImpl) {
            VnfdConnectionPointRefImpl impl = (VnfdConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> aug =((AugmentationHolder<VnfdConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VnfdConnectionPointRefKey key() {
        return key;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public Short getOrder() {
        return _order;
    }
    
    public String getVnfdEgressConnectionPointRef() {
        return _vnfdEgressConnectionPointRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public String getVnfdIngressConnectionPointRef() {
        return _vnfdIngressConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdConnectionPointRefBuilder withKey(final VnfdConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    private static void checkOrderRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public VnfdConnectionPointRefBuilder setOrder(final Short value) {
    if (value != null) {
        checkOrderRange(value);
        
    }
        this._order = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdEgressConnectionPointRef(final String value) {
        this._vnfdEgressConnectionPointRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder setVnfdIngressConnectionPointRef(final String value) {
        this._vnfdIngressConnectionPointRef = value;
        return this;
    }
    
    public VnfdConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType, Augmentation<VnfdConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<VnfdConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdConnectionPointRef build() {
        return new VnfdConnectionPointRefImpl(this);
    }

    private static final class VnfdConnectionPointRefImpl implements VnfdConnectionPointRef {
    
        private final String _memberVnfIndexRef;
        private final Short _order;
        private final String _vnfdEgressConnectionPointRef;
        private final Object _vnfdIdRef;
        private final String _vnfdIngressConnectionPointRef;
        private final VnfdConnectionPointRefKey key;
    
        private Map<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> augmentation = Collections.emptyMap();
    
        VnfdConnectionPointRefImpl(VnfdConnectionPointRefBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfdConnectionPointRefKey(base.getMemberVnfIndexRef());
            }
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._order = base.getOrder();
            this._vnfdEgressConnectionPointRef = base.getVnfdEgressConnectionPointRef();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfdIngressConnectionPointRef = base.getVnfdIngressConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfdConnectionPointRef> getImplementedInterface() {
            return VnfdConnectionPointRef.class;
        }
    
        @Override
        public VnfdConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public Short getOrder() {
            return _order;
        }
        
        @Override
        public String getVnfdEgressConnectionPointRef() {
            return _vnfdEgressConnectionPointRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public String getVnfdIngressConnectionPointRef() {
            return _vnfdIngressConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_order);
            result = prime * result + Objects.hashCode(_vnfdEgressConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfdIngressConnectionPointRef);
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
            if (!VnfdConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdConnectionPointRef other = (VnfdConnectionPointRef)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_order, other.getOrder())) {
                return false;
            }
            if (!Objects.equals(_vnfdEgressConnectionPointRef, other.getVnfdEgressConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIngressConnectionPointRef, other.getVnfdIngressConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdConnectionPointRefImpl otherImpl = (VnfdConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdConnectionPointRef>>, Augmentation<VnfdConnectionPointRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdConnectionPointRef");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_order", _order);
            CodeHelpers.appendValue(helper, "_vnfdEgressConnectionPointRef", _vnfdEgressConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_vnfdIngressConnectionPointRef", _vnfdIngressConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
