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
 * Class that builds {@link VduMonitoringParamBuilder} instances.
 * 
 * @see VduMonitoringParamBuilder
 *
 */
public class VduMonitoringParamBuilder implements Builder<VduMonitoringParam> {

    private org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam _vduMonitoringParam;


    Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> augmentation = Collections.emptyMap();

    public VduMonitoringParamBuilder() {
    }

    public VduMonitoringParamBuilder(VduMonitoringParam base) {
        this._vduMonitoringParam = base.getVduMonitoringParam();
        if (base instanceof VduMonitoringParamImpl) {
            VduMonitoringParamImpl impl = (VduMonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> aug =((AugmentationHolder<VduMonitoringParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam getVduMonitoringParam() {
        return _vduMonitoringParam;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VduMonitoringParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VduMonitoringParamBuilder setVduMonitoringParam(final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam value) {
        this._vduMonitoringParam = value;
        return this;
    }
    
    public VduMonitoringParamBuilder addAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType, Augmentation<VduMonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduMonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduMonitoringParam build() {
        return new VduMonitoringParamImpl(this);
    }

    private static final class VduMonitoringParamImpl implements VduMonitoringParam {
    
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam _vduMonitoringParam;
    
        private Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> augmentation = Collections.emptyMap();
    
        VduMonitoringParamImpl(VduMonitoringParamBuilder base) {
            this._vduMonitoringParam = base.getVduMonitoringParam();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VduMonitoringParam> getImplementedInterface() {
            return VduMonitoringParam.class;
        }
    
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam getVduMonitoringParam() {
            return _vduMonitoringParam;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VduMonitoringParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduMonitoringParam);
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
            if (!VduMonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduMonitoringParam other = (VduMonitoringParam)obj;
            if (!Objects.equals(_vduMonitoringParam, other.getVduMonitoringParam())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMonitoringParamImpl otherImpl = (VduMonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMonitoringParam");
            CodeHelpers.appendValue(helper, "_vduMonitoringParam", _vduMonitoringParam);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
