package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type;
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
 * Class that builds {@link VduMetricBuilder} instances.
 * 
 * @see VduMetricBuilder
 *
 */
public class VduMetricBuilder implements Builder<VduMetric> {

    private org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric _vduMetric;


    Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> augmentation = Collections.emptyMap();

    public VduMetricBuilder() {
    }

    public VduMetricBuilder(VduMetric base) {
        this._vduMetric = base.getVduMetric();
        if (base instanceof VduMetricImpl) {
            VduMetricImpl impl = (VduMetricImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> aug =((AugmentationHolder<VduMetric>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric getVduMetric() {
        return _vduMetric;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VduMetric>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VduMetricBuilder setVduMetric(final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric value) {
        this._vduMetric = value;
        return this;
    }
    
    public VduMetricBuilder addAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType, Augmentation<VduMetric> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduMetricBuilder removeAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduMetric build() {
        return new VduMetricImpl(this);
    }

    private static final class VduMetricImpl implements VduMetric {
    
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric _vduMetric;
    
        private Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> augmentation = Collections.emptyMap();
    
        VduMetricImpl(VduMetricBuilder base) {
            this._vduMetric = base.getVduMetric();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VduMetric> getImplementedInterface() {
            return VduMetric.class;
        }
    
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric getVduMetric() {
            return _vduMetric;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VduMetric>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduMetric);
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
            if (!VduMetric.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduMetric other = (VduMetric)obj;
            if (!Objects.equals(_vduMetric, other.getVduMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMetricImpl otherImpl = (VduMetricImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMetric");
            CodeHelpers.appendValue(helper, "_vduMetric", _vduMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
