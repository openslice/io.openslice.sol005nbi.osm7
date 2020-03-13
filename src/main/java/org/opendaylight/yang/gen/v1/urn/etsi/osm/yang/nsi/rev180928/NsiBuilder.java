package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928;
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
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.InstantiationParameters;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NetworkSliceTemplate;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.NsrRefList;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.nsi.VlrList;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NsiBuilder} instances.
 * 
 * @see NsiBuilder
 *
 */
public class NsiBuilder implements Builder<Nsi> {

    private String _description;
    private Uuid _id;
    private InstantiationParameters _instantiationParameters;
    private String _name;
    private NetworkSliceTemplate _networkSliceTemplate;
    private List<NsrRefList> _nsrRefList;
    private String _nstRef;
    private String _shortName;
    private List<VlrList> _vlrList;
    private NsiKey key;


    Map<Class<? extends Augmentation<Nsi>>, Augmentation<Nsi>> augmentation = Collections.emptyMap();

    public NsiBuilder() {
    }
    public NsiBuilder(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._description = arg.getDescription();
        this._nstRef = arg.getNstRef();
        this._instantiationParameters = arg.getInstantiationParameters();
        this._networkSliceTemplate = arg.getNetworkSliceTemplate();
        this._nsrRefList = arg.getNsrRefList();
        this._vlrList = arg.getVlrList();
    }

    public NsiBuilder(Nsi base) {
        this.key = base.key();
        this._id = base.getId();
        this._description = base.getDescription();
        this._instantiationParameters = base.getInstantiationParameters();
        this._name = base.getName();
        this._networkSliceTemplate = base.getNetworkSliceTemplate();
        this._nsrRefList = base.getNsrRefList();
        this._nstRef = base.getNstRef();
        this._shortName = base.getShortName();
        this._vlrList = base.getVlrList();
        if (base instanceof NsiImpl) {
            NsiImpl impl = (NsiImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Nsi>>, Augmentation<Nsi>> aug =((AugmentationHolder<Nsi>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getId();
            this._name = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getName();
            this._shortName = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getShortName();
            this._description = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getDescription();
            this._nstRef = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getNstRef();
            this._instantiationParameters = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getInstantiationParameters();
            this._networkSliceTemplate = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getNetworkSliceTemplate();
            this._nsrRefList = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getNsrRefList();
            this._vlrList = ((org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G)arg).getVlrList();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928.Nsi$G]");
    }

    public NsiKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public InstantiationParameters getInstantiationParameters() {
        return _instantiationParameters;
    }
    
    public String getName() {
        return _name;
    }
    
    public NetworkSliceTemplate getNetworkSliceTemplate() {
        return _networkSliceTemplate;
    }
    
    public List<NsrRefList> getNsrRefList() {
        return _nsrRefList;
    }
    
    public String getNstRef() {
        return _nstRef;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public List<VlrList> getVlrList() {
        return _vlrList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Nsi>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsiBuilder withKey(final NsiKey key) {
        this.key = key;
        return this;
    }
    
    public NsiBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NsiBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public NsiBuilder setInstantiationParameters(final InstantiationParameters value) {
        this._instantiationParameters = value;
        return this;
    }
    
    public NsiBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NsiBuilder setNetworkSliceTemplate(final NetworkSliceTemplate value) {
        this._networkSliceTemplate = value;
        return this;
    }
    public NsiBuilder setNsrRefList(final List<NsrRefList> values) {
        this._nsrRefList = values;
        return this;
    }
    
    
    public NsiBuilder setNstRef(final String value) {
        this._nstRef = value;
        return this;
    }
    
    public NsiBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public NsiBuilder setVlrList(final List<VlrList> values) {
        this._vlrList = values;
        return this;
    }
    
    
    public NsiBuilder addAugmentation(Class<? extends Augmentation<Nsi>> augmentationType, Augmentation<Nsi> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsiBuilder removeAugmentation(Class<? extends Augmentation<Nsi>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsi build() {
        return new NsiImpl(this);
    }

    private static final class NsiImpl implements Nsi {
    
        private final String _description;
        private final Uuid _id;
        private final InstantiationParameters _instantiationParameters;
        private final String _name;
        private final NetworkSliceTemplate _networkSliceTemplate;
        private final List<NsrRefList> _nsrRefList;
        private final String _nstRef;
        private final String _shortName;
        private final List<VlrList> _vlrList;
        private final NsiKey key;
    
        private Map<Class<? extends Augmentation<Nsi>>, Augmentation<Nsi>> augmentation = Collections.emptyMap();
    
        NsiImpl(NsiBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new NsiKey(base.getId());
            }
            this._id = key.getId();
            this._description = base.getDescription();
            this._instantiationParameters = base.getInstantiationParameters();
            this._name = base.getName();
            this._networkSliceTemplate = base.getNetworkSliceTemplate();
            this._nsrRefList = base.getNsrRefList();
            this._nstRef = base.getNstRef();
            this._shortName = base.getShortName();
            this._vlrList = base.getVlrList();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Nsi> getImplementedInterface() {
            return Nsi.class;
        }
    
        @Override
        public NsiKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public InstantiationParameters getInstantiationParameters() {
            return _instantiationParameters;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public NetworkSliceTemplate getNetworkSliceTemplate() {
            return _networkSliceTemplate;
        }
        
        @Override
        public List<NsrRefList> getNsrRefList() {
            return _nsrRefList;
        }
        
        @Override
        public String getNstRef() {
            return _nstRef;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<VlrList> getVlrList() {
            return _vlrList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Nsi>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instantiationParameters);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkSliceTemplate);
            result = prime * result + Objects.hashCode(_nsrRefList);
            result = prime * result + Objects.hashCode(_nstRef);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vlrList);
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
            if (!Nsi.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Nsi other = (Nsi)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_instantiationParameters, other.getInstantiationParameters())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkSliceTemplate, other.getNetworkSliceTemplate())) {
                return false;
            }
            if (!Objects.equals(_nsrRefList, other.getNsrRefList())) {
                return false;
            }
            if (!Objects.equals(_nstRef, other.getNstRef())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vlrList, other.getVlrList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsiImpl otherImpl = (NsiImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsi>>, Augmentation<Nsi>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsi");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_instantiationParameters", _instantiationParameters);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_networkSliceTemplate", _networkSliceTemplate);
            CodeHelpers.appendValue(helper, "_nsrRefList", _nsrRefList);
            CodeHelpers.appendValue(helper, "_nstRef", _nstRef);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_vlrList", _vlrList);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
