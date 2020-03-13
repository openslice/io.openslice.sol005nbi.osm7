package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.RspCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.rsp.NsdConnectionPointRef;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping rsp {
 *   uses nsd-base:rsp-common;
 *   list nsd-connection-point-ref {
 *     key nsd-ref;
 *     leaf nsd-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *       }
 *     }
 *     leaf order {
 *       type uint8;
 *     }
 *     leaf nsd-connection-point-ref {
 *       type leafref {
 *         path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/rsp</i>
 *
 */
public interface Rsp
    extends
    DataObject,
    RspCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsdConnectionPointRef> getNsdConnectionPointRef();

}

