package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.scaling.group.descriptor.scaling.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ScalingCriteriaBuilder} instances.
 * 
 * @see ScalingCriteriaBuilder
 *
 */
public class ScalingCriteriaBuilder implements Builder<ScalingCriteria> {

    private String _name;
    private RelationalOperationType _scaleInRelationalOperation;
    private BigDecimal _scaleInThreshold;
    private RelationalOperationType _scaleOutRelationalOperation;
    private BigDecimal _scaleOutThreshold;
    private String _vnfMonitoringParamRef;
    private ScalingCriteriaKey key;


    Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> augmentation = Collections.emptyMap();

    public ScalingCriteriaBuilder() {
    }

    public ScalingCriteriaBuilder(ScalingCriteria base) {
        this.key = base.key();
        this._name = base.getName();
        this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
        this._scaleInThreshold = base.getScaleInThreshold();
        this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
        this._scaleOutThreshold = base.getScaleOutThreshold();
        this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
        if (base instanceof ScalingCriteriaImpl) {
            ScalingCriteriaImpl impl = (ScalingCriteriaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> aug =((AugmentationHolder<ScalingCriteria>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public ScalingCriteriaKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public RelationalOperationType getScaleInRelationalOperation() {
        return _scaleInRelationalOperation;
    }
    
    public BigDecimal getScaleInThreshold() {
        return _scaleInThreshold;
    }
    
    public RelationalOperationType getScaleOutRelationalOperation() {
        return _scaleOutRelationalOperation;
    }
    
    public BigDecimal getScaleOutThreshold() {
        return _scaleOutThreshold;
    }
    
    public String getVnfMonitoringParamRef() {
        return _vnfMonitoringParamRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingCriteria>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingCriteriaBuilder withKey(final ScalingCriteriaKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingCriteriaBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleInRelationalOperation(final RelationalOperationType value) {
        this._scaleInRelationalOperation = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleInThreshold(final BigDecimal value) {
    if (value != null) {
        
    }
        this._scaleInThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleOutRelationalOperation(final RelationalOperationType value) {
        this._scaleOutRelationalOperation = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleOutThreshold(final BigDecimal value) {
    if (value != null) {
        
    }
        this._scaleOutThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setVnfMonitoringParamRef(final String value) {
        this._vnfMonitoringParamRef = value;
        return this;
    }
    
    public ScalingCriteriaBuilder addAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType, Augmentation<ScalingCriteria> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingCriteriaBuilder removeAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingCriteria build() {
        return new ScalingCriteriaImpl(this);
    }

    private static final class ScalingCriteriaImpl implements ScalingCriteria {
    
        private final String _name;
        private final RelationalOperationType _scaleInRelationalOperation;
        private final BigDecimal _scaleInThreshold;
        private final RelationalOperationType _scaleOutRelationalOperation;
        private final BigDecimal _scaleOutThreshold;
        private final String _vnfMonitoringParamRef;
        private final ScalingCriteriaKey key;
    
        private Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> augmentation = Collections.emptyMap();
    
        ScalingCriteriaImpl(ScalingCriteriaBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ScalingCriteriaKey(base.getName());
            }
            this._name = key.getName();
            this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
            this._scaleInThreshold = base.getScaleInThreshold();
            this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
            this._scaleOutThreshold = base.getScaleOutThreshold();
            this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ScalingCriteria> getImplementedInterface() {
            return ScalingCriteria.class;
        }
    
        @Override
        public ScalingCriteriaKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public RelationalOperationType getScaleInRelationalOperation() {
            return _scaleInRelationalOperation;
        }
        
        @Override
        public BigDecimal getScaleInThreshold() {
            return _scaleInThreshold;
        }
        
        @Override
        public RelationalOperationType getScaleOutRelationalOperation() {
            return _scaleOutRelationalOperation;
        }
        
        @Override
        public BigDecimal getScaleOutThreshold() {
            return _scaleOutThreshold;
        }
        
        @Override
        public String getVnfMonitoringParamRef() {
            return _vnfMonitoringParamRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingCriteria>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scaleInRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleInThreshold);
            result = prime * result + Objects.hashCode(_scaleOutRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleOutThreshold);
            result = prime * result + Objects.hashCode(_vnfMonitoringParamRef);
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
            if (!ScalingCriteria.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingCriteria other = (ScalingCriteria)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scaleInRelationalOperation, other.getScaleInRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleInThreshold, other.getScaleInThreshold())) {
                return false;
            }
            if (!Objects.equals(_scaleOutRelationalOperation, other.getScaleOutRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleOutThreshold, other.getScaleOutThreshold())) {
                return false;
            }
            if (!Objects.equals(_vnfMonitoringParamRef, other.getVnfMonitoringParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingCriteriaImpl otherImpl = (ScalingCriteriaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingCriteria");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scaleInRelationalOperation", _scaleInRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleInThreshold", _scaleInThreshold);
            CodeHelpers.appendValue(helper, "_scaleOutRelationalOperation", _scaleOutRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleOutThreshold", _scaleOutThreshold);
            CodeHelpers.appendValue(helper, "_vnfMonitoringParamRef", _vnfMonitoringParamRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
