package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.connection;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceVldRefBuilder} instances.
 * 
 * @see NetsliceVldRefBuilder
 *
 */
public class NetsliceVldRefBuilder implements Builder<NetsliceVldRef> {

    private String _netsliceVldIdRef;


    Map<Class<? extends Augmentation<NetsliceVldRef>>, Augmentation<NetsliceVldRef>> augmentation = Collections.emptyMap();

    public NetsliceVldRefBuilder() {
    }

    public NetsliceVldRefBuilder(NetsliceVldRef base) {
        this._netsliceVldIdRef = base.getNetsliceVldIdRef();
        if (base instanceof NetsliceVldRefImpl) {
            NetsliceVldRefImpl impl = (NetsliceVldRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceVldRef>>, Augmentation<NetsliceVldRef>> aug =((AugmentationHolder<NetsliceVldRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getNetsliceVldIdRef() {
        return _netsliceVldIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceVldRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NetsliceVldRefBuilder setNetsliceVldIdRef(final String value) {
        this._netsliceVldIdRef = value;
        return this;
    }
    
    public NetsliceVldRefBuilder addAugmentation(Class<? extends Augmentation<NetsliceVldRef>> augmentationType, Augmentation<NetsliceVldRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsliceVldRefBuilder removeAugmentation(Class<? extends Augmentation<NetsliceVldRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetsliceVldRef build() {
        return new NetsliceVldRefImpl(this);
    }

    private static final class NetsliceVldRefImpl implements NetsliceVldRef {
    
        private final String _netsliceVldIdRef;
    
        private Map<Class<? extends Augmentation<NetsliceVldRef>>, Augmentation<NetsliceVldRef>> augmentation = Collections.emptyMap();
    
        NetsliceVldRefImpl(NetsliceVldRefBuilder base) {
            this._netsliceVldIdRef = base.getNetsliceVldIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetsliceVldRef> getImplementedInterface() {
            return NetsliceVldRef.class;
        }
    
        @Override
        public String getNetsliceVldIdRef() {
            return _netsliceVldIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetsliceVldRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_netsliceVldIdRef);
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
            if (!NetsliceVldRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetsliceVldRef other = (NetsliceVldRef)obj;
            if (!Objects.equals(_netsliceVldIdRef, other.getNetsliceVldIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceVldRefImpl otherImpl = (NetsliceVldRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceVldRef>>, Augmentation<NetsliceVldRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceVldRef");
            CodeHelpers.appendValue(helper, "_netsliceVldIdRef", _netsliceVldIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
