package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld;
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
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpAddress;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NssConnectionPointRefBuilder} instances.
 * 
 * @see NssConnectionPointRefBuilder
 *
 */
public class NssConnectionPointRefBuilder implements Builder<NssConnectionPointRef> {

    private IpAddress _ipAddress;
    private String _nsdConnectionPointRef;
    private String _nssRef;
    private NssConnectionPointRefKey key;


    Map<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> augmentation = Collections.emptyMap();

    public NssConnectionPointRefBuilder() {
    }

    public NssConnectionPointRefBuilder(NssConnectionPointRef base) {
        this.key = base.key();
        this._nsdConnectionPointRef = base.getNsdConnectionPointRef();
        this._nssRef = base.getNssRef();
        this._ipAddress = base.getIpAddress();
        if (base instanceof NssConnectionPointRefImpl) {
            NssConnectionPointRefImpl impl = (NssConnectionPointRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> aug =((AugmentationHolder<NssConnectionPointRef>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public NssConnectionPointRefKey key() {
        return key;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getNsdConnectionPointRef() {
        return _nsdConnectionPointRef;
    }
    
    public String getNssRef() {
        return _nssRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NssConnectionPointRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NssConnectionPointRefBuilder withKey(final NssConnectionPointRefKey key) {
        this.key = key;
        return this;
    }
    
    public NssConnectionPointRefBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public NssConnectionPointRefBuilder setNsdConnectionPointRef(final String value) {
        this._nsdConnectionPointRef = value;
        return this;
    }
    private static void check_nssRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NssConnectionPointRefBuilder setNssRef(final String value) {
    if (value != null) {
        check_nssRefLength(value);
        
    }
        this._nssRef = value;
        return this;
    }
    
    public NssConnectionPointRefBuilder addAugmentation(Class<? extends Augmentation<NssConnectionPointRef>> augmentationType, Augmentation<NssConnectionPointRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NssConnectionPointRefBuilder removeAugmentation(Class<? extends Augmentation<NssConnectionPointRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NssConnectionPointRef build() {
        return new NssConnectionPointRefImpl(this);
    }

    private static final class NssConnectionPointRefImpl implements NssConnectionPointRef {
    
        private final IpAddress _ipAddress;
        private final String _nsdConnectionPointRef;
        private final String _nssRef;
        private final NssConnectionPointRefKey key;
    
        private Map<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> augmentation = Collections.emptyMap();
    
        NssConnectionPointRefImpl(NssConnectionPointRefBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NssConnectionPointRefKey(base.getNsdConnectionPointRef(), base.getNssRef());
            }
            this._nsdConnectionPointRef = key.getNsdConnectionPointRef();
            this._nssRef = key.getNssRef();
            this._ipAddress = base.getIpAddress();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NssConnectionPointRef> getImplementedInterface() {
            return NssConnectionPointRef.class;
        }
    
        @Override
        public NssConnectionPointRefKey key() {
            return key;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getNsdConnectionPointRef() {
            return _nsdConnectionPointRef;
        }
        
        @Override
        public String getNssRef() {
            return _nssRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NssConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_nsdConnectionPointRef);
            result = prime * result + Objects.hashCode(_nssRef);
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
            if (!NssConnectionPointRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NssConnectionPointRef other = (NssConnectionPointRef)obj;
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_nsdConnectionPointRef, other.getNsdConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_nssRef, other.getNssRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NssConnectionPointRefImpl otherImpl = (NssConnectionPointRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NssConnectionPointRef>>, Augmentation<NssConnectionPointRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NssConnectionPointRef");
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_nsdConnectionPointRef", _nsdConnectionPointRef);
            CodeHelpers.appendValue(helper, "_nssRef", _nssRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
