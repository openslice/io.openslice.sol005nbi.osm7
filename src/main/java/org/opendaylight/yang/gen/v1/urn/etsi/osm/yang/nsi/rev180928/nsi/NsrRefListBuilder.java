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
 * Class that builds {@link NsrRefListBuilder} instances.
 * 
 * @see NsrRefListBuilder
 *
 */
public class NsrRefListBuilder implements Builder<NsrRefList> {

    private Uuid _nsrRef;
    private NsrRefListKey key;


    Map<Class<? extends Augmentation<NsrRefList>>, Augmentation<NsrRefList>> augmentation = Collections.emptyMap();

    public NsrRefListBuilder() {
    }

    public NsrRefListBuilder(NsrRefList base) {
        this.key = base.key();
        this._nsrRef = base.getNsrRef();
        if (base instanceof NsrRefListImpl) {
            NsrRefListImpl impl = (NsrRefListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsrRefList>>, Augmentation<NsrRefList>> aug =((AugmentationHolder<NsrRefList>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NsrRefListKey key() {
        return key;
    }
    
    public Uuid getNsrRef() {
        return _nsrRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsrRefList>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsrRefListBuilder withKey(final NsrRefListKey key) {
        this.key = key;
        return this;
    }
    
    public NsrRefListBuilder setNsrRef(final Uuid value) {
        this._nsrRef = value;
        return this;
    }
    
    public NsrRefListBuilder addAugmentation(Class<? extends Augmentation<NsrRefList>> augmentationType, Augmentation<NsrRefList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsrRefListBuilder removeAugmentation(Class<? extends Augmentation<NsrRefList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsrRefList build() {
        return new NsrRefListImpl(this);
    }

    private static final class NsrRefListImpl implements NsrRefList {
    
        private final Uuid _nsrRef;
        private final NsrRefListKey key;
    
        private Map<Class<? extends Augmentation<NsrRefList>>, Augmentation<NsrRefList>> augmentation = Collections.emptyMap();
    
        NsrRefListImpl(NsrRefListBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsrRefListKey(base.getNsrRef());
            }
            this._nsrRef = key.getNsrRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NsrRefList> getImplementedInterface() {
            return NsrRefList.class;
        }
    
        @Override
        public NsrRefListKey key() {
            return key;
        }
        
        @Override
        public Uuid getNsrRef() {
            return _nsrRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NsrRefList>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsrRef);
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
            if (!NsrRefList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsrRefList other = (NsrRefList)obj;
            if (!Objects.equals(_nsrRef, other.getNsrRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrRefListImpl otherImpl = (NsrRefListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsrRefList>>, Augmentation<NsrRefList>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsrRefList");
            CodeHelpers.appendValue(helper, "_nsrRef", _nsrRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
