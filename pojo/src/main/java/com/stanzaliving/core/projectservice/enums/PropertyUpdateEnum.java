package com.stanzaliving.core.projectservice.enums;

public enum  PropertyUpdateEnum {

    PROJECT_ZONAL_HEAD_ASSIGNED("Project Zonal Head Assigned"),
    PROJECT_SITE_ENGINEER_ASSIGNED("Project Site Engineer Assigned"),
    PROJECT_AS_IS_VENDOR_ASSIGNED("As is Vendor Assigned"),
    PROJECT_MANAGER_ASSIGNED("Project manager Assigned"),
    PROJECT_SFR_COMPLETED("SFR Completed"),
    PROJECT_AS_IS_COMPLETED("As-Is Completed"),
    PROJECT_OFR_COMPLETED("OFR Completed"),


    DESIGN_ZONAL_HEAD_ASSIGNED("Design Zonal Head Assigned"),
    DESIGN_COORDINATOR_ASSIGNED("Design Zonal Head Assigned"),
    DESIGN_GFC_APPROVED("GFC Approved"),
    DESIGN_BED_COUNT_FINALIZATION_COMPLETED("Bed Count finalization Completed"),
    DESIGN_BOQ_COMPLETED("Boq completed");

    private String updateTaskName;

    PropertyUpdateEnum(String updateTaskName){
        this.updateTaskName = updateTaskName;
    }

}
