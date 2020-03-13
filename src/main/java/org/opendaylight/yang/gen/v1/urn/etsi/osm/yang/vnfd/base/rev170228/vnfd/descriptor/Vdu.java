package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.GuestEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HostEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.HypervisorEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ImageProperties;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.SupplementalBootData;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VmFlavor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.VswitchEpa;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.VnfdDescriptor;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VduBuilder.VduImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Alarm;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.AlternativeImages;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Interface;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.InternalConnectionPoint;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.MonitoringParam;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.Volumes;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * List of Virtual Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf pdu-type {
 *     type string;
 *   }
 *   leaf count {
 *     type uint64;
 *   }
 *   leaf mgmt-vpci {
 *     type string;
 *   }
 *   uses manotypes:vm-flavor;
 *   uses manotypes:guest-epa;
 *   uses manotypes:vswitch-epa;
 *   uses manotypes:hypervisor-epa;
 *   uses manotypes:host-epa;
 *   list alarm {
 *     key alarm-id;
 *     leaf alarm-id {
 *       type string;
 *     }
 *     leaf vnf-monitoring-param-ref {
 *       type leafref {
 *         path ../../monitoring-param/id;
 *       }
 *     }
 *     uses manotypes:alarm-properties;
 *   }
 *   uses manotypes:image-properties;
 *   list alternative-images {
 *     key vim-type;
 *     leaf vim-type {
 *       type string;
 *     }
 *     uses manotypes:image-properties;
 *   }
 *   container vdu-configuration {
 *     uses manotypes:vca-configuration;
 *     uses manotypes:vca-config-access;
 *   }
 *   list monitoring-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf nfvi-metric {
 *       type manotypes:nfvi-metric-type;
 *     }
 *     leaf interface-name-ref {
 *       type leafref {
 *         path ../../interface/name;
 *       }
 *     }
 *   }
 *   choice cloud-init-input {
 *     case inline {
 *       leaf cloud-init {
 *         type string;
 *       }
 *     }
 *     case filename {
 *       leaf cloud-init-file {
 *         type string;
 *       }
 *     }
 *   }
 *   uses manotypes:supplemental-boot-data;
 *   list internal-connection-point {
 *     key id;
 *     uses common-connection-point;
 *     leaf internal-vld-ref {
 *       type leafref {
 *         path ../../../internal-vld/id;
 *       }
 *     }
 *   }
 *   list interface {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf position {
 *       type uint32;
 *     }
 *     leaf mgmt-interface {
 *       type boolean;
 *       default false;
 *     }
 *     leaf type {
 *       type interface-type;
 *       default EXTERNAL;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     choice connection-point-type {
 *       case internal {
 *         leaf internal-connection-point-ref {
 *           type leafref {
 *             path ../../../../internal-connection-point/id;
 *           }
 *         }
 *       }
 *       case external {
 *         leaf external-connection-point-ref {
 *           type leafref {
 *             path ../../../../../connection-point/name;
 *           }
 *         }
 *       }
 *     }
 *     uses virtual-interface;
 *   }
 *   list volumes {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:volume-info;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu</i>
 * 
 * <p>To create instances of this class use {@link VduBuilder}.
 * @see VduBuilder
 * @see VduKey
 *
 */
@JsonDeserialize(as = VduImpl.class)
//@JsonIgnoreProperties( {"cloud-init-file"} )
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Vdu
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<Vdu>,
    GuestEpa,
    SupplementalBootData,
    HypervisorEpa,
    ImageProperties,
    VmFlavor,
    VswitchEpa,
    HostEpa,
    Identifiable<VduKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    /**
     * Unique id for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Unique name for the VDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Description of the VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Type of PDU. If this field exists, the deployment unit must beunderstood as a 
     * PDU, not as a VDU. This field is used to identifythe category of PDU instances 
     * to be used at instantiation time. Forthe instantiation to be successful, there 
     * must be availablePDU instances of this type in the selected datacenter.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>pduType</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPduType();
    
    /**
     * Number of instances of VDU
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCount();
    
    /**
     * Specifies the virtual PCI address. Expressed inthe following format 
     * dddd:dd:dd.d. For example0000:00:12.0. This information can be used topass as 
     * metadata during the VM creation.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>mgmtVpci</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMgmtVpci();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Alarm> getAlarm();
    
    /**
     * List of alternative images per VIM type.Different images can be used for 
     * specific types of VIMs insteadof the default image. This allows deployments in 
     * sites where theimage identifier in the VIM is given by the VIM provider 
     * andcannot be modified.If an alternative image is specified for a VIM type, it 
     * will prevailover the default image
     *
     *
     *
     * @return <code>java.util.List</code> <code>alternativeImages</code>, or <code>null</code> if not present
     */
    @Nullable
    List<AlternativeImages> getAlternativeImages();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.VduConfiguration</code> <code>vduConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable
    VduConfiguration getVduConfiguration();
    
    /**
     * List of VDU-related monitoring parameters at NFVI level
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MonitoringParam> getMonitoringParam();
    
    /**
     * Indicates how the contents of cloud-init script are provided.There are 2 choices
     * - inline or in a file
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput</code> <code>cloudInitInput</code>, or <code>null</code> if not present
     */
    @Nullable
    CloudInitInput getCloudInitInput();
    
    /**
     * List for internal connection points. Each VNFChas zero or more internal 
     * connection points.Internal connection points are used for connectingthe VNF with
     * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
     * internalconnection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * List of Interfaces (external and internal) for the VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>interface</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Interface> getInterface();
    
    /**
     * @return <code>java.util.List</code> <code>volumes</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Volumes> getVolumes();
    
    @Override
    VduKey key();

}

