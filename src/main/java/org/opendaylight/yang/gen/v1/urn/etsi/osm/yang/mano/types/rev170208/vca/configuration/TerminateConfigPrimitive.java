package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PrimitiveParameterValue;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Terminate set of configuration primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list terminate-config-primitive {
 *   key seq;
 *   leaf seq {
 *     type uint64;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses primitive-parameter-value;
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/terminate-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link TerminateConfigPrimitiveBuilder}.
 * @see TerminateConfigPrimitiveBuilder
 * @see TerminateConfigPrimitiveKey
 *
 */
public interface TerminateConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<TerminateConfigPrimitive>,
    PrimitiveParameterValue,
    Identifiable<TerminateConfigPrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-config-primitive");

    /**
     * Sequence number for the configuration primitive.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>seq</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getSeq();
    
    /**
     * Name of the configuration primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * A user defined script.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUserDefinedScript();
    
    @Override
    TerminateConfigPrimitiveKey key();

}

