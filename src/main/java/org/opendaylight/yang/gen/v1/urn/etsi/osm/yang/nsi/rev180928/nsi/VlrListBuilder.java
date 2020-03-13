package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
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
 * Class that builds {@link VlrListBuilder} instances.
 * 
 * @see VlrListBuilder
 *
 */
public class VlrListBuilder implements Builder<VlrList> {

    private Uuid _id;
    private VlrListKey key;


    Map<Class<? extends Augmentation<VlrList>>, Augmentation<VlrList>> augmentation = Collections.emptyMap();

    public VlrListBuilder() {
    }

    public VlrListBuilder(VlrList base) {
        this.key = base.key();
        this._id = base.getId();
        if (base instanceof VlrListImpl) {
            VlrListImpl impl = (VlrListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VlrList>>, Augmentation<VlrList>> aug =((AugmentationHolder<VlrList>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public VlrListKey key() {
        return key;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VlrList>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VlrListBuilder withKey(final VlrListKey key) {
        this.key = key;
        return this;
    }
    
    public VlrListBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VlrListBuilder addAugmentation(Class<? extends Augmentation<VlrList>> augmentationType, Augmentation<VlrList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlrListBuilder removeAugmentation(Class<? extends Augmentation<VlrList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VlrList build() {
        return new VlrListImpl(this);
    }

    private static final class VlrListImpl implements VlrList {
    
        private final Uuid _id;
        private final VlrListKey key;
    
        private Map<Class<? extends Augmentation<VlrList>>, Augmentation<VlrList>> augmentation = Collections.emptyMap();
    
        VlrListImpl(VlrListBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VlrListKey(base.getId());
            }
            this._id = key.getId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VlrList> getImplementedInterface() {
            return VlrList.class;
        }
    
        @Override
        public VlrListKey key() {
            return key;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VlrList>> E augmentation(Class<E> augmentationType) {
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
            if (!VlrList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VlrList other = (VlrList)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrListImpl otherImpl = (VlrListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VlrList>>, Augmentation<VlrList>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VlrList");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
