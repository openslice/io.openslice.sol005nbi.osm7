package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.InternalVld;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.vnf_params.Vdu;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfBuilder} instances.
 * 
 * @see VnfBuilder
 *
 */
public class VnfBuilder implements Builder<Vnf> {

    private List<InternalVld> _internalVld;
    private String _memberVnfIndex;
    private List<Vdu> _vdu;
    private String _vimAccountId;
    private VnfKey key;


    Map<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> augmentation = Collections.emptyMap();

    public VnfBuilder() {
    }
    public VnfBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams arg) {
        this._memberVnfIndex = arg.getMemberVnfIndex();
        this._vimAccountId = arg.getVimAccountId();
        this._vdu = arg.getVdu();
        this._internalVld = arg.getInternalVld();
    }

    public VnfBuilder(Vnf base) {
        this.key = base.key();
        this._memberVnfIndex = base.getMemberVnfIndex();
        this._internalVld = base.getInternalVld();
        this._vdu = base.getVdu();
        this._vimAccountId = base.getVimAccountId();
        if (base instanceof VnfImpl) {
            VnfImpl impl = (VnfImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> aug =((AugmentationHolder<Vnf>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams) {
            this._memberVnfIndex = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getMemberVnfIndex();
            this._vimAccountId = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getVimAccountId();
            this._vdu = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getVdu();
            this._internalVld = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams)arg).getInternalVld();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams]");
    }

    public VnfKey key() {
        return key;
    }
    
    public List<InternalVld> getInternalVld() {
        return _internalVld;
    }
    
    public String getMemberVnfIndex() {
        return _memberVnfIndex;
    }
    
    public List<Vdu> getVdu() {
        return _vdu;
    }
    
    public String getVimAccountId() {
        return _vimAccountId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vnf>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfBuilder withKey(final VnfKey key) {
        this.key = key;
        return this;
    }
    public VnfBuilder setInternalVld(final List<InternalVld> values) {
        this._internalVld = values;
        return this;
    }
    
    
    public VnfBuilder setMemberVnfIndex(final String value) {
        this._memberVnfIndex = value;
        return this;
    }
    public VnfBuilder setVdu(final List<Vdu> values) {
        this._vdu = values;
        return this;
    }
    
    
    public VnfBuilder setVimAccountId(final String value) {
        this._vimAccountId = value;
        return this;
    }
    
    public VnfBuilder addAugmentation(Class<? extends Augmentation<Vnf>> augmentationType, Augmentation<Vnf> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfBuilder removeAugmentation(Class<? extends Augmentation<Vnf>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnf build() {
        return new VnfImpl(this);
    }

    private static final class VnfImpl implements Vnf {
    
        private final List<InternalVld> _internalVld;
        private final String _memberVnfIndex;
        private final List<Vdu> _vdu;
        private final String _vimAccountId;
        private final VnfKey key;
    
        private Map<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> augmentation = Collections.emptyMap();
    
        VnfImpl(VnfBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new VnfKey(base.getMemberVnfIndex());
            }
            this._memberVnfIndex = key.getMemberVnfIndex();
            this._internalVld = base.getInternalVld();
            this._vdu = base.getVdu();
            this._vimAccountId = base.getVimAccountId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Vnf> getImplementedInterface() {
            return Vnf.class;
        }
    
        @Override
        public VnfKey key() {
            return key;
        }
        
        @Override
        public List<InternalVld> getInternalVld() {
            return _internalVld;
        }
        
        @Override
        public String getMemberVnfIndex() {
            return _memberVnfIndex;
        }
        
        @Override
        public List<Vdu> getVdu() {
            return _vdu;
        }
        
        @Override
        public String getVimAccountId() {
            return _vimAccountId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vnf>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalVld);
            result = prime * result + Objects.hashCode(_memberVnfIndex);
            result = prime * result + Objects.hashCode(_vdu);
            result = prime * result + Objects.hashCode(_vimAccountId);
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
            if (!Vnf.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vnf other = (Vnf)obj;
            if (!Objects.equals(_internalVld, other.getInternalVld())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndex, other.getMemberVnfIndex())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (!Objects.equals(_vimAccountId, other.getVimAccountId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfImpl otherImpl = (VnfImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnf>>, Augmentation<Vnf>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnf");
            CodeHelpers.appendValue(helper, "_internalVld", _internalVld);
            CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "_vimAccountId", _vimAccountId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
