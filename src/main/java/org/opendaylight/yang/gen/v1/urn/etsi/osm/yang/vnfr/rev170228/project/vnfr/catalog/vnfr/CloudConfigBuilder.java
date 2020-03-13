package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.KeyPair;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.cloud.config.User;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CloudConfigBuilder} instances.
 * 
 * @see CloudConfigBuilder
 *
 */
public class CloudConfigBuilder implements Builder<CloudConfig> {

    private List<KeyPair> _keyPair;
    private List<User> _user;


    Map<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> augmentation = Collections.emptyMap();

    public CloudConfigBuilder() {
    }
    public CloudConfigBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig arg) {
        this._keyPair = arg.getKeyPair();
        this._user = arg.getUser();
    }

    public CloudConfigBuilder(CloudConfig base) {
        this._keyPair = base.getKeyPair();
        this._user = base.getUser();
        if (base instanceof CloudConfigImpl) {
            CloudConfigImpl impl = (CloudConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> aug =((AugmentationHolder<CloudConfig>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig) {
            this._keyPair = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig)arg).getKeyPair();
            this._user = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig)arg).getUser();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CloudConfig]");
    }

    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CloudConfig>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CloudConfigBuilder setKeyPair(final List<KeyPair> values) {
        this._keyPair = values;
        return this;
    }
    
    public CloudConfigBuilder setUser(final List<User> values) {
        this._user = values;
        return this;
    }
    
    
    public CloudConfigBuilder addAugmentation(Class<? extends Augmentation<CloudConfig>> augmentationType, Augmentation<CloudConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CloudConfigBuilder removeAugmentation(Class<? extends Augmentation<CloudConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CloudConfig build() {
        return new CloudConfigImpl(this);
    }

    private static final class CloudConfigImpl implements CloudConfig {
    
        private final List<KeyPair> _keyPair;
        private final List<User> _user;
    
        private Map<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> augmentation = Collections.emptyMap();
    
        CloudConfigImpl(CloudConfigBuilder base) {
            this._keyPair = base.getKeyPair();
            this._user = base.getUser();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CloudConfig> getImplementedInterface() {
            return CloudConfig.class;
        }
    
        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CloudConfig>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_user);
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
            if (!CloudConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CloudConfig other = (CloudConfig)obj;
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CloudConfigImpl otherImpl = (CloudConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CloudConfig>>, Augmentation<CloudConfig>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CloudConfig");
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
