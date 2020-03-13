package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.aggregate.HostAggregate;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.AvailabilityZone;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input.cloud.provider.openstack.ServerGroup;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link OpenstackBuilder} instances.
 * 
 * @see OpenstackBuilder
 *
 */
public class OpenstackBuilder implements Builder<Openstack> {

    private AvailabilityZone _availabilityZone;
    private List<HostAggregate> _hostAggregate;
    private ServerGroup _serverGroup;


    Map<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> augmentation = Collections.emptyMap();

    public OpenstackBuilder() {
    }
    public OpenstackBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate arg) {
        this._hostAggregate = arg.getHostAggregate();
    }

    public OpenstackBuilder(Openstack base) {
        this._availabilityZone = base.getAvailabilityZone();
        this._hostAggregate = base.getHostAggregate();
        this._serverGroup = base.getServerGroup();
        if (base instanceof OpenstackImpl) {
            OpenstackImpl impl = (OpenstackImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> aug =((AugmentationHolder<Openstack>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate) {
            this._hostAggregate = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate)arg).getHostAggregate();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostAggregate]");
    }

    public AvailabilityZone getAvailabilityZone() {
        return _availabilityZone;
    }
    
    public List<HostAggregate> getHostAggregate() {
        return _hostAggregate;
    }
    
    public ServerGroup getServerGroup() {
        return _serverGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Openstack>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public OpenstackBuilder setAvailabilityZone(final AvailabilityZone value) {
        this._availabilityZone = value;
        return this;
    }
    public OpenstackBuilder setHostAggregate(final List<HostAggregate> values) {
        this._hostAggregate = values;
        return this;
    }
    
    
    public OpenstackBuilder setServerGroup(final ServerGroup value) {
        this._serverGroup = value;
        return this;
    }
    
    public OpenstackBuilder addAugmentation(Class<? extends Augmentation<Openstack>> augmentationType, Augmentation<Openstack> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OpenstackBuilder removeAugmentation(Class<? extends Augmentation<Openstack>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Openstack build() {
        return new OpenstackImpl(this);
    }

    private static final class OpenstackImpl implements Openstack {
    
        private final AvailabilityZone _availabilityZone;
        private final List<HostAggregate> _hostAggregate;
        private final ServerGroup _serverGroup;
    
        private Map<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> augmentation = Collections.emptyMap();
    
        OpenstackImpl(OpenstackBuilder base) {
            this._availabilityZone = base.getAvailabilityZone();
            this._hostAggregate = base.getHostAggregate();
            this._serverGroup = base.getServerGroup();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Openstack> getImplementedInterface() {
            return Openstack.class;
        }
    
        @Override
        public AvailabilityZone getAvailabilityZone() {
            return _availabilityZone;
        }
        
        @Override
        public List<HostAggregate> getHostAggregate() {
            return _hostAggregate;
        }
        
        @Override
        public ServerGroup getServerGroup() {
            return _serverGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Openstack>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_availabilityZone);
            result = prime * result + Objects.hashCode(_hostAggregate);
            result = prime * result + Objects.hashCode(_serverGroup);
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
            if (!Openstack.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Openstack other = (Openstack)obj;
            if (!Objects.equals(_availabilityZone, other.getAvailabilityZone())) {
                return false;
            }
            if (!Objects.equals(_hostAggregate, other.getHostAggregate())) {
                return false;
            }
            if (!Objects.equals(_serverGroup, other.getServerGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OpenstackImpl otherImpl = (OpenstackImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Openstack>>, Augmentation<Openstack>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Openstack");
            CodeHelpers.appendValue(helper, "_availabilityZone", _availabilityZone);
            CodeHelpers.appendValue(helper, "_hostAggregate", _hostAggregate);
            CodeHelpers.appendValue(helper, "_serverGroup", _serverGroup);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
