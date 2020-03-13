package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.nsd.vld.common.init.params;
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
 * Class that builds {@link VimNetworkRefBuilder} instances.
 * 
 * @see VimNetworkRefBuilder
 *
 */
public class VimNetworkRefBuilder implements Builder<VimNetworkRef> {

    private String _vimNetworkName;


    Map<Class<? extends Augmentation<VimNetworkRef>>, Augmentation<VimNetworkRef>> augmentation = Collections.emptyMap();

    public VimNetworkRefBuilder() {
    }

    public VimNetworkRefBuilder(VimNetworkRef base) {
        this._vimNetworkName = base.getVimNetworkName();
        if (base instanceof VimNetworkRefImpl) {
            VimNetworkRefImpl impl = (VimNetworkRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VimNetworkRef>>, Augmentation<VimNetworkRef>> aug =((AugmentationHolder<VimNetworkRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VimNetworkRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VimNetworkRefBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public VimNetworkRefBuilder addAugmentation(Class<? extends Augmentation<VimNetworkRef>> augmentationType, Augmentation<VimNetworkRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VimNetworkRefBuilder removeAugmentation(Class<? extends Augmentation<VimNetworkRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VimNetworkRef build() {
        return new VimNetworkRefImpl(this);
    }

    private static final class VimNetworkRefImpl implements VimNetworkRef {
    
        private final String _vimNetworkName;
    
        private Map<Class<? extends Augmentation<VimNetworkRef>>, Augmentation<VimNetworkRef>> augmentation = Collections.emptyMap();
    
        VimNetworkRefImpl(VimNetworkRefBuilder base) {
            this._vimNetworkName = base.getVimNetworkName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VimNetworkRef> getImplementedInterface() {
            return VimNetworkRef.class;
        }
    
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VimNetworkRef>> E augmentation(Class<E> augmentationType) {
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
            if (!VimNetworkRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VimNetworkRef other = (VimNetworkRef)obj;
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VimNetworkRefImpl otherImpl = (VimNetworkRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VimNetworkRef>>, Augmentation<VimNetworkRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VimNetworkRef");
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
