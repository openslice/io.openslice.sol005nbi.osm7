package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfrMonParamRefBuilder} instances.
 * 
 * @see VnfrMonParamRefBuilder
 *
 */
public class VnfrMonParamRefBuilder implements Builder<VnfrMonParamRef> {

    private Uuid _vnfrIdRef;
    private Object _vnfrMonParamRef;
    private VnfrMonParamRefKey key;


    Map<Class<? extends Augmentation<VnfrMonParamRef>>, Augmentation<VnfrMonParamRef>> augmentation = Collections.emptyMap();

    public VnfrMonParamRefBuilder() {
    }

    public VnfrMonParamRefBuilder(VnfrMonParamRef base) {
        this.key = base.key();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrMonParamRef = base.getVnfrMonParamRef();
        if (base instanceof VnfrMonParamRefImpl) {
            VnfrMonParamRefImpl impl = (VnfrMonParamRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfrMonParamRef>>, Augmentation<VnfrMonParamRef>> aug =((AugmentationHolder<VnfrMonParamRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VnfrMonParamRefKey key() {
        return key;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public Object getVnfrMonParamRef() {
        return _vnfrMonParamRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfrMonParamRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfrMonParamRefBuilder withKey(final VnfrMonParamRefKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrMonParamRefBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfrMonParamRefBuilder setVnfrMonParamRef(final Object value) {
        this._vnfrMonParamRef = value;
        return this;
    }
    
    public VnfrMonParamRefBuilder addAugmentation(Class<? extends Augmentation<VnfrMonParamRef>> augmentationType, Augmentation<VnfrMonParamRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrMonParamRefBuilder removeAugmentation(Class<? extends Augmentation<VnfrMonParamRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrMonParamRef build() {
        return new VnfrMonParamRefImpl(this);
    }

    private static final class VnfrMonParamRefImpl implements VnfrMonParamRef {
    
        private final Uuid _vnfrIdRef;
        private final Object _vnfrMonParamRef;
        private final VnfrMonParamRefKey key;
    
        private Map<Class<? extends Augmentation<VnfrMonParamRef>>, Augmentation<VnfrMonParamRef>> augmentation = Collections.emptyMap();
    
        VnfrMonParamRefImpl(VnfrMonParamRefBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfrMonParamRefKey(base.getVnfrIdRef(), base.getVnfrMonParamRef());
            }
            this._vnfrIdRef = key.getVnfrIdRef();
            this._vnfrMonParamRef = key.getVnfrMonParamRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfrMonParamRef> getImplementedInterface() {
            return VnfrMonParamRef.class;
        }
    
        @Override
        public VnfrMonParamRefKey key() {
            return key;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public Object getVnfrMonParamRef() {
            return _vnfrMonParamRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfrMonParamRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrMonParamRef);
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
            if (!VnfrMonParamRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfrMonParamRef other = (VnfrMonParamRef)obj;
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrMonParamRef, other.getVnfrMonParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrMonParamRefImpl otherImpl = (VnfrMonParamRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfrMonParamRef>>, Augmentation<VnfrMonParamRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrMonParamRef");
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "_vnfrMonParamRef", _vnfrMonParamRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
