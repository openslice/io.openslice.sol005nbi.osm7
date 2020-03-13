package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.kdu.model;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.kdu.KduModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case helm-chart {
 *   leaf helm-chart {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/kdu/kdu-model/helm-chart</i>
 *
 */
public interface HelmChart
    extends
    DataObject,
    Augmentable<HelmChart>,
    KduModel
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("helm-chart");

    /**
     * Helm chart that models the KDU, in any of the following ways:- 
     * &amp;lt;helm-repo&amp;gt;/&amp;lt;helm-chart&amp;gt;- &amp;lt;helm-chart folder 
     * under k8s_models folder in the package&amp;gt;- &amp;lt;helm-chart tgz file (w/ 
     * or w/o extension) under k8s_models folder in the package&amp;gt;- 
     * &amp;lt;URL_where_to_fetch_chart&amp;gt;
     *
     *
     *
     * @return <code>java.lang.String</code> <code>helmChart</code>, or <code>null</code> if not present
     */
    @Nullable
    String getHelmChart();

}

