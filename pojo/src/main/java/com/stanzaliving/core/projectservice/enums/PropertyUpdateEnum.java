package com.stanzaliving.core.projectservice.enums;

public enum  PropertyUpdateEnum {

    SFR_COMPLETED("SFR Completed"),
    AS_IS_COMPLETED("As-Is Completed"),
    OFR_COMPLETED("OFR Completed"),
    BED_COUNT_FINALIZATION_COMPLETED("Bed Count finalization Completed");

    private String updateTaskName;

    PropertyUpdateEnum(String updateTaskName){
        this.updateTaskName = updateTaskName;
    }

}
