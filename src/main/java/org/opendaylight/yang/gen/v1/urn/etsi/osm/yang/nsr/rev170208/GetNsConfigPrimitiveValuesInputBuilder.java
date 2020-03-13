package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link GetNsConfigPrimitiveValuesInputBuilder} instances.
 * 
 * @see GetNsConfigPrimitiveValuesInputBuilder
 *
 */
public class GetNsConfigPrimitiveValuesInputBuilder implements Builder<GetNsConfigPrimitiveValuesInput> {

    private String _name;
    private Object _nsrIdRef;
    private String _projectName;


    Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> augmentation = Collections.emptyMap();

    public GetNsConfigPrimitiveValuesInputBuilder() {
    }
    public GetNsConfigPrimitiveValuesInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public GetNsConfigPrimitiveValuesInputBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public GetNsConfigPrimitiveValuesInputBuilder(GetNsConfigPrimitiveValuesInput base) {
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._projectName = base.getProjectName();
        if (base instanceof GetNsConfigPrimitiveValuesInputImpl) {
            GetNsConfigPrimitiveValuesInputImpl impl = (GetNsConfigPrimitiveValuesInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> aug =((AugmentationHolder<GetNsConfigPrimitiveValuesInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.RpcProjectName, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.RpcCommon]");
    }

    public String getName() {
        return _name;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GetNsConfigPrimitiveValuesInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GetNsConfigPrimitiveValuesInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder setProjectName(final String value) {
    if (value != null) {
        check_projectNameLength(value);
        
    }
        this._projectName = value;
        return this;
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder addAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>> augmentationType, Augmentation<GetNsConfigPrimitiveValuesInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetNsConfigPrimitiveValuesInputBuilder removeAugmentation(Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetNsConfigPrimitiveValuesInput build() {
        return new GetNsConfigPrimitiveValuesInputImpl(this);
    }

    private static final class GetNsConfigPrimitiveValuesInputImpl implements GetNsConfigPrimitiveValuesInput {
    
        private final String _name;
        private final Object _nsrIdRef;
        private final String _projectName;
    
        private Map<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> augmentation = Collections.emptyMap();
    
        GetNsConfigPrimitiveValuesInputImpl(GetNsConfigPrimitiveValuesInputBuilder base) {
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._projectName = base.getProjectName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<GetNsConfigPrimitiveValuesInput> getImplementedInterface() {
            return GetNsConfigPrimitiveValuesInput.class;
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
        public String getProjectName() {
            return _projectName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GetNsConfigPrimitiveValuesInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_projectName);
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
            if (!GetNsConfigPrimitiveValuesInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GetNsConfigPrimitiveValuesInput other = (GetNsConfigPrimitiveValuesInput)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsConfigPrimitiveValuesInputImpl otherImpl = (GetNsConfigPrimitiveValuesInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetNsConfigPrimitiveValuesInput>>, Augmentation<GetNsConfigPrimitiveValuesInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetNsConfigPrimitiveValuesInput");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
