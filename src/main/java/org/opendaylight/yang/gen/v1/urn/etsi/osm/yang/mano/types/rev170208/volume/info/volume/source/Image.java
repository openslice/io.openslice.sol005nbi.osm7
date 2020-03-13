package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.volume.source;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.volume.info.VolumeSource;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case image {
 *   uses image-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/image</i>
 *
 */
public interface Image
    extends
    DataObject,
    Augmentable<Image>,
    ImageProperties,
    VolumeSource
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("image");


}

