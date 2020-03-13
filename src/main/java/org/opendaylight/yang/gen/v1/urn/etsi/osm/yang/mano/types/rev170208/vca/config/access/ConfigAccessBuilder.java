package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.config.access.SshAccess;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ConfigAccessBuilder} instances.
 * 
 * @see ConfigAccessBuilder
 *
 */
public class ConfigAccessBuilder implements Builder<ConfigAccess> {

    private SshAccess _sshAccess;


    Map<Class<? extends Augmentation<ConfigAccess>>, Augmentation<ConfigAccess>> augmentation = Collections.emptyMap();

    public ConfigAccessBuilder() {
    }

    public ConfigAccessBuilder(ConfigAccess base) {
        this._sshAccess = base.getSshAccess();
        if (base instanceof ConfigAccessImpl) {
            ConfigAccessImpl impl = (ConfigAccessImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ConfigAccess>>, Augmentation<ConfigAccess>> aug =((AugmentationHolder<ConfigAccess>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public SshAccess getSshAccess() {
        return _sshAccess;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConfigAccess>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ConfigAccessBuilder setSshAccess(final SshAccess value) {
        this._sshAccess = value;
        return this;
    }
    
    public ConfigAccessBuilder addAugmentation(Class<? extends Augmentation<ConfigAccess>> augmentationType, Augmentation<ConfigAccess> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigAccessBuilder removeAugmentation(Class<? extends Augmentation<ConfigAccess>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigAccess build() {
        return new ConfigAccessImpl(this);
    }

    private static final class ConfigAccessImpl implements ConfigAccess {
    
        private final SshAccess _sshAccess;
    
        private Map<Class<? extends Augmentation<ConfigAccess>>, Augmentation<ConfigAccess>> augmentation = Collections.emptyMap();
    
        ConfigAccessImpl(ConfigAccessBuilder base) {
            this._sshAccess = base.getSshAccess();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ConfigAccess> getImplementedInterface() {
            return ConfigAccess.class;
        }
    
        @Override
        public SshAccess getSshAccess() {
            return _sshAccess;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConfigAccess>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_sshAccess);
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
            if (!ConfigAccess.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConfigAccess other = (ConfigAccess)obj;
            if (!Objects.equals(_sshAccess, other.getSshAccess())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigAccessImpl otherImpl = (ConfigAccessImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigAccess>>, Augmentation<ConfigAccess>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigAccess");
            CodeHelpers.appendValue(helper, "_sshAccess", _sshAccess);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
