package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.MonitoringType;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * VDU-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-metric {
 *   container vdu-metric {
 *     leaf vdu-ref {
 *       type leafref {
 *         path ../../../../../vdu/id;
 *       }
 *     }
 *     leaf vdu-metric-name-ref {
 *       type leafref {
 *         path "../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-metric</i>
 *
 */
public interface VduMetric
    extends
    DataObject,
    Augmentable<VduMetric>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric.VduMetric</code> <code>vduMetric</code>, or <code>null</code> if not present
     */
    @Nullable
    org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric.VduMetric getVduMetric();

}

