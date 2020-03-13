package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceConfig;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Project2
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceConfig</code> <code>nsInstanceConfig</code>, or <code>null</code> if not present
     */
    @Nullable
    NsInstanceConfig getNsInstanceConfig();

}

