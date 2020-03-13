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
 * Class that builds {@link NsdConnectionPointRefBuilder} instances.
 * 
 * @see NsdConnectionPointRefBuilder
 *
 */
public class NsdConnectionPointRefBuilder implements Builder<NsdConnectionPointRef> {

    private String _nsdConnectionPointRef;
    private String _nsdIdRef;


    Map<Class<? extends Augmentation<NsdConnectionPointRef>>, Augmentation<NsdConnectionPointRef>> augmentation = Collections.emptyMap();

    public NsdConnectionPointRefBuilder() {
    }

    public NsdConnectionPointRefBuilder(NsdConnectionPointRef base) {
        this._nsdConnectionPointRef = base.getNsdConnectionPointRef();
        this._nsdIdRef = base.getNsdIdRef();
        if (base instanceof NsdConnectionPointRefImpl) {
            NsdConnectionPointRefImpl impl = (NsdConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NsdConnectionPointRef>>, Augmentation<NsdConnectionPointRef>> aug =((AugmentationHolder<NsdConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getNsdConnectionPointRef() {
        return _nsdConnectionPointRef;
    }
    
    public String getNsdIdRef() {
        return _nsdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NsdConnectionPointRefBuilder setNsdConnectionPointRef(final String value) {
        this._nsdConnectionPointRef = value;
        return this;
    }
    private static void check_nsdIdRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NsdConnectionPointRefBuilder setNsdIdRef(final String value) {
    if (value != null) {
        check_nsdIdRefLength(value);
        
    }
        this._nsdIdRef = value;
        return this;
    }
    
    public NsdConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<NsdConnectionPointRef>> augmentationType, Augmentation<NsdConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<NsdConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsdConnectionPointRef build() {
        return new NsdConnectionPointRefImpl(this);
    }

    private static final class NsdConnectionPointRefImpl implements NsdConnectionPointRef {
    
        private final String _nsdConnectionPointRef;
        private final String _nsdIdRef;
    
        private Map<Class<? extends Augmentation<NsdConnectionPointRef>>, Augmentation<NsdConnectionPointRef>> augmentation = Collections.emptyMap();
    
        NsdConnectionPointRefImpl(NsdConnectionPointRefBuilder base) {
            this._nsdConnectionPointRef = base.getNsdConnectionPointRef();
            this._nsdIdRef = base.getNsdIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NsdConnectionPointRef> getImplementedInterface() {
            return NsdConnectionPointRef.class;
        }
    
        @Override
        public String getNsdConnectionPointRef() {
            return _nsdConnectionPointRef;
        }
        
        @Override
        public String getNsdIdRef() {
            return _nsdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NsdConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsdConnectionPointRef);
            result = prime * result + Objects.hashCode(_nsdIdRef);
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
            if (!NsdConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsdConnectionPointRef other = (NsdConnectionPointRef)obj;
            if (!Objects.equals(_nsdConnectionPointRef, other.getNsdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_nsdIdRef, other.getNsdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdConnectionPointRefImpl otherImpl = (NsdConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsdConnectionPointRef>>, Augmentation<NsdConnectionPointRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsdConnectionPointRef");
            CodeHelpers.appendValue(helper, "_nsdConnectionPointRef", _nsdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_nsdIdRef", _nsdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
