package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-config-primitive-values/input</i>
 * 
 * <p>To create instances of this class use {@link GetNsConfigPrimitiveValuesInputBuilder}.
 * @see GetNsConfigPrimitiveValuesInputBuilder
 *
 */
public interface GetNsConfigPrimitiveValuesInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<GetNsConfigPrimitiveValuesInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Name of the NS config primitive group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

