package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.ResourceType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link QualityOfServiceBuilder} instances.
 * 
 * @see QualityOfServiceBuilder
 *
 */
public class QualityOfServiceBuilder implements Builder<QualityOfService> {

    private Integer _defaultMaxDataBurst;
    private Integer _id;
    private Integer _packetDelayBudget;
    private Integer _packetErrorRate;
    private Integer _priorityLevel;
    private ResourceType _resourceType;


    Map<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> augmentation = Collections.emptyMap();

    public QualityOfServiceBuilder() {
    }
    public QualityOfServiceBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi arg) {
        this._id = arg.getId();
        this._resourceType = arg.getResourceType();
        this._priorityLevel = arg.getPriorityLevel();
        this._packetDelayBudget = arg.getPacketDelayBudget();
        this._packetErrorRate = arg.getPacketErrorRate();
        this._defaultMaxDataBurst = arg.getDefaultMaxDataBurst();
    }

    public QualityOfServiceBuilder(QualityOfService base) {
        this._defaultMaxDataBurst = base.getDefaultMaxDataBurst();
        this._id = base.getId();
        this._packetDelayBudget = base.getPacketDelayBudget();
        this._packetErrorRate = base.getPacketErrorRate();
        this._priorityLevel = base.getPriorityLevel();
        this._resourceType = base.getResourceType();
        if (base instanceof QualityOfServiceImpl) {
            QualityOfServiceImpl impl = (QualityOfServiceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> aug =((AugmentationHolder<QualityOfService>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getId();
            this._resourceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getResourceType();
            this._priorityLevel = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPriorityLevel();
            this._packetDelayBudget = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPacketDelayBudget();
            this._packetErrorRate = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getPacketErrorRate();
            this._defaultMaxDataBurst = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi)arg).getDefaultMaxDataBurst();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.FiveQi]");
    }

    public Integer getDefaultMaxDataBurst() {
        return _defaultMaxDataBurst;
    }
    
    public Integer getId() {
        return _id;
    }
    
    public Integer getPacketDelayBudget() {
        return _packetDelayBudget;
    }
    
    public Integer getPacketErrorRate() {
        return _packetErrorRate;
    }
    
    public Integer getPriorityLevel() {
        return _priorityLevel;
    }
    
    public ResourceType getResourceType() {
        return _resourceType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<QualityOfService>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkDefaultMaxDataBurstRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public QualityOfServiceBuilder setDefaultMaxDataBurst(final Integer value) {
    if (value != null) {
        checkDefaultMaxDataBurstRange(value);
        
    }
        this._defaultMaxDataBurst = value;
        return this;
    }
    private static void checkIdRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public QualityOfServiceBuilder setId(final Integer value) {
    if (value != null) {
        checkIdRange(value);
        
    }
        this._id = value;
        return this;
    }
    private static void checkPacketDelayBudgetRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public QualityOfServiceBuilder setPacketDelayBudget(final Integer value) {
    if (value != null) {
        checkPacketDelayBudgetRange(value);
        
    }
        this._packetDelayBudget = value;
        return this;
    }
    private static void checkPacketErrorRateRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public QualityOfServiceBuilder setPacketErrorRate(final Integer value) {
    if (value != null) {
        checkPacketErrorRateRange(value);
        
    }
        this._packetErrorRate = value;
        return this;
    }
    private static void checkPriorityLevelRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public QualityOfServiceBuilder setPriorityLevel(final Integer value) {
    if (value != null) {
        checkPriorityLevelRange(value);
        
    }
        this._priorityLevel = value;
        return this;
    }
    
    public QualityOfServiceBuilder setResourceType(final ResourceType value) {
        this._resourceType = value;
        return this;
    }
    
    public QualityOfServiceBuilder addAugmentation(Class<? extends Augmentation<QualityOfService>> augmentationType, Augmentation<QualityOfService> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public QualityOfServiceBuilder removeAugmentation(Class<? extends Augmentation<QualityOfService>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public QualityOfService build() {
        return new QualityOfServiceImpl(this);
    }

    private static final class QualityOfServiceImpl implements QualityOfService {
    
        private final Integer _defaultMaxDataBurst;
        private final Integer _id;
        private final Integer _packetDelayBudget;
        private final Integer _packetErrorRate;
        private final Integer _priorityLevel;
        private final ResourceType _resourceType;
    
        private Map<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> augmentation = Collections.emptyMap();
    
        QualityOfServiceImpl(QualityOfServiceBuilder base) {
            this._defaultMaxDataBurst = base.getDefaultMaxDataBurst();
            this._id = base.getId();
            this._packetDelayBudget = base.getPacketDelayBudget();
            this._packetErrorRate = base.getPacketErrorRate();
            this._priorityLevel = base.getPriorityLevel();
            this._resourceType = base.getResourceType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<QualityOfService> getImplementedInterface() {
            return QualityOfService.class;
        }
    
        @Override
        public Integer getDefaultMaxDataBurst() {
            return _defaultMaxDataBurst;
        }
        
        @Override
        public Integer getId() {
            return _id;
        }
        
        @Override
        public Integer getPacketDelayBudget() {
            return _packetDelayBudget;
        }
        
        @Override
        public Integer getPacketErrorRate() {
            return _packetErrorRate;
        }
        
        @Override
        public Integer getPriorityLevel() {
            return _priorityLevel;
        }
        
        @Override
        public ResourceType getResourceType() {
            return _resourceType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<QualityOfService>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_defaultMaxDataBurst);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_packetDelayBudget);
            result = prime * result + Objects.hashCode(_packetErrorRate);
            result = prime * result + Objects.hashCode(_priorityLevel);
            result = prime * result + Objects.hashCode(_resourceType);
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
            if (!QualityOfService.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            QualityOfService other = (QualityOfService)obj;
            if (!Objects.equals(_defaultMaxDataBurst, other.getDefaultMaxDataBurst())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_packetDelayBudget, other.getPacketDelayBudget())) {
                return false;
            }
            if (!Objects.equals(_packetErrorRate, other.getPacketErrorRate())) {
                return false;
            }
            if (!Objects.equals(_priorityLevel, other.getPriorityLevel())) {
                return false;
            }
            if (!Objects.equals(_resourceType, other.getResourceType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                QualityOfServiceImpl otherImpl = (QualityOfServiceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<QualityOfService>>, Augmentation<QualityOfService>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("QualityOfService");
            CodeHelpers.appendValue(helper, "_defaultMaxDataBurst", _defaultMaxDataBurst);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_packetDelayBudget", _packetDelayBudget);
            CodeHelpers.appendValue(helper, "_packetErrorRate", _packetErrorRate);
            CodeHelpers.appendValue(helper, "_priorityLevel", _priorityLevel);
            CodeHelpers.appendValue(helper, "_resourceType", _resourceType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
