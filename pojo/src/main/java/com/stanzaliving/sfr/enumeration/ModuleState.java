package com.stanzaliving.sfr.enumeration;

import com.stanzaliving.sfr.statemachine.State;
import lombok.Getter;

@Getter
public enum ModuleState implements State<ModuleState> {
    ASIS_NOT_STARTED("Not Started","#e5e3e3"),
    ASIS_IN_DRAFT("In Draft","#e5e3e3"),
    ASIS_SUBMITTED("Pending Approval","#FFC300"),
    ASIS_SENT_BACK("Sent Back","#e5e3e3"),
    ASIS_APPROVED("Approved","#77baa6"),
    ASIS_CANCELLED("Cancelled","#e5e3e3");

    private String status, color;

    ModuleState(String status, String color){
        this.status=status;
        this.color=color;
    }
}
