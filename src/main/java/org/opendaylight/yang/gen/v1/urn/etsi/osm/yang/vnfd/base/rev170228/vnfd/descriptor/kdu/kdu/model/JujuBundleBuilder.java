package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.kdu.model;
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
 * Class that builds {@link JujuBundleBuilder} instances.
 * 
 * @see JujuBundleBuilder
 *
 */
public class JujuBundleBuilder implements Builder<JujuBundle> {

    private String _jujuBundle;


    Map<Class<? extends Augmentation<JujuBundle>>, Augmentation<JujuBundle>> augmentation = Collections.emptyMap();

    public JujuBundleBuilder() {
    }

    public JujuBundleBuilder(JujuBundle base) {
        this._jujuBundle = base.getJujuBundle();
        if (base instanceof JujuBundleImpl) {
            JujuBundleImpl impl = (JujuBundleImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<JujuBundle>>, Augmentation<JujuBundle>> aug =((AugmentationHolder<JujuBundle>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getJujuBundle() {
        return _jujuBundle;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<JujuBundle>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public JujuBundleBuilder setJujuBundle(final String value) {
        this._jujuBundle = value;
        return this;
    }
    
    public JujuBundleBuilder addAugmentation(Class<? extends Augmentation<JujuBundle>> augmentationType, Augmentation<JujuBundle> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public JujuBundleBuilder removeAugmentation(Class<? extends Augmentation<JujuBundle>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public JujuBundle build() {
        return new JujuBundleImpl(this);
    }

    private static final class JujuBundleImpl implements JujuBundle {
    
        private final String _jujuBundle;
    
        private Map<Class<? extends Augmentation<JujuBundle>>, Augmentation<JujuBundle>> augmentation = Collections.emptyMap();
    
        JujuBundleImpl(JujuBundleBuilder base) {
            this._jujuBundle = base.getJujuBundle();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<JujuBundle> getImplementedInterface() {
            return JujuBundle.class;
        }
    
        @Override
        public String getJujuBundle() {
            return _jujuBundle;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<JujuBundle>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_jujuBundle);
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
            if (!JujuBundle.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            JujuBundle other = (JujuBundle)obj;
            if (!Objects.equals(_jujuBundle, other.getJujuBundle())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JujuBundleImpl otherImpl = (JujuBundleImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<JujuBundle>>, Augmentation<JujuBundle>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("JujuBundle");
            CodeHelpers.appendValue(helper, "_jujuBundle", _jujuBundle);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
