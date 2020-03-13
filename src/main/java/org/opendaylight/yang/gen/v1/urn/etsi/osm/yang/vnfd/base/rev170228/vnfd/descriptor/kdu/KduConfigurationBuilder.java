package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link KduConfigurationBuilder} instances.
 * 
 * @see KduConfigurationBuilder
 *
 */
public class KduConfigurationBuilder implements Builder<KduConfiguration> {

    private List<KduConfiguration.BlacklistConfigPrimitive> _blacklistConfigPrimitive;
    private ConfigAccess _configAccess;
    private ConfigMethod _configMethod;
    private List<ConfigPrimitive> _configPrimitive;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<Metrics> _metrics;
    private List<TerminateConfigPrimitive> _terminateConfigPrimitive;


    Map<Class<? extends Augmentation<KduConfiguration>>, Augmentation<KduConfiguration>> augmentation = Collections.emptyMap();

    public KduConfigurationBuilder() {
    }
    public KduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration arg) {
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._terminateConfigPrimitive = arg.getTerminateConfigPrimitive();
        this._configMethod = arg.getConfigMethod();
        this._metrics = arg.getMetrics();
    }
    public KduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod arg) {
        this._configMethod = arg.getConfigMethod();
    }
    public KduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics arg) {
        this._metrics = arg.getMetrics();
    }
    public KduConfigurationBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess arg) {
        this._configAccess = arg.getConfigAccess();
    }

    public KduConfigurationBuilder(KduConfiguration base) {
        this._blacklistConfigPrimitive = base.getBlacklistConfigPrimitive();
        this._configAccess = base.getConfigAccess();
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
        if (base instanceof KduConfigurationImpl) {
            KduConfigurationImpl impl = (KduConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<KduConfiguration>>, Augmentation<KduConfiguration>> aug =((AugmentationHolder<KduConfiguration>) base).augmentations();
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
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics) {
            this._metrics = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics)arg).getMetrics();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ConfigurationMethod, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfigAccess, org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaMetrics]");
    }

    public List<KduConfiguration.BlacklistConfigPrimitive> getBlacklistConfigPrimitive() {
        return _blacklistConfigPrimitive;
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
    
    public List<TerminateConfigPrimitive> getTerminateConfigPrimitive() {
        return _terminateConfigPrimitive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<KduConfiguration>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public KduConfigurationBuilder setBlacklistConfigPrimitive(final List<KduConfiguration.BlacklistConfigPrimitive> values) {
        this._blacklistConfigPrimitive = values;
        return this;
    }
    
    
    public KduConfigurationBuilder setConfigAccess(final ConfigAccess value) {
        this._configAccess = value;
        return this;
    }
    
    public KduConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public KduConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> values) {
        this._configPrimitive = values;
        return this;
    }
    
    public KduConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        this._initialConfigPrimitive = values;
        return this;
    }
    
    public KduConfigurationBuilder setMetrics(final List<Metrics> values) {
        this._metrics = values;
        return this;
    }
    
    public KduConfigurationBuilder setTerminateConfigPrimitive(final List<TerminateConfigPrimitive> values) {
        this._terminateConfigPrimitive = values;
        return this;
    }
    
    
    public KduConfigurationBuilder addAugmentation(Class<? extends Augmentation<KduConfiguration>> augmentationType, Augmentation<KduConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public KduConfigurationBuilder removeAugmentation(Class<? extends Augmentation<KduConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public KduConfiguration build() {
        return new KduConfigurationImpl(this);
    }

    private static final class KduConfigurationImpl implements KduConfiguration {
    
        private final List<KduConfiguration.BlacklistConfigPrimitive> _blacklistConfigPrimitive;
        private final ConfigAccess _configAccess;
        private final ConfigMethod _configMethod;
        private final List<ConfigPrimitive> _configPrimitive;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<Metrics> _metrics;
        private final List<TerminateConfigPrimitive> _terminateConfigPrimitive;
    
        private Map<Class<? extends Augmentation<KduConfiguration>>, Augmentation<KduConfiguration>> augmentation = Collections.emptyMap();
    
        KduConfigurationImpl(KduConfigurationBuilder base) {
            this._blacklistConfigPrimitive = base.getBlacklistConfigPrimitive();
            this._configAccess = base.getConfigAccess();
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = base.getConfigPrimitive();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            this._metrics = base.getMetrics();
            this._terminateConfigPrimitive = base.getTerminateConfigPrimitive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<KduConfiguration> getImplementedInterface() {
            return KduConfiguration.class;
        }
    
        @Override
        public List<KduConfiguration.BlacklistConfigPrimitive> getBlacklistConfigPrimitive() {
            return _blacklistConfigPrimitive;
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
        public List<TerminateConfigPrimitive> getTerminateConfigPrimitive() {
            return _terminateConfigPrimitive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<KduConfiguration>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_blacklistConfigPrimitive);
            result = prime * result + Objects.hashCode(_configAccess);
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_metrics);
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
            if (!KduConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            KduConfiguration other = (KduConfiguration)obj;
            if (!Objects.equals(_blacklistConfigPrimitive, other.getBlacklistConfigPrimitive())) {
                return false;
            }
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
            if (!Objects.equals(_terminateConfigPrimitive, other.getTerminateConfigPrimitive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                KduConfigurationImpl otherImpl = (KduConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<KduConfiguration>>, Augmentation<KduConfiguration>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("KduConfiguration");
            CodeHelpers.appendValue(helper, "_blacklistConfigPrimitive", _blacklistConfigPrimitive);
            CodeHelpers.appendValue(helper, "_configAccess", _configAccess);
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "_terminateConfigPrimitive", _terminateConfigPrimitive);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
