package com.stanzaliving.sfr.enumeration;

import com.stanzaliving.sfr.statemachine.State;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public enum ModuleState implements State<ModuleState> {
    ASIS_NOT_STARTED("Not Started","#e5e3e3"),
    ASIS_IN_DRAFT("In Draft","#e5e3e3"),
    ASIS_SUBMITTED("Pending Approval","#FFB700"),
    ASIS_SENT_BACK("Sent Back","#F45F71"),
    ASIS_APPROVED("Approved","#60C3AD"),
    ASIS_CANCELLED("Cancelled","#e5e3e3");

    private final String status;
    private final String color;

    ModuleState(String status, String color){
        this.status=status;
        this.color=color;
    }
    
    public static final List<ModuleState> asIsApplicableStatuses =
            Arrays.asList(ASIS_IN_DRAFT, ASIS_SUBMITTED, ASIS_APPROVED, ASIS_SENT_BACK);
    
}
