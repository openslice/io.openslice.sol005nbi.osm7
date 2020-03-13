package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.ns_params;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.NsParams;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.instantiation.parameters.rev180914.VnfParams;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vnf {
 *   key member-vnf-index;
 *   uses vnf_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params/vnf</i>
 * 
 * <p>To create instances of this class use {@link VnfBuilder}.
 * @see VnfBuilder
 * @see VnfKey
 *
 */
public interface Vnf
    extends
    ChildOf<NsParams>,
    Augmentable<Vnf>,
    VnfParams,
    Identifiable<VnfKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf");

    @Override
    VnfKey key();

}

