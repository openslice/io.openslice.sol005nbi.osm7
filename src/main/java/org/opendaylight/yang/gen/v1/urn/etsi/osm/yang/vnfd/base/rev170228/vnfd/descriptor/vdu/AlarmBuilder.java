package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmSeverityType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmStatisticType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RelationalOperationType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.alarm.properties.Actions;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link AlarmBuilder} instances.
 * 
 * @see AlarmBuilder
 *
 */
public class AlarmBuilder implements Builder<Alarm> {

    private Actions _actions;
    private String _alarmId;
    private String _description;
    private Long _evaluations;
    private String _name;
    private RelationalOperationType _operation;
    private Long _period;
    private AlarmSeverityType _severity;
    private AlarmStatisticType _statistic;
    private BigDecimal _value;
    private String _vdurId;
    private String _vnfMonitoringParamRef;
    private Boolean _enabled;
    private Boolean _repeat;
    private AlarmKey key;


    Map<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> augmentation = Collections.emptyMap();

    public AlarmBuilder() {
    }
    public AlarmBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties arg) {
        this._name = arg.getName();
        this._description = arg.getDescription();
        this._vdurId = arg.getVdurId();
        this._actions = arg.getActions();
        this._repeat = arg.isRepeat();
        this._enabled = arg.isEnabled();
        this._severity = arg.getSeverity();
        this._statistic = arg.getStatistic();
        this._operation = arg.getOperation();
        this._value = arg.getValue();
        this._period = arg.getPeriod();
        this._evaluations = arg.getEvaluations();
    }

    public AlarmBuilder(Alarm base) {
        this.key = base.key();
        this._alarmId = base.getAlarmId();
        this._actions = base.getActions();
        this._description = base.getDescription();
        this._evaluations = base.getEvaluations();
        this._name = base.getName();
        this._operation = base.getOperation();
        this._period = base.getPeriod();
        this._severity = base.getSeverity();
        this._statistic = base.getStatistic();
        this._value = base.getValue();
        this._vdurId = base.getVdurId();
        this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
        this._enabled = base.isEnabled();
        this._repeat = base.isRepeat();
        if (base instanceof AlarmImpl) {
            AlarmImpl impl = (AlarmImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> aug =((AugmentationHolder<Alarm>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties) {
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getName();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getDescription();
            this._vdurId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getVdurId();
            this._actions = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getActions();
            this._repeat = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).isRepeat();
            this._enabled = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).isEnabled();
            this._severity = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getSeverity();
            this._statistic = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getStatistic();
            this._operation = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getOperation();
            this._value = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getValue();
            this._period = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getPeriod();
            this._evaluations = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties)arg).getEvaluations();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties]");
    }

    public AlarmKey key() {
        return key;
    }
    
    public Actions getActions() {
        return _actions;
    }
    
    public String getAlarmId() {
        return _alarmId;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Long getEvaluations() {
        return _evaluations;
    }
    
    public String getName() {
        return _name;
    }
    
    public RelationalOperationType getOperation() {
        return _operation;
    }
    
    public Long getPeriod() {
        return _period;
    }
    
    public AlarmSeverityType getSeverity() {
        return _severity;
    }
    
    public AlarmStatisticType getStatistic() {
        return _statistic;
    }
    
    public BigDecimal getValue() {
        return _value;
    }
    
    public String getVdurId() {
        return _vdurId;
    }
    
    public String getVnfMonitoringParamRef() {
        return _vnfMonitoringParamRef;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }
    
    public Boolean isRepeat() {
        return _repeat;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Alarm>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public AlarmBuilder withKey(final AlarmKey key) {
        this.key = key;
        return this;
    }
    
    public AlarmBuilder setActions(final Actions value) {
        this._actions = value;
        return this;
    }
    
    public AlarmBuilder setAlarmId(final String value) {
        this._alarmId = value;
        return this;
    }
    
    public AlarmBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    private static void checkEvaluationsRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public AlarmBuilder setEvaluations(final Long value) {
    if (value != null) {
        checkEvaluationsRange(value);
        
    }
        this._evaluations = value;
        return this;
    }
    
    public AlarmBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public AlarmBuilder setOperation(final RelationalOperationType value) {
        this._operation = value;
        return this;
    }
    private static void checkPeriodRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public AlarmBuilder setPeriod(final Long value) {
    if (value != null) {
        checkPeriodRange(value);
        
    }
        this._period = value;
        return this;
    }
    
    public AlarmBuilder setSeverity(final AlarmSeverityType value) {
        this._severity = value;
        return this;
    }
    
    public AlarmBuilder setStatistic(final AlarmStatisticType value) {
        this._statistic = value;
        return this;
    }
    
    public AlarmBuilder setValue(final BigDecimal value) {
    if (value != null) {
        
    }
        this._value = value;
        return this;
    }
    
    public AlarmBuilder setVdurId(final String value) {
        this._vdurId = value;
        return this;
    }
    
    public AlarmBuilder setVnfMonitoringParamRef(final String value) {
        this._vnfMonitoringParamRef = value;
        return this;
    }
    
    public AlarmBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public AlarmBuilder setRepeat(final Boolean value) {
        this._repeat = value;
        return this;
    }
    
    public AlarmBuilder addAugmentation(Class<? extends Augmentation<Alarm>> augmentationType, Augmentation<Alarm> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AlarmBuilder removeAugmentation(Class<? extends Augmentation<Alarm>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Alarm build() {
        return new AlarmImpl(this);
    }

    private static final class AlarmImpl implements Alarm {
    
        private final Actions _actions;
        private final String _alarmId;
        private final String _description;
        private final Long _evaluations;
        private final String _name;
        private final RelationalOperationType _operation;
        private final Long _period;
        private final AlarmSeverityType _severity;
        private final AlarmStatisticType _statistic;
        private final BigDecimal _value;
        private final String _vdurId;
        private final String _vnfMonitoringParamRef;
        private final Boolean _enabled;
        private final Boolean _repeat;
        private final AlarmKey key;
    
        private Map<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> augmentation = Collections.emptyMap();
    
        AlarmImpl(AlarmBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new AlarmKey(base.getAlarmId());
            }
            this._alarmId = key.getAlarmId();
            this._actions = base.getActions();
            this._description = base.getDescription();
            this._evaluations = base.getEvaluations();
            this._name = base.getName();
            this._operation = base.getOperation();
            this._period = base.getPeriod();
            this._severity = base.getSeverity();
            this._statistic = base.getStatistic();
            this._value = base.getValue();
            this._vdurId = base.getVdurId();
            this._vnfMonitoringParamRef = base.getVnfMonitoringParamRef();
            this._enabled = base.isEnabled();
            this._repeat = base.isRepeat();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Alarm> getImplementedInterface() {
            return Alarm.class;
        }
    
        @Override
        public AlarmKey key() {
            return key;
        }
        
        @Override
        public Actions getActions() {
            return _actions;
        }
        
        @Override
        public String getAlarmId() {
            return _alarmId;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Long getEvaluations() {
            return _evaluations;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public RelationalOperationType getOperation() {
            return _operation;
        }
        
        @Override
        public Long getPeriod() {
            return _period;
        }
        
        @Override
        public AlarmSeverityType getSeverity() {
            return _severity;
        }
        
        @Override
        public AlarmStatisticType getStatistic() {
            return _statistic;
        }
        
        @Override
        public BigDecimal getValue() {
            return _value;
        }
        
        @Override
        public String getVdurId() {
            return _vdurId;
        }
        
        @Override
        public String getVnfMonitoringParamRef() {
            return _vnfMonitoringParamRef;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
        }
        
        @Override
        public Boolean isRepeat() {
            return _repeat;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Alarm>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_actions);
            result = prime * result + Objects.hashCode(_alarmId);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_evaluations);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operation);
            result = prime * result + Objects.hashCode(_period);
            result = prime * result + Objects.hashCode(_severity);
            result = prime * result + Objects.hashCode(_statistic);
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_vdurId);
            result = prime * result + Objects.hashCode(_vnfMonitoringParamRef);
            result = prime * result + Objects.hashCode(_enabled);
            result = prime * result + Objects.hashCode(_repeat);
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
            if (!Alarm.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Alarm other = (Alarm)obj;
            if (!Objects.equals(_actions, other.getActions())) {
                return false;
            }
            if (!Objects.equals(_alarmId, other.getAlarmId())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_evaluations, other.getEvaluations())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operation, other.getOperation())) {
                return false;
            }
            if (!Objects.equals(_period, other.getPeriod())) {
                return false;
            }
            if (!Objects.equals(_severity, other.getSeverity())) {
                return false;
            }
            if (!Objects.equals(_statistic, other.getStatistic())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_vdurId, other.getVdurId())) {
                return false;
            }
            if (!Objects.equals(_vnfMonitoringParamRef, other.getVnfMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (!Objects.equals(_repeat, other.isRepeat())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AlarmImpl otherImpl = (AlarmImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Alarm>>, Augmentation<Alarm>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Alarm");
            CodeHelpers.appendValue(helper, "_actions", _actions);
            CodeHelpers.appendValue(helper, "_alarmId", _alarmId);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_evaluations", _evaluations);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operation", _operation);
            CodeHelpers.appendValue(helper, "_period", _period);
            CodeHelpers.appendValue(helper, "_severity", _severity);
            CodeHelpers.appendValue(helper, "_statistic", _statistic);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "_vdurId", _vdurId);
            CodeHelpers.appendValue(helper, "_vnfMonitoringParamRef", _vnfMonitoringParamRef);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "_repeat", _repeat);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
