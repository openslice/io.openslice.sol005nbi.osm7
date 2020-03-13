package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceSubnet;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.NetsliceVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.Netslicefgd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.QualityOfService;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice.SNSSAIIdentifier;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetworkSliceTemplateBuilder} instances.
 * 
 * @see NetworkSliceTemplateBuilder
 *
 */
public class NetworkSliceTemplateBuilder implements Builder<NetworkSliceTemplate> {

    private String _id;
    private String _name;
    private List<NetsliceConnectionPoint> _netsliceConnectionPoint;
    private List<NetsliceSubnet> _netsliceSubnet;
    private List<NetsliceVld> _netsliceVld;
    private List<Netslicefgd> _netslicefgd;
    private QualityOfService _qualityOfService;
    private SNSSAIIdentifier _sNSSAIIdentifier;


    Map<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> augmentation = Collections.emptyMap();

    public NetworkSliceTemplateBuilder() {
    }
    public NetworkSliceTemplateBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._sNSSAIIdentifier = arg.getSNSSAIIdentifier();
        this._qualityOfService = arg.getQualityOfService();
        this._netsliceSubnet = arg.getNetsliceSubnet();
        this._netsliceConnectionPoint = arg.getNetsliceConnectionPoint();
        this._netsliceVld = arg.getNetsliceVld();
        this._netslicefgd = arg.getNetslicefgd();
    }

    public NetworkSliceTemplateBuilder(NetworkSliceTemplate base) {
        this._id = base.getId();
        this._name = base.getName();
        this._netsliceConnectionPoint = base.getNetsliceConnectionPoint();
        this._netsliceSubnet = base.getNetsliceSubnet();
        this._netsliceVld = base.getNetsliceVld();
        this._netslicefgd = base.getNetslicefgd();
        this._qualityOfService = base.getQualityOfService();
        this._sNSSAIIdentifier = base.getSNSSAIIdentifier();
        if (base instanceof NetworkSliceTemplateImpl) {
            NetworkSliceTemplateImpl impl = (NetworkSliceTemplateImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> aug =((AugmentationHolder<NetworkSliceTemplate>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getName();
            this._sNSSAIIdentifier = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getSNSSAIIdentifier();
            this._qualityOfService = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getQualityOfService();
            this._netsliceSubnet = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceSubnet();
            this._netsliceConnectionPoint = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceConnectionPoint();
            this._netsliceVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetsliceVld();
            this._netslicefgd = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice)arg).getNetslicefgd();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSlice]");
    }

    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<NetsliceConnectionPoint> getNetsliceConnectionPoint() {
        return _netsliceConnectionPoint;
    }
    
    public List<NetsliceSubnet> getNetsliceSubnet() {
        return _netsliceSubnet;
    }
    
    public List<NetsliceVld> getNetsliceVld() {
        return _netsliceVld;
    }
    
    public List<Netslicefgd> getNetslicefgd() {
        return _netslicefgd;
    }
    
    public QualityOfService getQualityOfService() {
        return _qualityOfService;
    }
    
    public SNSSAIIdentifier getSNSSAIIdentifier() {
        return _sNSSAIIdentifier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetworkSliceTemplate>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NetworkSliceTemplateBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetworkSliceTemplateBuilder setNetsliceConnectionPoint(final List<NetsliceConnectionPoint> values) {
        this._netsliceConnectionPoint = values;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setNetsliceSubnet(final List<NetsliceSubnet> values) {
        this._netsliceSubnet = values;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setNetsliceVld(final List<NetsliceVld> values) {
        this._netsliceVld = values;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setNetslicefgd(final List<Netslicefgd> values) {
        this._netslicefgd = values;
        return this;
    }
    
    
    public NetworkSliceTemplateBuilder setQualityOfService(final QualityOfService value) {
        this._qualityOfService = value;
        return this;
    }
    
    public NetworkSliceTemplateBuilder setSNSSAIIdentifier(final SNSSAIIdentifier value) {
        this._sNSSAIIdentifier = value;
        return this;
    }
    
    public NetworkSliceTemplateBuilder addAugmentation(Class<? extends Augmentation<NetworkSliceTemplate>> augmentationType, Augmentation<NetworkSliceTemplate> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkSliceTemplateBuilder removeAugmentation(Class<? extends Augmentation<NetworkSliceTemplate>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkSliceTemplate build() {
        return new NetworkSliceTemplateImpl(this);
    }

    private static final class NetworkSliceTemplateImpl implements NetworkSliceTemplate {
    
        private final String _id;
        private final String _name;
        private final List<NetsliceConnectionPoint> _netsliceConnectionPoint;
        private final List<NetsliceSubnet> _netsliceSubnet;
        private final List<NetsliceVld> _netsliceVld;
        private final List<Netslicefgd> _netslicefgd;
        private final QualityOfService _qualityOfService;
        private final SNSSAIIdentifier _sNSSAIIdentifier;
    
        private Map<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> augmentation = Collections.emptyMap();
    
        NetworkSliceTemplateImpl(NetworkSliceTemplateBuilder base) {
            this._id = base.getId();
            this._name = base.getName();
            this._netsliceConnectionPoint = base.getNetsliceConnectionPoint();
            this._netsliceSubnet = base.getNetsliceSubnet();
            this._netsliceVld = base.getNetsliceVld();
            this._netslicefgd = base.getNetslicefgd();
            this._qualityOfService = base.getQualityOfService();
            this._sNSSAIIdentifier = base.getSNSSAIIdentifier();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetworkSliceTemplate> getImplementedInterface() {
            return NetworkSliceTemplate.class;
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
        public List<NetsliceConnectionPoint> getNetsliceConnectionPoint() {
            return _netsliceConnectionPoint;
        }
        
        @Override
        public List<NetsliceSubnet> getNetsliceSubnet() {
            return _netsliceSubnet;
        }
        
        @Override
        public List<NetsliceVld> getNetsliceVld() {
            return _netsliceVld;
        }
        
        @Override
        public List<Netslicefgd> getNetslicefgd() {
            return _netslicefgd;
        }
        
        @Override
        public QualityOfService getQualityOfService() {
            return _qualityOfService;
        }
        
        @Override
        public SNSSAIIdentifier getSNSSAIIdentifier() {
            return _sNSSAIIdentifier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetworkSliceTemplate>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_netsliceConnectionPoint);
            result = prime * result + Objects.hashCode(_netsliceSubnet);
            result = prime * result + Objects.hashCode(_netsliceVld);
            result = prime * result + Objects.hashCode(_netslicefgd);
            result = prime * result + Objects.hashCode(_qualityOfService);
            result = prime * result + Objects.hashCode(_sNSSAIIdentifier);
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
            if (!NetworkSliceTemplate.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetworkSliceTemplate other = (NetworkSliceTemplate)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_netsliceConnectionPoint, other.getNetsliceConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_netsliceSubnet, other.getNetsliceSubnet())) {
                return false;
            }
            if (!Objects.equals(_netsliceVld, other.getNetsliceVld())) {
                return false;
            }
            if (!Objects.equals(_netslicefgd, other.getNetslicefgd())) {
                return false;
            }
            if (!Objects.equals(_qualityOfService, other.getQualityOfService())) {
                return false;
            }
            if (!Objects.equals(_sNSSAIIdentifier, other.getSNSSAIIdentifier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkSliceTemplateImpl otherImpl = (NetworkSliceTemplateImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetworkSliceTemplate>>, Augmentation<NetworkSliceTemplate>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetworkSliceTemplate");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_netsliceConnectionPoint", _netsliceConnectionPoint);
            CodeHelpers.appendValue(helper, "_netsliceSubnet", _netsliceSubnet);
            CodeHelpers.appendValue(helper, "_netsliceVld", _netsliceVld);
            CodeHelpers.appendValue(helper, "_netslicefgd", _netslicefgd);
            CodeHelpers.appendValue(helper, "_qualityOfService", _qualityOfService);
            CodeHelpers.appendValue(helper, "_sNSSAIIdentifier", _sNSSAIIdentifier);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
