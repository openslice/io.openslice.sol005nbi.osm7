package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.network.slice;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.NetworkSliceType;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link SNSSAIIdentifierBuilder} instances.
 * 
 * @see SNSSAIIdentifierBuilder
 *
 */
public class SNSSAIIdentifierBuilder implements Builder<SNSSAIIdentifier> {

    private String _sliceDifferentiator;
    private NetworkSliceType _sliceServiceType;


    Map<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> augmentation = Collections.emptyMap();

    public SNSSAIIdentifierBuilder() {
    }
    public SNSSAIIdentifierBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai arg) {
        this._sliceServiceType = arg.getSliceServiceType();
        this._sliceDifferentiator = arg.getSliceDifferentiator();
    }

    public SNSSAIIdentifierBuilder(SNSSAIIdentifier base) {
        this._sliceDifferentiator = base.getSliceDifferentiator();
        this._sliceServiceType = base.getSliceServiceType();
        if (base instanceof SNSSAIIdentifierImpl) {
            SNSSAIIdentifierImpl impl = (SNSSAIIdentifierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> aug =((AugmentationHolder<SNSSAIIdentifier>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai) {
            this._sliceServiceType = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai)arg).getSliceServiceType();
            this._sliceDifferentiator = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai)arg).getSliceDifferentiator();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.Snssai]");
    }

    public String getSliceDifferentiator() {
        return _sliceDifferentiator;
    }
    
    public NetworkSliceType getSliceServiceType() {
        return _sliceServiceType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SNSSAIIdentifier>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public SNSSAIIdentifierBuilder setSliceDifferentiator(final String value) {
        this._sliceDifferentiator = value;
        return this;
    }
    
    public SNSSAIIdentifierBuilder setSliceServiceType(final NetworkSliceType value) {
        this._sliceServiceType = value;
        return this;
    }
    
    public SNSSAIIdentifierBuilder addAugmentation(Class<? extends Augmentation<SNSSAIIdentifier>> augmentationType, Augmentation<SNSSAIIdentifier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SNSSAIIdentifierBuilder removeAugmentation(Class<? extends Augmentation<SNSSAIIdentifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SNSSAIIdentifier build() {
        return new SNSSAIIdentifierImpl(this);
    }

    private static final class SNSSAIIdentifierImpl implements SNSSAIIdentifier {
    
        private final String _sliceDifferentiator;
        private final NetworkSliceType _sliceServiceType;
    
        private Map<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> augmentation = Collections.emptyMap();
    
        SNSSAIIdentifierImpl(SNSSAIIdentifierBuilder base) {
            this._sliceDifferentiator = base.getSliceDifferentiator();
            this._sliceServiceType = base.getSliceServiceType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SNSSAIIdentifier> getImplementedInterface() {
            return SNSSAIIdentifier.class;
        }
    
        @Override
        public String getSliceDifferentiator() {
            return _sliceDifferentiator;
        }
        
        @Override
        public NetworkSliceType getSliceServiceType() {
            return _sliceServiceType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SNSSAIIdentifier>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_sliceDifferentiator);
            result = prime * result + Objects.hashCode(_sliceServiceType);
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
            if (!SNSSAIIdentifier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SNSSAIIdentifier other = (SNSSAIIdentifier)obj;
            if (!Objects.equals(_sliceDifferentiator, other.getSliceDifferentiator())) {
                return false;
            }
            if (!Objects.equals(_sliceServiceType, other.getSliceServiceType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SNSSAIIdentifierImpl otherImpl = (SNSSAIIdentifierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SNSSAIIdentifier>>, Augmentation<SNSSAIIdentifier>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SNSSAIIdentifier");
            CodeHelpers.appendValue(helper, "_sliceDifferentiator", _sliceDifferentiator);
            CodeHelpers.appendValue(helper, "_sliceServiceType", _sliceServiceType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
