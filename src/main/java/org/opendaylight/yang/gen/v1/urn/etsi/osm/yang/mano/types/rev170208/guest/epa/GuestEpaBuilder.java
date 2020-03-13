package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.CpuPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.DiskIoQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.MemQuota;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.guest.epa.guest.epa.VifQuota;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link GuestEpaBuilder} instances.
 * 
 * @see GuestEpaBuilder
 *
 */
public class GuestEpaBuilder implements Builder<GuestEpa> {

    private CpuPolicy _cpuPolicy;
    private DiskIoQuota _diskIoQuota;
    private MemQuota _memQuota;
    private GuestEpa.MempageSize _mempageSize;
    private NumaPolicy _numaPolicy;
    private List<PcieDevice> _pcieDevice;
    private VifQuota _vifQuota;
    private Boolean _trustedExecution;


    Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> augmentation = Collections.emptyMap();

    public GuestEpaBuilder() {
    }

    public GuestEpaBuilder(GuestEpa base) {
        this._cpuPolicy = base.getCpuPolicy();
        this._diskIoQuota = base.getDiskIoQuota();
        this._memQuota = base.getMemQuota();
        this._mempageSize = base.getMempageSize();
        this._numaPolicy = base.getNumaPolicy();
        this._pcieDevice = base.getPcieDevice();
        this._vifQuota = base.getVifQuota();
        this._trustedExecution = base.isTrustedExecution();
        if (base instanceof GuestEpaImpl) {
            GuestEpaImpl impl = (GuestEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> aug =((AugmentationHolder<GuestEpa>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public CpuPolicy getCpuPolicy() {
        return _cpuPolicy;
    }
    
    public DiskIoQuota getDiskIoQuota() {
        return _diskIoQuota;
    }
    
    public MemQuota getMemQuota() {
        return _memQuota;
    }
    
    public GuestEpa.MempageSize getMempageSize() {
        return _mempageSize;
    }
    
    public NumaPolicy getNumaPolicy() {
        return _numaPolicy;
    }
    
    public List<PcieDevice> getPcieDevice() {
        return _pcieDevice;
    }
    
    public VifQuota getVifQuota() {
        return _vifQuota;
    }
    
    public Boolean isTrustedExecution() {
        return _trustedExecution;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GuestEpa>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GuestEpaBuilder setCpuPolicy(final CpuPolicy value) {
        this._cpuPolicy = value;
        return this;
    }
    
    public GuestEpaBuilder setDiskIoQuota(final DiskIoQuota value) {
        this._diskIoQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setMemQuota(final MemQuota value) {
        this._memQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setMempageSize(final GuestEpa.MempageSize value) {
        this._mempageSize = value;
        return this;
    }
    
    public GuestEpaBuilder setNumaPolicy(final NumaPolicy value) {
        this._numaPolicy = value;
        return this;
    }
    public GuestEpaBuilder setPcieDevice(final List<PcieDevice> values) {
        this._pcieDevice = values;
        return this;
    }
    
    
    public GuestEpaBuilder setVifQuota(final VifQuota value) {
        this._vifQuota = value;
        return this;
    }
    
    public GuestEpaBuilder setTrustedExecution(final Boolean value) {
        this._trustedExecution = value;
        return this;
    }
    
    public GuestEpaBuilder addAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType, Augmentation<GuestEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GuestEpaBuilder removeAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GuestEpa build() {
        return new GuestEpaImpl(this);
    }

    private static final class GuestEpaImpl implements GuestEpa {
    
        private final CpuPolicy _cpuPolicy;
        private final DiskIoQuota _diskIoQuota;
        private final MemQuota _memQuota;
        private final GuestEpa.MempageSize _mempageSize;
        private final NumaPolicy _numaPolicy;
        private final List<PcieDevice> _pcieDevice;
        private final VifQuota _vifQuota;
        private final Boolean _trustedExecution;
    
        private Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> augmentation = Collections.emptyMap();
    
        GuestEpaImpl(GuestEpaBuilder base) {
            this._cpuPolicy = base.getCpuPolicy();
            this._diskIoQuota = base.getDiskIoQuota();
            this._memQuota = base.getMemQuota();
            this._mempageSize = base.getMempageSize();
            this._numaPolicy = base.getNumaPolicy();
            this._pcieDevice = base.getPcieDevice();
            this._vifQuota = base.getVifQuota();
            this._trustedExecution = base.isTrustedExecution();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<GuestEpa> getImplementedInterface() {
            return GuestEpa.class;
        }
    
        @Override
        public CpuPolicy getCpuPolicy() {
            return _cpuPolicy;
        }
        
        @Override
        public DiskIoQuota getDiskIoQuota() {
            return _diskIoQuota;
        }
        
        @Override
        public MemQuota getMemQuota() {
            return _memQuota;
        }
        
        @Override
        public GuestEpa.MempageSize getMempageSize() {
            return _mempageSize;
        }
        
        @Override
        public NumaPolicy getNumaPolicy() {
            return _numaPolicy;
        }
        
        @Override
        public List<PcieDevice> getPcieDevice() {
            return _pcieDevice;
        }
        
        @Override
        public VifQuota getVifQuota() {
            return _vifQuota;
        }
        
        @Override
        public Boolean isTrustedExecution() {
            return _trustedExecution;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GuestEpa>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuPolicy);
            result = prime * result + Objects.hashCode(_diskIoQuota);
            result = prime * result + Objects.hashCode(_memQuota);
            result = prime * result + Objects.hashCode(_mempageSize);
            result = prime * result + Objects.hashCode(_numaPolicy);
            result = prime * result + Objects.hashCode(_pcieDevice);
            result = prime * result + Objects.hashCode(_vifQuota);
            result = prime * result + Objects.hashCode(_trustedExecution);
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
            if (!GuestEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GuestEpa other = (GuestEpa)obj;
            if (!Objects.equals(_cpuPolicy, other.getCpuPolicy())) {
                return false;
            }
            if (!Objects.equals(_diskIoQuota, other.getDiskIoQuota())) {
                return false;
            }
            if (!Objects.equals(_memQuota, other.getMemQuota())) {
                return false;
            }
            if (!Objects.equals(_mempageSize, other.getMempageSize())) {
                return false;
            }
            if (!Objects.equals(_numaPolicy, other.getNumaPolicy())) {
                return false;
            }
            if (!Objects.equals(_pcieDevice, other.getPcieDevice())) {
                return false;
            }
            if (!Objects.equals(_vifQuota, other.getVifQuota())) {
                return false;
            }
            if (!Objects.equals(_trustedExecution, other.isTrustedExecution())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GuestEpaImpl otherImpl = (GuestEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GuestEpa");
            CodeHelpers.appendValue(helper, "_cpuPolicy", _cpuPolicy);
            CodeHelpers.appendValue(helper, "_diskIoQuota", _diskIoQuota);
            CodeHelpers.appendValue(helper, "_memQuota", _memQuota);
            CodeHelpers.appendValue(helper, "_mempageSize", _mempageSize);
            CodeHelpers.appendValue(helper, "_numaPolicy", _numaPolicy);
            CodeHelpers.appendValue(helper, "_pcieDevice", _pcieDevice);
            CodeHelpers.appendValue(helper, "_vifQuota", _vifQuota);
            CodeHelpers.appendValue(helper, "_trustedExecution", _trustedExecution);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
