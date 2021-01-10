package com.stanzaliving.core.projectservice.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum  PropertyUpdateEnum {

    PROPERTY_ADDED("Property Added in Phoenix",false,null,null),
    PROPERTY_UPDATED("Property Updated in Phoenix",false,null,null),

    //Projects
    PROJECT_ZONAL_HEAD_ASSIGNED("Project Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED, Department.PROJECTS),
    PROJECT_MANAGER_ASSIGNED("Project manager Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),
    PROJECT_SITE_ENGINEER_ASSIGNED("Project Site Engineer Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),
    PROJECT_SITE_ENGINEER_CHANGED("Project Site Engineer Changed",true,NotificationTaskType.PROPERTY_REMOVED, null, "Project Site Engineer"),
    PROJECT_MANAGER_CHANGED("Project manager Changed",true,NotificationTaskType.PROPERTY_REMOVED, null, "Project Manager"),


    //GC
    GC_ZONAL_HEAD_ASSIGNED("GC Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED,Department.GC),

    //AS-IS Intermediate
    PROJECT_AS_IS_VENDOR_ASSIGNED("As is Vendor Assigned",true,NotificationTaskType.AS_IS_VENDOR_ASSIGNED),
    PROJECT_AS_IS_UPLOADED("As is Sent for Approval",false,NotificationTaskType.AS_IS_UPLOADED, null, "As-Is Drawings"),
    PROJECT_AS_IS_SENT_BACK("As is Sent Back by PM",false,NotificationTaskType.AS_IS_REJECTED, null, "As-Is Drawings"),

    PROJECT_AS_IS_COMPLETED("As-Is Completed",true,NotificationTaskType.AS_IS_APPROVED, null, "As-Is Drawings"),

    PROJECT_SFR_COMPLETED("SFR Completed",true,NotificationTaskType.SFR_SUBMITTED),
    PROJECT_OFR_COMPLETED("OFR Completed",true,NotificationTaskType.OFR_COMPLETED),

    //Project Schedule
    PROJECT_SCHEDULE_CREATION_COMPLETE("Full Project Schedule created",true,NotificationTaskType.FULL_PROJECT_SCHEDULE_CREATED_ON_APP),
    TASK_STARTED("Task start",false, NotificationTaskType.TASK_MARKED_STARTED_ON_APP),
    TASK_DELAYED("Task marked delayed",false,NotificationTaskType.TASK_MARKED_DELAYED_ON_APP),
    TASK_COMPLETED("Task marked Completed",false,NotificationTaskType.TASK_MARKED_COMPLETED_ON_APP),


    //GC Service
    GC_SCHDULE_CREATED("GC Schedule created",true,NotificationTaskType.GC_SCHEDULE_CREATED),

    //Design
    DESIGN_ZONAL_HEAD_ASSIGNED("Design Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED, Department.DESIGN),
    DESIGN_COORDINATOR_ASSIGNED("Design Coordinator Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),
    DESIGN_COORDINATOR_CHANGED("Design Coordinator changed",true,NotificationTaskType.PROPERTY_REMOVED, null, "Design Coordinator"),

    //GFC Intermediate
    DESIGN_GFC_UPLOADED("GFC Sent for Approval",false,NotificationTaskType.GFC_DRAWINGS_UPLOADED, null, "GFC drawings"),
    DESIGN_GFC_SENT_BACK("GFC Sent Back",false,NotificationTaskType.GFC_DRAWINGS_REJECTED, null, "GFC drawings"),
    DESIGN_GFC_APPROVAL("GFC Approval",false,NotificationTaskType.GFC_DRAWINGS_APPROVED, null, "GFC drawings"),

    //GFC Completed
    DESIGN_GFC_APPROVED("GFC Completed",true,NotificationTaskType.GFC_DRAWINGS_APPROVED, null, "GFC drawings"),

    DESIGN_BED_COUNT_SUBMITTED_NO_DEVIATION("Design Bed Count Submitted with no deviation",false,NotificationTaskType.DESIGN_BED_COUNT_SUBMITTED_WITH_NO_DEVIATION),
    DESIGN_BED_COUNT_SUBMITTED_DEVIATION("Design Bed Count Submitted with deviation",false,NotificationTaskType.DESIGN_BED_COUNT_SUBMITTED_WITH_DEVIATION),
    DESIGN_BED_COUNT_SENT_BACK("Design Bed Count Sent Back",false,NotificationTaskType.DESIGN_BED_COUNT_SENT_BACK),
    DESIGN_BED_COUNT_FINALIZATION_COMPLETED("Bed Count finalization Completed",true,NotificationTaskType.DESIGN_BED_COUNT_DEVIATION_APPROVED),
    DESIGN_SUB_BRAND_UPDATE("Sub Brand added by Transformation head",true,NotificationTaskType.DESIGN_SUB_BRAND_UPDATE),

    DESIGN_BOQ_SUBMITTED("Boq Submitted For Approval",true,NotificationTaskType.MASTER_BOQ_SUBMITTED, null, "Master BOQ"),
    DESIGN_BOQ_SENT_BACK("Boq Sent Back",true,NotificationTaskType.MASTER_BOQ_REJECTED, null, "Master BOQ"),
    DESIGN_BOQ_APPROVED("Boq Approved",true,NotificationTaskType.MASTER_BOQ_APPROVED, null, "Master BOQ"),
    DESIGN_BOI_APPROVED("Boi Approved",true,NotificationTaskType.MASTER_BOI_APPROVED, null, "Master BOQ"),
    DESIGN_GC_APPROVED("Gc Approved",true,NotificationTaskType.MASTER_GC_APPROVED, null, "Master BOQ"),

    //BOQ Completed
    DESIGN_BOQ_COMPLETED("Boq completed",true,NotificationTaskType.MASTER_BOQ_APPROVED, null, "Master BOQ"),

    //EXTRA BOQ
    DESIGN_EXTRA_BOQ_SUBMITTED("Extra Boq Submitted For Approval",true,NotificationTaskType.MASTER_BOQ_SUBMITTED, null, "Extra BOQ"),
    DESIGN_EXTRA_BOQ_SENT_BACK("Extra Boq Sent Back",true,NotificationTaskType.MASTER_BOQ_REJECTED, null, "Extra BOQ"),
    DESIGN_EXTRA_BOQ_APPROVED("Extra Boq Approved",true,NotificationTaskType.MASTER_BOQ_APPROVED, null, "Extra BOQ"),
    DESIGN_EXTRA_BOI_APPROVED("Extra Boq Boi Approved",true,NotificationTaskType.MASTER_BOI_APPROVED, null, "Extra BOQ"),
    DESIGN_EXTRA_GC_APPROVED("Extra Boq Gc Approved",true,NotificationTaskType.MASTER_GC_APPROVED, null, "Extra BOQ"),
    DESIGN_EXTRA_BOQ_COMPLETED("Extra Boq completed",true,NotificationTaskType.MASTER_BOQ_APPROVED, null, "Extra BOQ"),

    //HOTO Submitted
    PROJECTS_HOTO_GENERATED("HOTO Generated",true,NotificationTaskType.HOTO_DOC_GENERATED),
    PROJECTS_HOTO_MODIFIED("HOTO Modified",true,NotificationTaskType.HOTO_DOC_MODIFIED),
    PROJECTS_HOTO_SIGNED_UPLOADED("HOTO Signed Uploaded",true,NotificationTaskType.HOTO_SIGNED_UPLOADED),

    //PO SERVICE
    PO_SUBMITTED("PO Submitted",false,NotificationTaskType.PO_SUBMITTED),
    PO_REJECTED("PO Rejected",false,NotificationTaskType.PO_REJECTED),
    PO_APPROVED("PO Approved",false,NotificationTaskType.PO_APPROVED),
    WAREHOUSE_PO_APPROVED("Warehouse PO Approved",false, NotificationTaskType.WAREHOUSE_PO_APPROVED),
    PO_CANCELLED("PO Cancelled", false, NotificationTaskType.PO_CANCELLED),
    PO_SHORT_CLOSED("PO Short Closed", false, NotificationTaskType.PO_SHORT_CLOSED),

    //GRN SERVICE
    GRN_BOI_ITEM_RECEIVED("BOI Item Receiving in GRN",false,NotificationTaskType.GRN_BOI_ITEM_RECEIVED),
    GRN_BOI_ITEM_INSTALLATION("BOI Item Installation in GRN",false,NotificationTaskType.GRN_BOI_ITEM_INSTALLATION),
    GRN_GC_ITEM_COMPLETION("GC Item completion in GRN",false,NotificationTaskType.GRN_GC_ITEM_COMPLETION),

    //SERVICE MIX
    SERVICE_MIX_OPENED("Service Mix moved to In Draft",true,NotificationTaskType.SERVICE_MIX_OPENED),
    SERVICE_MIX_SUBMITTED("Service Mix Submitted",true,NotificationTaskType.SERVICE_MIX_SUBMITTED),
    SERVICE_MIX_APPROVED("Service Mix Approved",true,NotificationTaskType.SERVICE_MIX_APPROVED),
    SERVICE_MIX_REJECTED("Service Mix Sent Back",true,NotificationTaskType.SERVICE_MIX_REJECTED),
    SERVICE_MIX_COMPLETED("Service Mix Completed",true,NotificationTaskType.SERVICE_MIX_COMPLETED),

    //FOR All other events where there are multiple complete signals. For e.g. Multiple POs/Invoices etc. Marker Event Only
    CHECK_COMPLETED_FROM_SOURCE_SERVICE("Check Completed Status from Source Service",false,null,null),
    LLHODOC_UPLOADED("LL HO Doc Uploaded",true,null),

    PROPERTY_DROPPED("Property Dropped",true,NotificationTaskType.PROPERTY_DROPPED,Department.PROJECTS);

    private String updateTaskName;
    private boolean needToPersist;
    private NotificationTaskType notificationTaskType;
    private Department defaultDepartment;
    private String taskOrRoleName;

    PropertyUpdateEnum(String updateTaskName,boolean needToPersist, NotificationTaskType notificationTaskType){
        this.updateTaskName = updateTaskName;
        this.needToPersist=needToPersist;
        this.notificationTaskType=notificationTaskType;
    }

    PropertyUpdateEnum(String updateTaskName,boolean needToPersist, NotificationTaskType notificationTaskType, Department defaultDepartment){
        this.updateTaskName = updateTaskName;
        this.needToPersist=needToPersist;
        this.notificationTaskType=notificationTaskType;
        this.defaultDepartment = defaultDepartment;
    }

}
