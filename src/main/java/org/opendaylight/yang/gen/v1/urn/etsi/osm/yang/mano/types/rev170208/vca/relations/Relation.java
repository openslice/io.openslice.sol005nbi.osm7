package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaRelations;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.relations.relation.Entities;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of relations between elements in this descriptor.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list relation {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list entities {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf endpoint {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relations/relation</i>
 * 
 * <p>To create instances of this class use {@link RelationBuilder}.
 * @see RelationBuilder
 * @see RelationKey
 *
 */
public interface Relation
    extends
    ChildOf<VcaRelations>,
    Augmentable<Relation>,
    Identifiable<RelationKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("relation");

    /**
     * Name of the relation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * List of two elements to be related.Elements to be related are identified by a 
     * pair (id, endpoint).The relation will relate (id1, endpoint1) to (id2, 
     * endpoint2).
     *
     *
     *
     * @return <code>java.util.List</code> <code>entities</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Entities> getEntities();
    
    @Override
    RelationKey key();

}

