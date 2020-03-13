package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation.AggregationType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ParamValueType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.WidgetType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.NumericConstraints;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.TextConstraints;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam;
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
    private String _description;
    private String _groupTag;
    private String _id;
    private String _name;
    private NumericConstraints _numericConstraints;
    private TextConstraints _textConstraints;
    private String _units;
    private BigDecimal _valueDecimal;
    private Long _valueInteger;
    private String _valueString;
    private ParamValueType _valueType;
    private List<VnfdMonitoringParam> _vnfdMonitoringParam;
    private WidgetType _widgetType;
    private MonitoringParamKey key;


    Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();

    public MonitoringParamBuilder() {
    }
    public MonitoringParamBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._valueType = arg.getValueType();
        this._numericConstraints = arg.getNumericConstraints();
        this._textConstraints = arg.getTextConstraints();
        this._valueInteger = arg.getValueInteger();
        this._valueDecimal = arg.getValueDecimal();
        this._valueString = arg.getValueString();
        this._description = arg.getDescription();
        this._groupTag = arg.getGroupTag();
        this._widgetType = arg.getWidgetType();
        this._units = arg.getUnits();
        this._aggregationType = arg.getAggregationType();
    }
    public MonitoringParamBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue arg) {
        this._valueType = arg.getValueType();
        this._numericConstraints = arg.getNumericConstraints();
        this._textConstraints = arg.getTextConstraints();
        this._valueInteger = arg.getValueInteger();
        this._valueDecimal = arg.getValueDecimal();
        this._valueString = arg.getValueString();
    }
    public MonitoringParamBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData arg) {
        this._description = arg.getDescription();
        this._groupTag = arg.getGroupTag();
        this._widgetType = arg.getWidgetType();
        this._units = arg.getUnits();
    }
    public MonitoringParamBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation arg) {
        this._aggregationType = arg.getAggregationType();
    }

    public MonitoringParamBuilder(MonitoringParam base) {
        this.key = base.key();
        this._id = base.getId();
        this._aggregationType = base.getAggregationType();
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._name = base.getName();
        this._numericConstraints = base.getNumericConstraints();
        this._textConstraints = base.getTextConstraints();
        this._units = base.getUnits();
        this._valueDecimal = base.getValueDecimal();
        this._valueInteger = base.getValueInteger();
        this._valueString = base.getValueString();
        this._valueType = base.getValueType();
        this._vnfdMonitoringParam = base.getVnfdMonitoringParam();
        this._widgetType = base.getWidgetType();
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
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon</li>
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue) {
            this._valueType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getValueType();
            this._numericConstraints = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getNumericConstraints();
            this._textConstraints = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getTextConstraints();
            this._valueInteger = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getValueInteger();
            this._valueDecimal = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getValueDecimal();
            this._valueString = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue)arg).getValueString();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData) {
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData)arg).getDescription();
            this._groupTag = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData)arg).getGroupTag();
            this._widgetType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData)arg).getWidgetType();
            this._units = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData)arg).getUnits();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon)arg).getName();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamAggregation, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamValue, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.MonitoringParamUiData, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.MonitoringParamCommon]");
    }

    public MonitoringParamKey key() {
        return key;
    }
    
    public AggregationType getAggregationType() {
        return _aggregationType;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getGroupTag() {
        return _groupTag;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public NumericConstraints getNumericConstraints() {
        return _numericConstraints;
    }
    
    public TextConstraints getTextConstraints() {
        return _textConstraints;
    }
    
    public String getUnits() {
        return _units;
    }
    
    public BigDecimal getValueDecimal() {
        return _valueDecimal;
    }
    
    public Long getValueInteger() {
        return _valueInteger;
    }
    
    public String getValueString() {
        return _valueString;
    }
    
    public ParamValueType getValueType() {
        return _valueType;
    }
    
    public List<VnfdMonitoringParam> getVnfdMonitoringParam() {
        return _vnfdMonitoringParam;
    }
    
    public WidgetType getWidgetType() {
        return _widgetType;
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
    
    public MonitoringParamBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public MonitoringParamBuilder setGroupTag(final String value) {
        this._groupTag = value;
        return this;
    }
    
    public MonitoringParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public MonitoringParamBuilder setNumericConstraints(final NumericConstraints value) {
        this._numericConstraints = value;
        return this;
    }
    
    public MonitoringParamBuilder setTextConstraints(final TextConstraints value) {
        this._textConstraints = value;
        return this;
    }
    
    public MonitoringParamBuilder setUnits(final String value) {
        this._units = value;
        return this;
    }
    
    public MonitoringParamBuilder setValueDecimal(final BigDecimal value) {
    if (value != null) {
        
    }
        this._valueDecimal = value;
        return this;
    }
    
    public MonitoringParamBuilder setValueInteger(final Long value) {
        this._valueInteger = value;
        return this;
    }
    
    public MonitoringParamBuilder setValueString(final String value) {
        this._valueString = value;
        return this;
    }
    
    public MonitoringParamBuilder setValueType(final ParamValueType value) {
        this._valueType = value;
        return this;
    }
    public MonitoringParamBuilder setVnfdMonitoringParam(final List<VnfdMonitoringParam> values) {
        this._vnfdMonitoringParam = values;
        return this;
    }
    
    
    public MonitoringParamBuilder setWidgetType(final WidgetType value) {
        this._widgetType = value;
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
        private final String _description;
        private final String _groupTag;
        private final String _id;
        private final String _name;
        private final NumericConstraints _numericConstraints;
        private final TextConstraints _textConstraints;
        private final String _units;
        private final BigDecimal _valueDecimal;
        private final Long _valueInteger;
        private final String _valueString;
        private final ParamValueType _valueType;
        private final List<VnfdMonitoringParam> _vnfdMonitoringParam;
        private final WidgetType _widgetType;
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
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._name = base.getName();
            this._numericConstraints = base.getNumericConstraints();
            this._textConstraints = base.getTextConstraints();
            this._units = base.getUnits();
            this._valueDecimal = base.getValueDecimal();
            this._valueInteger = base.getValueInteger();
            this._valueString = base.getValueString();
            this._valueType = base.getValueType();
            this._vnfdMonitoringParam = base.getVnfdMonitoringParam();
            this._widgetType = base.getWidgetType();
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
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public NumericConstraints getNumericConstraints() {
            return _numericConstraints;
        }
        
        @Override
        public TextConstraints getTextConstraints() {
            return _textConstraints;
        }
        
        @Override
        public String getUnits() {
            return _units;
        }
        
        @Override
        public BigDecimal getValueDecimal() {
            return _valueDecimal;
        }
        
        @Override
        public Long getValueInteger() {
            return _valueInteger;
        }
        
        @Override
        public String getValueString() {
            return _valueString;
        }
        
        @Override
        public ParamValueType getValueType() {
            return _valueType;
        }
        
        @Override
        public List<VnfdMonitoringParam> getVnfdMonitoringParam() {
            return _vnfdMonitoringParam;
        }
        
        @Override
        public WidgetType getWidgetType() {
            return _widgetType;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_numericConstraints);
            result = prime * result + Objects.hashCode(_textConstraints);
            result = prime * result + Objects.hashCode(_units);
            result = prime * result + Objects.hashCode(_valueDecimal);
            result = prime * result + Objects.hashCode(_valueInteger);
            result = prime * result + Objects.hashCode(_valueString);
            result = prime * result + Objects.hashCode(_valueType);
            result = prime * result + Objects.hashCode(_vnfdMonitoringParam);
            result = prime * result + Objects.hashCode(_widgetType);
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
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_numericConstraints, other.getNumericConstraints())) {
                return false;
            }
            if (!Objects.equals(_textConstraints, other.getTextConstraints())) {
                return false;
            }
            if (!Objects.equals(_units, other.getUnits())) {
                return false;
            }
            if (!Objects.equals(_valueDecimal, other.getValueDecimal())) {
                return false;
            }
            if (!Objects.equals(_valueInteger, other.getValueInteger())) {
                return false;
            }
            if (!Objects.equals(_valueString, other.getValueString())) {
                return false;
            }
            if (!Objects.equals(_valueType, other.getValueType())) {
                return false;
            }
            if (!Objects.equals(_vnfdMonitoringParam, other.getVnfdMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_widgetType, other.getWidgetType())) {
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
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_groupTag", _groupTag);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_numericConstraints", _numericConstraints);
            CodeHelpers.appendValue(helper, "_textConstraints", _textConstraints);
            CodeHelpers.appendValue(helper, "_units", _units);
            CodeHelpers.appendValue(helper, "_valueDecimal", _valueDecimal);
            CodeHelpers.appendValue(helper, "_valueInteger", _valueInteger);
            CodeHelpers.appendValue(helper, "_valueString", _valueString);
            CodeHelpers.appendValue(helper, "_valueType", _valueType);
            CodeHelpers.appendValue(helper, "_vnfdMonitoringParam", _vnfdMonitoringParam);
            CodeHelpers.appendValue(helper, "_widgetType", _widgetType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
