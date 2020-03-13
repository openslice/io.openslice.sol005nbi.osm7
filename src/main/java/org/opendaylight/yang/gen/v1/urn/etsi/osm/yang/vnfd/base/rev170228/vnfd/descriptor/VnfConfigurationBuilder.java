package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.configuration.method.ConfigMethod;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.config.access.ConfigAccess;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration.TerminateConfigPrimitive;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.metrics.Metrics;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.Relation;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link VnfConfigurationBuilder} instances.
 * 
 * @see VnfConfigurationBuilder
 *
 */
public class VnfConfigurationBuilder implements Builder<VnfConfiguration> {

    private ConfigAccess _configAccess;
    private ConfigMethod _configMethod;
    private List<ConfigPrimitive> _configPrimitive;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<Metrics> _metrics;
    private List<Relation> _relation;
    private List<TerminateConfigPrimitive> _terminateConfigPrimitive;


    Map<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> augmentation = Collections.emptyMap();

    public VnfConfigurationBuilder() {
    }
    public VnfConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations arg) {
        this._relation = arg.getRelation();
    }
    public VnfConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration arg) {
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._terminateConfigPrimitive = arg.getTerminateConfigPrimitive();
        this._configMethod = arg.getConfigMethod();
        this._metrics = arg.getMetrics();
    }
    public VnfConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod arg) {
        this._configMethod = arg.getConfigMethod();
    }
    public VnfConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics arg) {
        this._metrics = arg.getMetrics();
    }
    public VnfConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess arg) {
        this._configAccess = arg.getConfigAccess();
    }

    public VnfConfigurationBuilder(VnfConfiguration base) {
        this._configAccess = base.getConfigAccess();
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        this._relation = base.getRelation();
        this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
        if (base instanceof VnfConfigurationImpl) {
            VnfConfigurationImpl impl = (VnfConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> aug =((AugmentationHolder<VnfConfiguration>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations</li>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration) {
            this._configPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getConfigPrimitive();
            this._initialConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getInitialConfigPrimitive();
            this._terminateConfigPrimitive = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration)arg).getTerminateConfigPrimitive();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod) {
            this._configMethod = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod)arg).getConfigMethod();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess) {
            this._configAccess = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess)arg).getConfigAccess();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations) {
            this._relation = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations)arg).getRelation();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics) {
            this._metrics = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics)arg).getMetrics();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics]");
    }

    public ConfigAccess getConfigAccess() {
        return _configAccess;
    }
    
    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public List<ConfigPrimitive> getConfigPrimitive() {
        return _configPrimitive;
    }
    
    public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public List<Metrics> getMetrics() {
        return _metrics;
    }
    
    public List<Relation> getRelation() {
        return _relation;
    }
    
    public List<TerminateConfigPrimitive> getTerminateConfigPrimitive() {
        return _terminateConfigPrimitive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfConfiguration>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VnfConfigurationBuilder setConfigAccess(final ConfigAccess value) {
        this._configAccess = value;
        return this;
    }
    
    public VnfConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public VnfConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> values) {
        this._configPrimitive = values;
        return this;
    }
    
    public VnfConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        this._initialConfigPrimitive = values;
        return this;
    }
    
    public VnfConfigurationBuilder setMetrics(final List<Metrics> values) {
        this._metrics = values;
        return this;
    }
    
    public VnfConfigurationBuilder setRelation(final List<Relation> values) {
        this._relation = values;
        return this;
    }
    
    public VnfConfigurationBuilder setTerminateConfigPrimitive(final List<TerminateConfigPrimitive> values) {
        this._terminateConfigPrimitive = values;
        return this;
    }
    
    
    public VnfConfigurationBuilder addAugmentation(Class<? extends Augmentation<VnfConfiguration>> augmentationType, Augmentation<VnfConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfConfigurationBuilder removeAugmentation(Class<? extends Augmentation<VnfConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfConfiguration build() {
        return new VnfConfigurationImpl(this);
    }

    private static final class VnfConfigurationImpl implements VnfConfiguration {
    
        private final ConfigAccess _configAccess;
        private final ConfigMethod _configMethod;
        private final List<ConfigPrimitive> _configPrimitive;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<Metrics> _metrics;
        private final List<Relation> _relation;
        private final List<TerminateConfigPrimitive> _terminateConfigPrimitive;
    
        private Map<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> augmentation = Collections.emptyMap();
    
        VnfConfigurationImpl(VnfConfigurationBuilder base) {
            this._configAccess = base.getConfigAccess();
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = base.getConfigPrimitive();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            this._metrics = base.getMetrics();
            this._relation = base.getRelation();
            this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<VnfConfiguration> getImplementedInterface() {
            return VnfConfiguration.class;
        }
    
        @Override
        public ConfigAccess getConfigAccess() {
            return _configAccess;
        }
        
        @Override
        public ConfigMethod getConfigMethod() {
            return _configMethod;
        }
        
        @Override
        public List<ConfigPrimitive> getConfigPrimitive() {
            return _configPrimitive;
        }
        
        @Override
        public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @Override
        public List<Metrics> getMetrics() {
            return _metrics;
        }
        
        @Override
        public List<Relation> getRelation() {
            return _relation;
        }
        
        @Override
        public List<TerminateConfigPrimitive> getTerminateConfigPrimitive() {
            return _terminateConfigPrimitive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfConfiguration>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configAccess);
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_metrics);
            result = prime * result + Objects.hashCode(_relation);
            result = prime * result + Objects.hashCode(_terminateConfigPrimitive);
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
            if (!VnfConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfConfiguration other = (VnfConfiguration)obj;
            if (!Objects.equals(_configAccess, other.getConfigAccess())) {
                return false;
            }
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configPrimitive, other.getConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_metrics, other.getMetrics())) {
                return false;
            }
            if (!Objects.equals(_relation, other.getRelation())) {
                return false;
            }
            if (!Objects.equals(_terminateConfigPrimitive, other.getTerminateConfigPrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfConfigurationImpl otherImpl = (VnfConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfConfiguration");
            CodeHelpers.appendValue(helper, "_configAccess", _configAccess);
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "_relation", _relation);
            CodeHelpers.appendValue(helper, "_terminateConfigPrimitive", _terminateConfigPrimitive);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
