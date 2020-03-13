package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.internal_vld_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DhcpParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ip.profile.update.schema.DnsServer;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpPrefix;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.IpVersion;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IpProfileBuilder} instances.
 * 
 * @see IpProfileBuilder
 *
 */
public class IpProfileBuilder implements Builder<IpProfile> {

    private DhcpParams _dhcpParams;
    private List<DnsServer> _dnsServer;
    private IpPrefix _gatewayAddress;
    private IpVersion _ipVersion;
    private IpPrefix _subnetAddress;


    Map<Class<? extends Augmentation<IpProfile>>, Augmentation<IpProfile>> augmentation = Collections.emptyMap();

    public IpProfileBuilder() {
    }
    public IpProfileBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema arg) {
        this._ipVersion = arg.getIpVersion();
        this._subnetAddress = arg.getSubnetAddress();
        this._gatewayAddress = arg.getGatewayAddress();
        this._dnsServer = arg.getDnsServer();
        this._dhcpParams = arg.getDhcpParams();
    }

    public IpProfileBuilder(IpProfile base) {
        this._dhcpParams = base.getDhcpParams();
        this._dnsServer = base.getDnsServer();
        this._gatewayAddress = base.getGatewayAddress();
        this._ipVersion = base.getIpVersion();
        this._subnetAddress = base.getSubnetAddress();
        if (base instanceof IpProfileImpl) {
            IpProfileImpl impl = (IpProfileImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IpProfile>>, Augmentation<IpProfile>> aug =((AugmentationHolder<IpProfile>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema) {
            this._ipVersion = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema)arg).getIpVersion();
            this._subnetAddress = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema)arg).getSubnetAddress();
            this._gatewayAddress = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema)arg).getGatewayAddress();
            this._dnsServer = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema)arg).getDnsServer();
            this._dhcpParams = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema)arg).getDhcpParams();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.IpProfileUpdateSchema]");
    }

    public DhcpParams getDhcpParams() {
        return _dhcpParams;
    }
    
    public List<DnsServer> getDnsServer() {
        return _dnsServer;
    }
    
    public IpPrefix getGatewayAddress() {
        return _gatewayAddress;
    }
    
    public IpVersion getIpVersion() {
        return _ipVersion;
    }
    
    public IpPrefix getSubnetAddress() {
        return _subnetAddress;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IpProfile>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public IpProfileBuilder setDhcpParams(final DhcpParams value) {
        this._dhcpParams = value;
        return this;
    }
    public IpProfileBuilder setDnsServer(final List<DnsServer> values) {
        this._dnsServer = values;
        return this;
    }
    
    
    public IpProfileBuilder setGatewayAddress(final IpPrefix value) {
        this._gatewayAddress = value;
        return this;
    }
    
    public IpProfileBuilder setIpVersion(final IpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
    public IpProfileBuilder setSubnetAddress(final IpPrefix value) {
        this._subnetAddress = value;
        return this;
    }
    
    public IpProfileBuilder addAugmentation(Class<? extends Augmentation<IpProfile>> augmentationType, Augmentation<IpProfile> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpProfileBuilder removeAugmentation(Class<? extends Augmentation<IpProfile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IpProfile build() {
        return new IpProfileImpl(this);
    }

    private static final class IpProfileImpl implements IpProfile {
    
        private final DhcpParams _dhcpParams;
        private final List<DnsServer> _dnsServer;
        private final IpPrefix _gatewayAddress;
        private final IpVersion _ipVersion;
        private final IpPrefix _subnetAddress;
    
        private Map<Class<? extends Augmentation<IpProfile>>, Augmentation<IpProfile>> augmentation = Collections.emptyMap();
    
        IpProfileImpl(IpProfileBuilder base) {
            this._dhcpParams = base.getDhcpParams();
            this._dnsServer = base.getDnsServer();
            this._gatewayAddress = base.getGatewayAddress();
            this._ipVersion = base.getIpVersion();
            this._subnetAddress = base.getSubnetAddress();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<IpProfile> getImplementedInterface() {
            return IpProfile.class;
        }
    
        @Override
        public DhcpParams getDhcpParams() {
            return _dhcpParams;
        }
        
        @Override
        public List<DnsServer> getDnsServer() {
            return _dnsServer;
        }
        
        @Override
        public IpPrefix getGatewayAddress() {
            return _gatewayAddress;
        }
        
        @Override
        public IpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @Override
        public IpPrefix getSubnetAddress() {
            return _subnetAddress;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IpProfile>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dhcpParams);
            result = prime * result + Objects.hashCode(_dnsServer);
            result = prime * result + Objects.hashCode(_gatewayAddress);
            result = prime * result + Objects.hashCode(_ipVersion);
            result = prime * result + Objects.hashCode(_subnetAddress);
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
            if (!IpProfile.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IpProfile other = (IpProfile)obj;
            if (!Objects.equals(_dhcpParams, other.getDhcpParams())) {
                return false;
            }
            if (!Objects.equals(_dnsServer, other.getDnsServer())) {
                return false;
            }
            if (!Objects.equals(_gatewayAddress, other.getGatewayAddress())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (!Objects.equals(_subnetAddress, other.getSubnetAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfileImpl otherImpl = (IpProfileImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IpProfile>>, Augmentation<IpProfile>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IpProfile");
            CodeHelpers.appendValue(helper, "_dhcpParams", _dhcpParams);
            CodeHelpers.appendValue(helper, "_dnsServer", _dnsServer);
            CodeHelpers.appendValue(helper, "_gatewayAddress", _gatewayAddress);
            CodeHelpers.appendValue(helper, "_ipVersion", _ipVersion);
            CodeHelpers.appendValue(helper, "_subnetAddress", _subnetAddress);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
