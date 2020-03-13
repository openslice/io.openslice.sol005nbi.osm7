package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:etsi:osm:yang:mano-types", "2017-02-08", "mano-types").intern();
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
        set.add(org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/mano-types@2017-02-08.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
