package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228.NsdConnectionPointCommon;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List for external connection points. Each NS has one or more external 
 * connectionpoints. As the name implies that external connection points are used 
 * for connectingthe NS to other NS or to external networks. Each NS exposes these 
 * connection pointsto the orchestrator. The orchestrator can construct network 
 * service chains byconnecting the connection points between different NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * grouping slice-connection-points {
 *   uses nsd-base:nsd-connection-point-common;
 *   choice connection {
 *     case netslice-vld-ref {
 *       leaf netslice-vld-id-ref {
 *         type string;
 *       }
 *     }
 *     case nsd-connection-point-ref {
 *       leaf nsd-id-ref {
 *         type leafref {
 *           path /nsd:nsd-catalog/nsd:nsd/nsd:id;
 *         }
 *       }
 *       leaf nsd-connection-point-ref {
 *         type leafref {
 *           path /nsd:nsd-catalog/nsd:nsd/nsd:connection-point/nsd:name;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points</i>
 *
 */
public interface SliceConnectionPoints
    extends
    DataObject,
    NsdConnectionPointCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("slice-connection-points");

    /**
     * Logical connection of the CP to a NSVLD or to a NSD CP
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection</code> <code>connection</code>, or <code>null</code> if not present
     */
    @Nullable
    Connection getConnection();

}

