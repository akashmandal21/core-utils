package com.stanzaliving.core.projectservice.enums;

public enum  PropertyUpdateEnum {

    ZONAL_HEAD_ASSIGNED("Zonal Head Assigned"),
    SITE_ENGINEER_ASSIGNED("Site Engineer Assigned"),
    PROJECT_MANAGER_ASSIGNED("Project manager Assigned"),
    SFR_COMPLETED("SFR Completed"),
    AS_IS_COMPLETED("As-Is Completed"),
    OFR_COMPLETED("OFR Completed"),
    GFC_APPROVED("GFC Approved"),
    BED_COUNT_FINALIZATION_COMPLETED("Bed Count finalization Completed");

    private String updateTaskName;

    PropertyUpdateEnum(String updateTaskName){
        this.updateTaskName = updateTaskName;
    }

}
