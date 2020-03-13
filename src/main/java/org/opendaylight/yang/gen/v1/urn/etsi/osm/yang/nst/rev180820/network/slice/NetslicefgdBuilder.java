package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetslicefgdBuilder} instances.
 * 
 * @see NetslicefgdBuilder
 *
 */
public class NetslicefgdBuilder implements Builder<Netslicefgd> {

    private List<Classifier> _classifier;
    private String _description;
    private String _id;
    private String _name;
    private List<Rsp> _rsp;
    private String _shortName;
    private String _vendor;
    private String _version;
    private NetslicefgdKey key;


    Map<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> augmentation = Collections.emptyMap();

    public NetslicefgdBuilder() {
    }
    public NetslicefgdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd arg) {
        this._rsp = arg.getRsp();
        this._classifier = arg.getClassifier();
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
    }
    public NetslicefgdBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
    }

    public NetslicefgdBuilder(Netslicefgd base) {
        this.key = base.key();
        this._id = base.getId();
        this._classifier = base.getClassifier();
        this._description = base.getDescription();
        this._name = base.getName();
        this._rsp = base.getRsp();
        this._shortName = base.getShortName();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        if (base instanceof NetslicefgdImpl) {
            NetslicefgdImpl impl = (NetslicefgdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> aug =((AugmentationHolder<Netslicefgd>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getVendor();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon)arg).getVersion();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd) {
            this._rsp = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd)arg).getRsp();
            this._classifier = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd)arg).getClassifier();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Netslicefgd]");
    }

    public NetslicefgdKey key() {
        return key;
    }
    
    public List<Classifier> getClassifier() {
        return _classifier;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Rsp> getRsp() {
        return _rsp;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Netslicefgd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetslicefgdBuilder withKey(final NetslicefgdKey key) {
        this.key = key;
        return this;
    }
    public NetslicefgdBuilder setClassifier(final List<Classifier> values) {
        this._classifier = values;
        return this;
    }
    
    
    public NetslicefgdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NetslicefgdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public NetslicefgdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetslicefgdBuilder setRsp(final List<Rsp> values) {
        this._rsp = values;
        return this;
    }
    
    
    public NetslicefgdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public NetslicefgdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NetslicefgdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public NetslicefgdBuilder addAugmentation(Class<? extends Augmentation<Netslicefgd>> augmentationType, Augmentation<Netslicefgd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetslicefgdBuilder removeAugmentation(Class<? extends Augmentation<Netslicefgd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Netslicefgd build() {
        return new NetslicefgdImpl(this);
    }

    private static final class NetslicefgdImpl implements Netslicefgd {
    
        private final List<Classifier> _classifier;
        private final String _description;
        private final String _id;
        private final String _name;
        private final List<Rsp> _rsp;
        private final String _shortName;
        private final String _vendor;
        private final String _version;
        private final NetslicefgdKey key;
    
        private Map<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> augmentation = Collections.emptyMap();
    
        NetslicefgdImpl(NetslicefgdBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetslicefgdKey(base.getId());
            }
            this._id = key.getId();
            this._classifier = base.getClassifier();
            this._description = base.getDescription();
            this._name = base.getName();
            this._rsp = base.getRsp();
            this._shortName = base.getShortName();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Netslicefgd> getImplementedInterface() {
            return Netslicefgd.class;
        }
    
        @Override
        public NetslicefgdKey key() {
            return key;
        }
        
        @Override
        public List<Classifier> getClassifier() {
            return _classifier;
        }
        
        @Override
        public String getDescription() {
            return _description;
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
        public List<Rsp> getRsp() {
            return _rsp;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Netslicefgd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifier);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rsp);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
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
            if (!Netslicefgd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Netslicefgd other = (Netslicefgd)obj;
            if (!Objects.equals(_classifier, other.getClassifier())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rsp, other.getRsp())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetslicefgdImpl otherImpl = (NetslicefgdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Netslicefgd>>, Augmentation<Netslicefgd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Netslicefgd");
            CodeHelpers.appendValue(helper, "_classifier", _classifier);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rsp", _rsp);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
