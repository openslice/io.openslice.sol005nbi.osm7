package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.FgdCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Classifier;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.netslicefgd.Rsp;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping netslicefgd {
 *   uses nsd-base:fgd-common;
 *   list rsp {
 *     key id;
 *     uses rsp;
 *   }
 *   list classifier {
 *     key id;
 *     uses classifier;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/netslicefgd</i>
 *
 */
public interface Netslicefgd
    extends
    DataObject,
    FgdCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslicefgd");

    /**
     * List of Rendered Service Paths (RSP).
     *
     *
     *
     * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Rsp> getRsp();
    
    /**
     * List of classifier rules.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifier</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Classifier> getClassifier();

}

