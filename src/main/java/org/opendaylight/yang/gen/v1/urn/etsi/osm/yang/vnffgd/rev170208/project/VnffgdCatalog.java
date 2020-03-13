package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.Project1;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnffgd</b>
 * <pre>
 * container vnffgd-catalog {
 *   list vnffgd {
 *     key id;
 *     leaf name {
 *       type string;
 *     }
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf provider {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnffgd/project/(urn:etsi:osm:yang:vnffgd?revision=2017-02-08)vnffgd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnffgdCatalogBuilder}.
 * @see VnffgdCatalogBuilder
 *
 */
public interface VnffgdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnffgdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd-catalog");

    /**
     * @return <code>java.util.List</code> <code>vnffgd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnffgd> getVnffgd();

}

