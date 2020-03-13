package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduModel;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link KduBuilder} instances.
 * 
 * @see KduBuilder
 *
 */
public class KduBuilder implements Builder<Kdu> {

    private String _description;
    private KduConfiguration _kduConfiguration;
    private KduModel _kduModel;
    private String _name;
    private KduKey key;


    Map<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> augmentation = Collections.emptyMap();

    public KduBuilder() {
    }

    public KduBuilder(Kdu base) {
        this.key = base.key();
        this._name = base.getName();
        this._description = base.getDescription();
        this._kduConfiguration = base.getKduConfiguration();
        this._kduModel = base.getKduModel();
        if (base instanceof KduImpl) {
            KduImpl impl = (KduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> aug =((AugmentationHolder<Kdu>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public KduKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public KduConfiguration getKduConfiguration() {
        return _kduConfiguration;
    }
    
    public KduModel getKduModel() {
        return _kduModel;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Kdu>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public KduBuilder withKey(final KduKey key) {
        this.key = key;
        return this;
    }
    
    public KduBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public KduBuilder setKduConfiguration(final KduConfiguration value) {
        this._kduConfiguration = value;
        return this;
    }
    
    public KduBuilder setKduModel(final KduModel value) {
        this._kduModel = value;
        return this;
    }
    
    public KduBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public KduBuilder addAugmentation(Class<? extends Augmentation<Kdu>> augmentationType, Augmentation<Kdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public KduBuilder removeAugmentation(Class<? extends Augmentation<Kdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Kdu build() {
        return new KduImpl(this);
    }

    private static final class KduImpl implements Kdu {
    
        private final String _description;
        private final KduConfiguration _kduConfiguration;
        private final KduModel _kduModel;
        private final String _name;
        private final KduKey key;
    
        private Map<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> augmentation = Collections.emptyMap();
    
        KduImpl(KduBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new KduKey(base.getName());
            }
            this._name = key.getName();
            this._description = base.getDescription();
            this._kduConfiguration = base.getKduConfiguration();
            this._kduModel = base.getKduModel();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Kdu> getImplementedInterface() {
            return Kdu.class;
        }
    
        @Override
        public KduKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public KduConfiguration getKduConfiguration() {
            return _kduConfiguration;
        }
        
        @Override
        public KduModel getKduModel() {
            return _kduModel;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Kdu>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_kduConfiguration);
            result = prime * result + Objects.hashCode(_kduModel);
            result = prime * result + Objects.hashCode(_name);
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
            if (!Kdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Kdu other = (Kdu)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_kduConfiguration, other.getKduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_kduModel, other.getKduModel())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                KduImpl otherImpl = (KduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Kdu>>, Augmentation<Kdu>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Kdu");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_kduConfiguration", _kduConfiguration);
            CodeHelpers.appendValue(helper, "_kduModel", _kduModel);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
