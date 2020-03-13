package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
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
 * Class that builds {@link SshAccessBuilder} instances.
 * 
 * @see SshAccessBuilder
 *
 */
public class SshAccessBuilder implements Builder<SshAccess> {

    private String _defaultUser;
    private Boolean _required;


    Map<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> augmentation = Collections.emptyMap();

    public SshAccessBuilder() {
    }

    public SshAccessBuilder(SshAccess base) {
        this._defaultUser = base.getDefaultUser();
        this._required = base.isRequired();
        if (base instanceof SshAccessImpl) {
            SshAccessImpl impl = (SshAccessImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> aug =((AugmentationHolder<SshAccess>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getDefaultUser() {
        return _defaultUser;
    }
    
    public Boolean isRequired() {
        return _required;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SshAccess>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public SshAccessBuilder setDefaultUser(final String value) {
        this._defaultUser = value;
        return this;
    }
    
    public SshAccessBuilder setRequired(final Boolean value) {
        this._required = value;
        return this;
    }
    
    public SshAccessBuilder addAugmentation(Class<? extends Augmentation<SshAccess>> augmentationType, Augmentation<SshAccess> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SshAccessBuilder removeAugmentation(Class<? extends Augmentation<SshAccess>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SshAccess build() {
        return new SshAccessImpl(this);
    }

    private static final class SshAccessImpl implements SshAccess {
    
        private final String _defaultUser;
        private final Boolean _required;
    
        private Map<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> augmentation = Collections.emptyMap();
    
        SshAccessImpl(SshAccessBuilder base) {
            this._defaultUser = base.getDefaultUser();
            this._required = base.isRequired();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SshAccess> getImplementedInterface() {
            return SshAccess.class;
        }
    
        @Override
        public String getDefaultUser() {
            return _defaultUser;
        }
        
        @Override
        public Boolean isRequired() {
            return _required;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SshAccess>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_defaultUser);
            result = prime * result + Objects.hashCode(_required);
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
            if (!SshAccess.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SshAccess other = (SshAccess)obj;
            if (!Objects.equals(_defaultUser, other.getDefaultUser())) {
                return false;
            }
            if (!Objects.equals(_required, other.isRequired())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshAccessImpl otherImpl = (SshAccessImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SshAccess>>, Augmentation<SshAccess>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SshAccess");
            CodeHelpers.appendValue(helper, "_defaultUser", _defaultUser);
            CodeHelpers.appendValue(helper, "_required", _required);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
