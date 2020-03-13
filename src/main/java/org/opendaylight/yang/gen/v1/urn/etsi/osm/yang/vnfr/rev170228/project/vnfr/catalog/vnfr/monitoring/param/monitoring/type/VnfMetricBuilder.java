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
 * Class that builds {@link VnfMetricBuilder} instances.
 * 
 * @see VnfMetricBuilder
 *
 */
public class VnfMetricBuilder implements Builder<VnfMetric> {

    private org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric _vnfMetric;


    Map<Class<? extends Augmentation<VnfMetric>>, Augmentation<VnfMetric>> augmentation = Collections.emptyMap();

    public VnfMetricBuilder() {
    }

    public VnfMetricBuilder(VnfMetric base) {
        this._vnfMetric = base.getVnfMetric();
        if (base instanceof VnfMetricImpl) {
            VnfMetricImpl impl = (VnfMetricImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfMetric>>, Augmentation<VnfMetric>> aug =((AugmentationHolder<VnfMetric>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric getVnfMetric() {
        return _vnfMetric;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfMetric>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VnfMetricBuilder setVnfMetric(final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric value) {
        this._vnfMetric = value;
        return this;
    }
    
    public VnfMetricBuilder addAugmentation(Class<? extends Augmentation<VnfMetric>> augmentationType, Augmentation<VnfMetric> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfMetricBuilder removeAugmentation(Class<? extends Augmentation<VnfMetric>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfMetric build() {
        return new VnfMetricImpl(this);
    }

    private static final class VnfMetricImpl implements VnfMetric {
    
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric _vnfMetric;
    
        private Map<Class<? extends Augmentation<VnfMetric>>, Augmentation<VnfMetric>> augmentation = Collections.emptyMap();
    
        VnfMetricImpl(VnfMetricBuilder base) {
            this._vnfMetric = base.getVnfMetric();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfMetric> getImplementedInterface() {
            return VnfMetric.class;
        }
    
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vnf.metric.VnfMetric getVnfMetric() {
            return _vnfMetric;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfMetric>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfMetric);
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
            if (!VnfMetric.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfMetric other = (VnfMetric)obj;
            if (!Objects.equals(_vnfMetric, other.getVnfMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfMetricImpl otherImpl = (VnfMetricImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfMetric>>, Augmentation<VnfMetric>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfMetric");
            CodeHelpers.appendValue(helper, "_vnfMetric", _vnfMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
