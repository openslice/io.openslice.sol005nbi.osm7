package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.config.method.script;
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
 * Class that builds {@link ScriptBuilder} instances.
 * 
 * @see ScriptBuilder
 *
 */
public class ScriptBuilder implements Builder<Script> {

    private Script.ScriptType _scriptType;


    Map<Class<? extends Augmentation<Script>>, Augmentation<Script>> augmentation = Collections.emptyMap();

    public ScriptBuilder() {
    }

    public ScriptBuilder(Script base) {
        this._scriptType = base.getScriptType();
        if (base instanceof ScriptImpl) {
            ScriptImpl impl = (ScriptImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Script>>, Augmentation<Script>> aug =((AugmentationHolder<Script>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Script.ScriptType getScriptType() {
        return _scriptType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Script>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ScriptBuilder setScriptType(final Script.ScriptType value) {
        this._scriptType = value;
        return this;
    }
    
    public ScriptBuilder addAugmentation(Class<? extends Augmentation<Script>> augmentationType, Augmentation<Script> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScriptBuilder removeAugmentation(Class<? extends Augmentation<Script>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Script build() {
        return new ScriptImpl(this);
    }

    private static final class ScriptImpl implements Script {
    
        private final Script.ScriptType _scriptType;
    
        private Map<Class<? extends Augmentation<Script>>, Augmentation<Script>> augmentation = Collections.emptyMap();
    
        ScriptImpl(ScriptBuilder base) {
            this._scriptType = base.getScriptType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Script> getImplementedInterface() {
            return Script.class;
        }
    
        @Override
        public Script.ScriptType getScriptType() {
            return _scriptType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Script>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_scriptType);
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
            if (!Script.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Script other = (Script)obj;
            if (!Objects.equals(_scriptType, other.getScriptType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScriptImpl otherImpl = (ScriptImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Script>>, Augmentation<Script>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Script");
            CodeHelpers.appendValue(helper, "_scriptType", _scriptType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
