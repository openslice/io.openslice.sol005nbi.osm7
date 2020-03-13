package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.k8s.cluster;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.K8sCluster;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of required networks in the K8s cluster.The cluster where the KDUs will be 
 * deployed will have to useone of these CNI plugins.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list nets {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf external-connection-point-ref {
 *     type leafref {
 *       path ../../../connection-point/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/k8s-cluster/nets</i>
 * 
 * <p>To create instances of this class use {@link NetsBuilder}.
 * @see NetsBuilder
 * @see NetsKey
 *
 */
public interface Nets
    extends
    ChildOf<K8sCluster>,
    Augmentable<Nets>,
    Identifiable<NetsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nets");

    /**
     * Internal identifier for the K8s cluster network in this VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Leaf Ref to the particular external connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>externalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getExternalConnectionPointRef();
    
    @Override
    NetsKey key();

}

