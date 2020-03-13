package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.osm.project.rev150910.Project;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

public interface Project3
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.NsInstanceOpdata</code> <code>nsInstanceOpdata</code>, or <code>null</code> if not present
     */
    @Nullable
    NsInstanceOpdata getNsInstanceOpdata();

}

