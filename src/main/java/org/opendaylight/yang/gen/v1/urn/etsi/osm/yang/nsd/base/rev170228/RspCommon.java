package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.base.rev170228;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping rsp-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/rsp-common</i>
 *
 */
public interface RspCommon
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp-common");

    /**
     * Identifier for the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * RSP name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

