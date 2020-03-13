package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.ConfigStates;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.NsOperationalStatus;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.NsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.vnffgr.Vnffgr;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsrBuilder} instances.
 * 
 * @see NsrBuilder
 *
 */
public class NsrBuilder implements Builder<Nsr> {

    private List<ConfigAgentJob> _configAgentJob;
    private ConfigStates _configStatus;
    private List<ConnectionPoint> _connectionPoint;
    private List<ConstituentVnfrRef> _constituentVnfrRef;
    private Long _createTime;
    private List<MonitoringParam> _monitoringParam;
    private Object _nameRef;
    private NsConfiguration _nsConfiguration;
    private Uuid _nsInstanceConfigRef;
    private Object _nsdNameRef;
    private Object _nsdRef;
    private NsOperationalStatus _operationalStatus;
    private List<ScalingGroupRecord> _scalingGroupRecord;
    private Long _uptime;
    private List<Vlr> _vlr;
    private List<Vnffgr> _vnffgr;
    private NsrKey key;


    Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr arg) {
        this._vnffgr = arg.getVnffgr();
    }

    public NsrBuilder(Nsr base) {
        this.key = base.key();
        this._nsInstanceConfigRef = base.getNsInstanceConfigRef();
        this._configAgentJob = base.getConfigAgentJob();
        this._configStatus = base.getConfigStatus();
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfrRef = base.getConstituentVnfrRef();
        this._createTime = base.getCreateTime();
        this._monitoringParam = base.getMonitoringParam();
        this._nameRef = base.getNameRef();
        this._nsConfiguration = base.getNsConfiguration();
        this._nsdNameRef = base.getNsdNameRef();
        this._nsdRef = base.getNsdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._scalingGroupRecord = base.getScalingGroupRecord();
        this._uptime = base.getUptime();
        this._vlr = base.getVlr();
        this._vnffgr = base.getVnffgr();
        if (base instanceof NsrImpl) {
            NsrImpl impl = (NsrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> aug =((AugmentationHolder<Nsr>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr) {
            this._vnffgr = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr)arg).getVnffgr();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.Vnffgr]");
    }

    public NsrKey key() {
        return key;
    }
    
    public List<ConfigAgentJob> getConfigAgentJob() {
        return _configAgentJob;
    }
    
    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public List<ConstituentVnfrRef> getConstituentVnfrRef() {
        return _constituentVnfrRef;
    }
    
    public Long getCreateTime() {
        return _createTime;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public Object getNameRef() {
        return _nameRef;
    }
    
    public NsConfiguration getNsConfiguration() {
        return _nsConfiguration;
    }
    
    public Uuid getNsInstanceConfigRef() {
        return _nsInstanceConfigRef;
    }
    
    public Object getNsdNameRef() {
        return _nsdNameRef;
    }
    
    public Object getNsdRef() {
        return _nsdRef;
    }
    
    public NsOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<ScalingGroupRecord> getScalingGroupRecord() {
        return _scalingGroupRecord;
    }
    
    public Long getUptime() {
        return _uptime;
    }
    
    public List<Vlr> getVlr() {
        return _vlr;
    }
    
    public List<Vnffgr> getVnffgr() {
        return _vnffgr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Nsr>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsrBuilder withKey(final NsrKey key) {
        this.key = key;
        return this;
    }
    public NsrBuilder setConfigAgentJob(final List<ConfigAgentJob> values) {
        this._configAgentJob = values;
        return this;
    }
    
    
    public NsrBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    public NsrBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        this._connectionPoint = values;
        return this;
    }
    
    public NsrBuilder setConstituentVnfrRef(final List<ConstituentVnfrRef> values) {
        this._constituentVnfrRef = values;
        return this;
    }
    
    private static void checkCreateTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public NsrBuilder setCreateTime(final Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
        
    }
        this._createTime = value;
        return this;
    }
    public NsrBuilder setMonitoringParam(final List<MonitoringParam> values) {
        this._monitoringParam = values;
        return this;
    }
    
    
    public NsrBuilder setNameRef(final Object value) {
        this._nameRef = value;
        return this;
    }
    
    public NsrBuilder setNsConfiguration(final NsConfiguration value) {
        this._nsConfiguration = value;
        return this;
    }
    
    public NsrBuilder setNsInstanceConfigRef(final Uuid value) {
        this._nsInstanceConfigRef = value;
        return this;
    }
    
    public NsrBuilder setNsdNameRef(final Object value) {
        this._nsdNameRef = value;
        return this;
    }
    
    public NsrBuilder setNsdRef(final Object value) {
        this._nsdRef = value;
        return this;
    }
    
    public NsrBuilder setOperationalStatus(final NsOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public NsrBuilder setScalingGroupRecord(final List<ScalingGroupRecord> values) {
        this._scalingGroupRecord = values;
        return this;
    }
    
    private static void checkUptimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public NsrBuilder setUptime(final Long value) {
    if (value != null) {
        checkUptimeRange(value);
        
    }
        this._uptime = value;
        return this;
    }
    public NsrBuilder setVlr(final List<Vlr> values) {
        this._vlr = values;
        return this;
    }
    
    public NsrBuilder setVnffgr(final List<Vnffgr> values) {
        this._vnffgr = values;
        return this;
    }
    
    
    public NsrBuilder addAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsrBuilder removeAugmentation(Class<? extends Augmentation<Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl implements Nsr {
    
        private final List<ConfigAgentJob> _configAgentJob;
        private final ConfigStates _configStatus;
        private final List<ConnectionPoint> _connectionPoint;
        private final List<ConstituentVnfrRef> _constituentVnfrRef;
        private final Long _createTime;
        private final List<MonitoringParam> _monitoringParam;
        private final Object _nameRef;
        private final NsConfiguration _nsConfiguration;
        private final Uuid _nsInstanceConfigRef;
        private final Object _nsdNameRef;
        private final Object _nsdRef;
        private final NsOperationalStatus _operationalStatus;
        private final List<ScalingGroupRecord> _scalingGroupRecord;
        private final Long _uptime;
        private final List<Vlr> _vlr;
        private final List<Vnffgr> _vnffgr;
        private final NsrKey key;
    
        private Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();
    
        NsrImpl(NsrBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsrKey(base.getNsInstanceConfigRef());
            }
            this._nsInstanceConfigRef = key.getNsInstanceConfigRef();
            this._configAgentJob = base.getConfigAgentJob();
            this._configStatus = base.getConfigStatus();
            this._connectionPoint = base.getConnectionPoint();
            this._constituentVnfrRef = base.getConstituentVnfrRef();
            this._createTime = base.getCreateTime();
            this._monitoringParam = base.getMonitoringParam();
            this._nameRef = base.getNameRef();
            this._nsConfiguration = base.getNsConfiguration();
            this._nsdNameRef = base.getNsdNameRef();
            this._nsdRef = base.getNsdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._scalingGroupRecord = base.getScalingGroupRecord();
            this._uptime = base.getUptime();
            this._vlr = base.getVlr();
            this._vnffgr = base.getVnffgr();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Nsr> getImplementedInterface() {
            return Nsr.class;
        }
    
        @Override
        public NsrKey key() {
            return key;
        }
        
        @Override
        public List<ConfigAgentJob> getConfigAgentJob() {
            return _configAgentJob;
        }
        
        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public List<ConstituentVnfrRef> getConstituentVnfrRef() {
            return _constituentVnfrRef;
        }
        
        @Override
        public Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public Object getNameRef() {
            return _nameRef;
        }
        
        @Override
        public NsConfiguration getNsConfiguration() {
            return _nsConfiguration;
        }
        
        @Override
        public Uuid getNsInstanceConfigRef() {
            return _nsInstanceConfigRef;
        }
        
        @Override
        public Object getNsdNameRef() {
            return _nsdNameRef;
        }
        
        @Override
        public Object getNsdRef() {
            return _nsdRef;
        }
        
        @Override
        public NsOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<ScalingGroupRecord> getScalingGroupRecord() {
            return _scalingGroupRecord;
        }
        
        @Override
        public Long getUptime() {
            return _uptime;
        }
        
        @Override
        public List<Vlr> getVlr() {
            return _vlr;
        }
        
        @Override
        public List<Vnffgr> getVnffgr() {
            return _vnffgr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Nsr>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configAgentJob);
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfrRef);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_nameRef);
            result = prime * result + Objects.hashCode(_nsConfiguration);
            result = prime * result + Objects.hashCode(_nsInstanceConfigRef);
            result = prime * result + Objects.hashCode(_nsdNameRef);
            result = prime * result + Objects.hashCode(_nsdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_scalingGroupRecord);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vlr);
            result = prime * result + Objects.hashCode(_vnffgr);
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
            if (!Nsr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Nsr other = (Nsr)obj;
            if (!Objects.equals(_configAgentJob, other.getConfigAgentJob())) {
                return false;
            }
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfrRef, other.getConstituentVnfrRef())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_nameRef, other.getNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsConfiguration, other.getNsConfiguration())) {
                return false;
            }
            if (!Objects.equals(_nsInstanceConfigRef, other.getNsInstanceConfigRef())) {
                return false;
            }
            if (!Objects.equals(_nsdNameRef, other.getNsdNameRef())) {
                return false;
            }
            if (!Objects.equals(_nsdRef, other.getNsdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupRecord, other.getScalingGroupRecord())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vlr, other.getVlr())) {
                return false;
            }
            if (!Objects.equals(_vnffgr, other.getVnffgr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsr");
            CodeHelpers.appendValue(helper, "_configAgentJob", _configAgentJob);
            CodeHelpers.appendValue(helper, "_configStatus", _configStatus);
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_constituentVnfrRef", _constituentVnfrRef);
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_nameRef", _nameRef);
            CodeHelpers.appendValue(helper, "_nsConfiguration", _nsConfiguration);
            CodeHelpers.appendValue(helper, "_nsInstanceConfigRef", _nsInstanceConfigRef);
            CodeHelpers.appendValue(helper, "_nsdNameRef", _nsdNameRef);
            CodeHelpers.appendValue(helper, "_nsdRef", _nsdRef);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_scalingGroupRecord", _scalingGroupRecord);
            CodeHelpers.appendValue(helper, "_uptime", _uptime);
            CodeHelpers.appendValue(helper, "_vlr", _vlr);
            CodeHelpers.appendValue(helper, "_vnffgr", _vnffgr);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
