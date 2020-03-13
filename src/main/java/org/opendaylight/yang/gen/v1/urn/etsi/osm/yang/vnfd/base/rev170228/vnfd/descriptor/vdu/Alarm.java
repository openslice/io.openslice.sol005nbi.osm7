package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.AlarmProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list alarm {
 *   key alarm-id;
 *   leaf alarm-id {
 *     type string;
 *   }
 *   leaf vnf-monitoring-param-ref {
 *     type leafref {
 *       path ../../monitoring-param/id;
 *     }
 *   }
 *   uses manotypes:alarm-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alarm</i>
 * 
 * <p>To create instances of this class use {@link AlarmBuilder}.
 * @see AlarmBuilder
 * @see AlarmKey
 *
 */
public interface Alarm
    extends
    ChildOf<Vdu>,
    Augmentable<Alarm>,
    AlarmProperties,
    Identifiable<AlarmKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alarm");

    /**
     * This field is reserved for the identifier assigned by the VIM provider
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alarmId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getAlarmId();
    
    /**
     * Reference to the VNF level monitoring parameterthat is aggregated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfMonitoringParamRef();
    
    @Override
    AlarmKey key();

}

