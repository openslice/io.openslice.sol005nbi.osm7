package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation.AggregationType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link MonitoringParamBuilder} instances.
 * 
 * @see MonitoringParamBuilder
 *
 */
public class MonitoringParamBuilder implements Builder<MonitoringParam> {

    private AggregationType _aggregationType;
    private String _id;
    private MonitoringType _monitoringType;
    private String _name;
    private MonitoringParamKey key;


    Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();

    public MonitoringParamBuilder() {
    }
    public MonitoringParamBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation arg) {
        this._aggregationType = arg.getAggregationType();
    }

    public MonitoringParamBuilder(MonitoringParam base) {
        this.key = base.key();
        this._id = base.getId();
        this._aggregationType = base.getAggregationType();
        this._monitoringType = base.getMonitoringType();
        this._name = base.getName();
        if (base instanceof MonitoringParamImpl) {
            MonitoringParamImpl impl = (MonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> aug =((AugmentationHolder<MonitoringParam>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation) {
            this._aggregationType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation)arg).getAggregationType();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation]");
    }

    public MonitoringParamKey key() {
        return key;
    }
    
    public AggregationType getAggregationType() {
        return _aggregationType;
    }
    
    public String getId() {
        return _id;
    }
    
    public MonitoringType getMonitoringType() {
        return _monitoringType;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MonitoringParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MonitoringParamBuilder withKey(final MonitoringParamKey key) {
        this.key = key;
        return this;
    }
    
    public MonitoringParamBuilder setAggregationType(final AggregationType value) {
        this._aggregationType = value;
        return this;
    }
    
    public MonitoringParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParamBuilder setMonitoringType(final MonitoringType value) {
        this._monitoringType = value;
        return this;
    }
    
    public MonitoringParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public MonitoringParamBuilder addAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType, Augmentation<MonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MonitoringParam build() {
        return new MonitoringParamImpl(this);
    }

    private static final class MonitoringParamImpl implements MonitoringParam {
    
        private final org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation.AggregationType _aggregationType;
        private final String _id;
        private final MonitoringType _monitoringType;
        private final String _name;
        private final MonitoringParamKey key;
    
        private Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();
    
        MonitoringParamImpl(MonitoringParamBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new MonitoringParamKey(base.getId());
            }
            this._id = key.getId();
            this._aggregationType = base.getAggregationType();
            this._monitoringType = base.getMonitoringType();
            this._name = base.getName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<MonitoringParam> getImplementedInterface() {
            return MonitoringParam.class;
        }
    
        @Override
        public MonitoringParamKey key() {
            return key;
        }
        
        @Override
        public org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation.AggregationType getAggregationType() {
            return _aggregationType;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public MonitoringType getMonitoringType() {
            return _monitoringType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MonitoringParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aggregationType);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_monitoringType);
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
            if (!MonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MonitoringParam other = (MonitoringParam)obj;
            if (!Objects.equals(_aggregationType, other.getAggregationType())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_monitoringType, other.getMonitoringType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParamImpl otherImpl = (MonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MonitoringParam");
            CodeHelpers.appendValue(helper, "_aggregationType", _aggregationType);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_monitoringType", _monitoringType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
