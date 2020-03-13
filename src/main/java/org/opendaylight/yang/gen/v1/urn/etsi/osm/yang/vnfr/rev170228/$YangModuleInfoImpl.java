package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:etsi:osm:yang:vnfr", "2017-02-28", "vnfr").intern();
    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    public static QName qnameOf(final java.lang.String localName) {
        return QName.create(NAME, localName).intern();
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vlr.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/vnfr@2017-02-28.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
