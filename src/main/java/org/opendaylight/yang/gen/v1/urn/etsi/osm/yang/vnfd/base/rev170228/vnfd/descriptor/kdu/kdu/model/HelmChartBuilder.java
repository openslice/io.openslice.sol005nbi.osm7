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
 * Class that builds {@link HelmChartBuilder} instances.
 * 
 * @see HelmChartBuilder
 *
 */
public class HelmChartBuilder implements Builder<HelmChart> {

    private String _helmChart;


    Map<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> augmentation = Collections.emptyMap();

    public HelmChartBuilder() {
    }

    public HelmChartBuilder(HelmChart base) {
        this._helmChart = base.getHelmChart();
        if (base instanceof HelmChartImpl) {
            HelmChartImpl impl = (HelmChartImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> aug =((AugmentationHolder<HelmChart>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getHelmChart() {
        return _helmChart;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<HelmChart>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public HelmChartBuilder setHelmChart(final String value) {
        this._helmChart = value;
        return this;
    }
    
    public HelmChartBuilder addAugmentation(Class<? extends Augmentation<HelmChart>> augmentationType, Augmentation<HelmChart> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HelmChartBuilder removeAugmentation(Class<? extends Augmentation<HelmChart>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HelmChart build() {
        return new HelmChartImpl(this);
    }

    private static final class HelmChartImpl implements HelmChart {
    
        private final String _helmChart;
    
        private Map<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> augmentation = Collections.emptyMap();
    
        HelmChartImpl(HelmChartBuilder base) {
            this._helmChart = base.getHelmChart();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<HelmChart> getImplementedInterface() {
            return HelmChart.class;
        }
    
        @Override
        public String getHelmChart() {
            return _helmChart;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<HelmChart>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_helmChart);
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
            if (!HelmChart.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            HelmChart other = (HelmChart)obj;
            if (!Objects.equals(_helmChart, other.getHelmChart())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HelmChartImpl otherImpl = (HelmChartImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HelmChart>>, Augmentation<HelmChart>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HelmChart");
            CodeHelpers.appendValue(helper, "_helmChart", _helmChart);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
