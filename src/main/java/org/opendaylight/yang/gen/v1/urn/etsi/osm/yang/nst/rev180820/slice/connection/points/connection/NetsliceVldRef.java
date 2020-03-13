package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.connection;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nst.rev180820.slice.connection.points.Connection;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nst</b>
 * <pre>
 * case netslice-vld-ref {
 *   leaf netslice-vld-id-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nst/slice-connection-points/connection/netslice-vld-ref</i>
 *
 */
public interface NetsliceVldRef
    extends
    DataObject,
    Augmentable<NetsliceVldRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("netslice-vld-ref");

    /**
     * ID reference to a NSVLD in the NS
     *
     *
     *
     * @return <code>java.lang.String</code> <code>netsliceVldIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNetsliceVldIdRef();

}

