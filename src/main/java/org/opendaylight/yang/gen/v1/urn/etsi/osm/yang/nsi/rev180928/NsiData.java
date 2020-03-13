package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsi.rev180928;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * module nsi {
 *   yang-version 1;
 *   namespace urn:etsi:osm:yang:nsi;
 *   prefix nsi;
 *   import nst {
 *     prefix nst;
 *   }
 *   import nsr {
 *     prefix nsr;
 *   }
 *   import osm-project {
 *     prefix osm-project;
 *   }
 *   import netslice-instantiation-parameters {
 *     prefix netslice-instantiation-parameters;
 *   }
 *   import ietf-yang-types {
 *     prefix yang;
 *   }
 *   revision 2018-09-28 {
 *   }
 *   grouping nsi {
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf nst-ref {
 *       type leafref {
 *         path /nst:nst/nst:id;
 *       }
 *     }
 *     container instantiation-parameters {
 *       uses netslice-instantiation-parameters:netslice_params;
 *     }
 *     container network-slice-template {
 *       uses nst:network-slice;
 *     }
 *     list nsr-ref-list {
 *       config false;
 *       key nsr-ref;
 *       leaf nsr-ref {
 *         config false;
 *         type leafref {
 *           path /osm-project:project/nsr:ns-instance-opdata/nsr:nsr/nsr:ns-instance-config-ref;
 *         }
 *       }
 *     }
 *     list vlr-list {
 *       config false;
 *       key id;
 *       leaf id {
 *         config false;
 *         type yang:uuid;
 *       }
 *     }
 *   }
 *   list nsi {
 *     key id;
 *     unique name;
 *     uses nsi;
 *   }
 * }
 * </pre>
 *
 */
public interface NsiData
    extends
    DataRoot
{




    /**
     * @return <code>java.util.List</code> <code>nsi</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Nsi> getNsi();

}

