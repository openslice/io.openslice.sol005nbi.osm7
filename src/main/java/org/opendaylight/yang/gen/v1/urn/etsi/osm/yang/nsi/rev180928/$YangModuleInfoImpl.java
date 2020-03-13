package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:etsi:osm:yang:nsi", "2018-09-28", "nsi").intern();
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
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.netslice.instantiation.parameters.rev181128.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/nsi@2018-09-28.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
