package com.stanzaliving.core.projectservice.enums;

import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public enum  PropertyUpdateEnum {

    //Projects
    PROJECT_ZONAL_HEAD_ASSIGNED("Project Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED, Department.PROJECTS),
    PROJECT_MANAGER_ASSIGNED("Project manager Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),
    PROJECT_SITE_ENGINEER_ASSIGNED("Project Site Engineer Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),

    //AS-IS Intermediate
    PROJECT_AS_IS_VENDOR_ASSIGNED("As is Vendor Assigned",true,NotificationTaskType.AS_IS_VENDOR_ASSIGNED),
    PROJECT_AS_IS_UPLOADED("As is Sent for Approval",false,NotificationTaskType.AS_IS_UPLOADED),
    PROJECT_AS_IS_SENT_BACK("As is Sent Back by PM",false,NotificationTaskType.AS_IS_REJECTED),

    PROJECT_AS_IS_COMPLETED("As-Is Completed",true,NotificationTaskType.AS_IS_APPROVED),

    PROJECT_SFR_COMPLETED("SFR Completed",true,NotificationTaskType.SFR_SUBMITTED),
    PROJECT_OFR_COMPLETED("OFR Completed",true,NotificationTaskType.OFR_COMPLETED),

    //Project Schedule
    PROJECT_SCHEDULE_CREATION_COMPLETE("Full Project Schedule created",true,NotificationTaskType.FULL_PROJECT_SCHEDULE_CREATED_ON_APP),
    TASK_DELAYED("Task marked delayed",false,NotificationTaskType.TASK_MARKED_DELAYED_ON_APP),
    TASK_COMPLETED("Task marked Completed",false,NotificationTaskType.TASK_MARKED_COMPLETED_ON_APP),


    //Design
    DESIGN_ZONAL_HEAD_ASSIGNED("Design Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED, Department.PROJECTS),
    DESIGN_COORDINATOR_ASSIGNED("Design Zonal Head Assigned",true,NotificationTaskType.PROPERTY_ASSIGNED),

    //GFC Intermediate
    DESIGN_GFC_UPLOADED("GFC Sent for Approval",false,NotificationTaskType.GFC_DRAWINGS_UPLOADED),
    DESIGN_GFC_SENT_BACK("GFC Sent Back",false,NotificationTaskType.GFC_DRAWINGS_REJECTED),
    DESIGN_GFC_APPROVAL("GFC Approval",false,NotificationTaskType.GFC_DRAWINGS_APPROVED),

    //GFC Completed
    DESIGN_GFC_APPROVED("GFC Completed",true,NotificationTaskType.GFC_DRAWINGS_APPROVED),

    DESIGN_BED_COUNT_SUBMITTED_NO_DEVIATION("Design Bed Count Submitted with no deviation",false,NotificationTaskType.DESIGN_BED_COUNT_SUBMITTED_WITH_NO_DEVIATION),
    DESIGN_BED_COUNT_SUBMITTED_DEVIATION("Design Bed Count Submitted with deviation",false,NotificationTaskType.DESIGN_BED_COUNT_SUBMITTED_WITH_DEVIATION),
    DESIGN_BED_COUNT_SENT_BACK("Design Bed Count Sent Back",false,NotificationTaskType.DESIGN_BED_COUNT_SENT_BACK),
    DESIGN_BED_COUNT_FINALIZATION_COMPLETED("Bed Count finalization Completed",true,NotificationTaskType.DESIGN_BED_COUNT_DEVIATION_APPROVED),

    DESIGN_BOQ_SUBMITTED("Boq Submitted For Approval",true,NotificationTaskType.MASTER_BOQ_SUBMITTED),
    DESIGN_BOQ_SENT_BACK("Boq Sent Back",true,NotificationTaskType.MASTER_BOQ_REJECTED),

    //BOQ Completed
    DESIGN_BOQ_COMPLETED("Boq completed",true,NotificationTaskType.MASTER_BOQ_APPROVED);


    private String updateTaskName;
    private boolean needToPersist;
    private NotificationTaskType notificationTaskType;
    private Department defaultDepartment;

    PropertyUpdateEnum(String updateTaskName,boolean needToPersist, NotificationTaskType notificationTaskType){
        this.updateTaskName = updateTaskName;
        this.needToPersist=needToPersist;
        this.notificationTaskType=notificationTaskType;
    }
}
