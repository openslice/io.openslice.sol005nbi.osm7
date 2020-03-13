package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.k8s.cluster.Nets;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link K8sClusterBuilder} instances.
 * 
 * @see K8sClusterBuilder
 *
 */
public class K8sClusterBuilder implements Builder<K8sCluster> {

    private List<K8sCluster.Cni> _cni;
    private List<Nets> _nets;
    private List<String> _version;


    Map<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> augmentation = Collections.emptyMap();

    public K8sClusterBuilder() {
    }

    public K8sClusterBuilder(K8sCluster base) {
        this._cni = base.getCni();
        this._nets = base.getNets();
        this._version = base.getVersion();
        if (base instanceof K8sClusterImpl) {
            K8sClusterImpl impl = (K8sClusterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> aug =((AugmentationHolder<K8sCluster>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<K8sCluster.Cni> getCni() {
        return _cni;
    }
    
    public List<Nets> getNets() {
        return _nets;
    }
    
    public List<String> getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<K8sCluster>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public K8sClusterBuilder setCni(final List<K8sCluster.Cni> values) {
        this._cni = values;
        return this;
    }
    
    public K8sClusterBuilder setNets(final List<Nets> values) {
        this._nets = values;
        return this;
    }
    
    public K8sClusterBuilder setVersion(final List<String> values) {
        this._version = values;
        return this;
    }
    
    
    public K8sClusterBuilder addAugmentation(Class<? extends Augmentation<K8sCluster>> augmentationType, Augmentation<K8sCluster> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public K8sClusterBuilder removeAugmentation(Class<? extends Augmentation<K8sCluster>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public K8sCluster build() {
        return new K8sClusterImpl(this);
    }

    private static final class K8sClusterImpl implements K8sCluster {
    
        private final List<K8sCluster.Cni> _cni;
        private final List<Nets> _nets;
        private final List<String> _version;
    
        private Map<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> augmentation = Collections.emptyMap();
    
        K8sClusterImpl(K8sClusterBuilder base) {
            this._cni = base.getCni();
            this._nets = base.getNets();
            this._version = base.getVersion();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<K8sCluster> getImplementedInterface() {
            return K8sCluster.class;
        }
    
        @Override
        public List<K8sCluster.Cni> getCni() {
            return _cni;
        }
        
        @Override
        public List<Nets> getNets() {
            return _nets;
        }
        
        @Override
        public List<String> getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<K8sCluster>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cni);
            result = prime * result + Objects.hashCode(_nets);
            result = prime * result + Objects.hashCode(_version);
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
            if (!K8sCluster.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            K8sCluster other = (K8sCluster)obj;
            if (!Objects.equals(_cni, other.getCni())) {
                return false;
            }
            if (!Objects.equals(_nets, other.getNets())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                K8sClusterImpl otherImpl = (K8sClusterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<K8sCluster>>, Augmentation<K8sCluster>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("K8sCluster");
            CodeHelpers.appendValue(helper, "_cni", _cni);
            CodeHelpers.appendValue(helper, "_nets", _nets);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
