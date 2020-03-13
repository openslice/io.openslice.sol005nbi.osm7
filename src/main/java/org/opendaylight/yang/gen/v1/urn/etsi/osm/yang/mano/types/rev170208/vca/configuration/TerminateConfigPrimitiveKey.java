package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.vca.configuration;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class TerminateConfigPrimitiveKey
 implements Identifier<TerminateConfigPrimitive> {
    private static final long serialVersionUID = -2002004714264740110L;
    private final BigInteger _seq;


    public TerminateConfigPrimitiveKey(BigInteger _seq) {
    
    
        this._seq = _seq;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TerminateConfigPrimitiveKey(TerminateConfigPrimitiveKey source) {
        this._seq = source._seq;
    }


    public BigInteger getSeq() {
        return _seq;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_seq);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TerminateConfigPrimitiveKey other = (TerminateConfigPrimitiveKey) obj;
        if (!Objects.equals(_seq, other._seq)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(TerminateConfigPrimitiveKey.class);
        CodeHelpers.appendValue(helper, "_seq", _seq);
        return helper.toString();
    }
}

