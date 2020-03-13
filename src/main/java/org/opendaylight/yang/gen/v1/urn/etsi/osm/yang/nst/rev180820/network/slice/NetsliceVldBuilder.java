package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
import java.lang.Boolean;
import java.lang.Class;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VirtualLinkType;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.provider.network.ProviderNetwork;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.nsvld.NssConnectionPointRef;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetsliceVldBuilder} instances.
 * 
 * @see NetsliceVldBuilder
 *
 */
public class NetsliceVldBuilder implements Builder<NetsliceVld> {

    private String _description;
    private String _id;
    private BigInteger _leafBandwidth;
    private String _name;
    private List<NssConnectionPointRef> _nssConnectionPointRef;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private String _shortName;
    private VirtualLinkType _type;
    private String _vendor;
    private String _version;
    private Boolean _mgmtNetwork;
    private NetsliceVldKey key;


    Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();

    public NetsliceVldBuilder() {
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld arg) {
        this._nssConnectionPointRef = arg.getNssConnectionPointRef();
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._type = arg.getType();
        this._rootBandwidth = arg.getRootBandwidth();
        this._leafBandwidth = arg.getLeafBandwidth();
        this._mgmtNetwork = arg.isMgmtNetwork();
        this._providerNetwork = arg.getProviderNetwork();
    }
    public NetsliceVldBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public NetsliceVldBuilder(NetsliceVld base) {
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._nssConnectionPointRef = base.getNssConnectionPointRef();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._mgmtNetwork = base.isMgmtNetwork();
        if (base instanceof NetsliceVldImpl) {
            NetsliceVldImpl impl = (NetsliceVldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> aug =((AugmentationHolder<NetsliceVld>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld) {
            this._nssConnectionPointRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld)arg).getNssConnectionPointRef();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getShortName();
            this._vendor = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVendor();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getDescription();
            this._version = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getVersion();
            this._type = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getType();
            this._rootBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getRootBandwidth();
            this._leafBandwidth = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).getLeafBandwidth();
            this._mgmtNetwork = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon)arg).isMgmtNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ProviderNetwork, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Nsvld, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.VldCommon]");
    }

    public NetsliceVldKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<NssConnectionPointRef> getNssConnectionPointRef() {
        return _nssConnectionPointRef;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public Boolean isMgmtNetwork() {
        return _mgmtNetwork;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetsliceVld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetsliceVldBuilder withKey(final NetsliceVldKey key) {
        this.key = key;
        return this;
    }
    
    public NetsliceVldBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NetsliceVldBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKLEAFBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKLEAFBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkLeafBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKLEAFBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKLEAFBANDWIDTHRANGE_RANGES, value);
    }
    
    public NetsliceVldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
        
    }
        this._leafBandwidth = value;
        return this;
    }
    
    public NetsliceVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NetsliceVldBuilder setNssConnectionPointRef(final List<NssConnectionPointRef> values) {
        this._nssConnectionPointRef = values;
        return this;
    }
    
    
    public NetsliceVldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKROOTBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKROOTBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkRootBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKROOTBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKROOTBANDWIDTHRANGE_RANGES, value);
    }
    
    public NetsliceVldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
        
    }
        this._rootBandwidth = value;
        return this;
    }
    
    public NetsliceVldBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public NetsliceVldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public NetsliceVldBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NetsliceVldBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public NetsliceVldBuilder setMgmtNetwork(final Boolean value) {
        this._mgmtNetwork = value;
        return this;
    }
    
    public NetsliceVldBuilder addAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType, Augmentation<NetsliceVld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetsliceVldBuilder removeAugmentation(Class<? extends Augmentation<NetsliceVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetsliceVld build() {
        return new NetsliceVldImpl(this);
    }

    private static final class NetsliceVldImpl implements NetsliceVld {
    
        private final String _description;
        private final String _id;
        private final BigInteger _leafBandwidth;
        private final String _name;
        private final List<NssConnectionPointRef> _nssConnectionPointRef;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        private final String _shortName;
        private final VirtualLinkType _type;
        private final String _vendor;
        private final String _version;
        private final Boolean _mgmtNetwork;
        private final NetsliceVldKey key;
    
        private Map<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> augmentation = Collections.emptyMap();
    
        NetsliceVldImpl(NetsliceVldBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NetsliceVldKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._nssConnectionPointRef = base.getNssConnectionPointRef();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._mgmtNetwork = base.isMgmtNetwork();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<NetsliceVld> getImplementedInterface() {
            return NetsliceVld.class;
        }
    
        @Override
        public NetsliceVldKey key() {
            return key;
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
        public BigInteger getLeafBandwidth() {
            return _leafBandwidth;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<NssConnectionPointRef> getNssConnectionPointRef() {
            return _nssConnectionPointRef;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public BigInteger getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public Boolean isMgmtNetwork() {
            return _mgmtNetwork;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetsliceVld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nssConnectionPointRef);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_mgmtNetwork);
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
            if (!NetsliceVld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetsliceVld other = (NetsliceVld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nssConnectionPointRef, other.getNssConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_mgmtNetwork, other.isMgmtNetwork())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetsliceVldImpl otherImpl = (NetsliceVldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetsliceVld>>, Augmentation<NetsliceVld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetsliceVld");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nssConnectionPointRef", _nssConnectionPointRef);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_mgmtNetwork", _mgmtNetwork);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
