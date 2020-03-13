package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.primitive.parameter.value.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.ParameterGroup;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.exec.ns.config.primitive.output.VnfOutList;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ExecNsConfigPrimitiveOutputBuilder} instances.
 * 
 * @see ExecNsConfigPrimitiveOutputBuilder
 *
 */
public class ExecNsConfigPrimitiveOutputBuilder implements Builder<ExecNsConfigPrimitiveOutput> {

    private Long _createTime;
    private BigInteger _jobId;
    private String _jobStatusDetails;
    private String _name;
    private Object _nsrIdRef;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private String _projectName;
    private TriggerType _triggeredBy;
    private List<VnfOutList> _vnfOutList;


    Map<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> augmentation = Collections.emptyMap();

    public ExecNsConfigPrimitiveOutputBuilder() {
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public ExecNsConfigPrimitiveOutputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ExecNsConfigPrimitiveOutputBuilder(ExecNsConfigPrimitiveOutput base) {
        this._createTime = base.getCreateTime();
        this._jobId = base.getJobId();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._projectName = base.getProjectName();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfOutList = base.getVnfOutList();
        if (base instanceof ExecNsConfigPrimitiveOutputImpl) {
            ExecNsConfigPrimitiveOutputImpl impl = (ExecNsConfigPrimitiveOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> aug =((AugmentationHolder<ExecNsConfigPrimitiveOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon]");
    }

    public Long getCreateTime() {
        return _createTime;
    }
    
    public BigInteger getJobId() {
        return _jobId;
    }
    
    public String getJobStatusDetails() {
        return _jobStatusDetails;
    }
    
    public String getName() {
        return _name;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public List<VnfOutList> getVnfOutList() {
        return _vnfOutList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExecNsConfigPrimitiveOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkCreateTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setCreateTime(final Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
        
    }
        this._createTime = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKJOBIDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKJOBIDRANGE_RANGES = a;
    }
    private static void checkJobIdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKJOBIDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKJOBIDRANGE_RANGES, value);
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setJobId(final BigInteger value) {
    if (value != null) {
        checkJobIdRange(value);
        
    }
        this._jobId = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setJobStatusDetails(final String value) {
        this._jobStatusDetails = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    public ExecNsConfigPrimitiveOutputBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setParameterGroup(final List<ParameterGroup> values) {
        this._parameterGroup = values;
        return this;
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setProjectName(final String value) {
    if (value != null) {
        check_projectNameLength(value);
        
    }
        this._projectName = value;
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    public ExecNsConfigPrimitiveOutputBuilder setVnfOutList(final List<VnfOutList> values) {
        this._vnfOutList = values;
        return this;
    }
    
    
    public ExecNsConfigPrimitiveOutputBuilder addAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>> augmentationType, Augmentation<ExecNsConfigPrimitiveOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecNsConfigPrimitiveOutputBuilder removeAugmentation(Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecNsConfigPrimitiveOutput build() {
        return new ExecNsConfigPrimitiveOutputImpl(this);
    }

    private static final class ExecNsConfigPrimitiveOutputImpl implements ExecNsConfigPrimitiveOutput {
    
        private final Long _createTime;
        private final BigInteger _jobId;
        private final String _jobStatusDetails;
        private final String _name;
        private final Object _nsrIdRef;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final String _projectName;
        private final TriggerType _triggeredBy;
        private final List<VnfOutList> _vnfOutList;
    
        private Map<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> augmentation = Collections.emptyMap();
    
        ExecNsConfigPrimitiveOutputImpl(ExecNsConfigPrimitiveOutputBuilder base) {
            this._createTime = base.getCreateTime();
            this._jobId = base.getJobId();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._projectName = base.getProjectName();
            this._triggeredBy = base.getTriggeredBy();
            this._vnfOutList = base.getVnfOutList();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ExecNsConfigPrimitiveOutput> getImplementedInterface() {
            return ExecNsConfigPrimitiveOutput.class;
        }
    
        @Override
        public Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public BigInteger getJobId() {
            return _jobId;
        }
        
        @Override
        public String getJobStatusDetails() {
            return _jobStatusDetails;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public List<ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public List<VnfOutList> getVnfOutList() {
            return _vnfOutList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExecNsConfigPrimitiveOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_jobId);
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfOutList);
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
            if (!ExecNsConfigPrimitiveOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExecNsConfigPrimitiveOutput other = (ExecNsConfigPrimitiveOutput)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_vnfOutList, other.getVnfOutList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecNsConfigPrimitiveOutputImpl otherImpl = (ExecNsConfigPrimitiveOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecNsConfigPrimitiveOutput>>, Augmentation<ExecNsConfigPrimitiveOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecNsConfigPrimitiveOutput");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_jobId", _jobId);
            CodeHelpers.appendValue(helper, "_jobStatusDetails", _jobStatusDetails);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_vnfOutList", _vnfOutList);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
