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
    ASIS_CANCELLED("Cancelled","#e5e3e3"),

    CONCEPT_IN_DRAFT("In Draft", "#e5e3e3"),
    CONCEPT_ALIGNED("Aligned","#77baa6"),
    CONCEPT_SUBMITTED("Submitted", "FFC300"),
    CONCEPT_MISALIGNED("Misaligned", "F45F71"),
    SFR_IN_DRAFT("In Draft","#e5e3e3"),
    SFR_SUBMITTED("Pending Approval","#FFB700"),

    HOTO_IN_DRAFT("HOTO IN DRAFT","#e5e3e3"),
    HOTO_APPROVED("HOTO APPROVED","#77baa6"),
    HOTO_SUBMISSION_IN_DRAFT("HOTO SUBMISSION IN DRAFT","#e5e3e3"),
    HOTO_SUBMISSION_SUBMITTED("HOTO SUBMISSION SUBMITTED","#FFC300"),
    HOTO_SUBMISSION_APPROVED("HOTO SUBMISSION APPROVED","#77baa6"),
    HOTO_SUBMISSION_SENT_BACK("HOTO SUBMISSION SENT BACK","#F45F71"),
    LL_HO_NOT_STARTED("Not Started","#e5e3e3"),
    LL_HO_IN_DRAFT("In Draft", "#e5e3e3"),
    LL_HO_PENDING_L1_APPROVAL("Pending L1 Approval","#FFC300"),
    LL_HO_PENDING_L2_APPROVAL("Pending L2 Approval","#FFC300"),
    LL_HO_PENDING_L3_APPROVAL("Pending L3 Approval","#FFC300"),
    LL_HO_LL_SIGN_PENDING("Landlord Sign Pending","#FFC300"),
    LL_HO_APPROVED("Approved","#77baa6"),
    PARALLEL_ENTRY_PENDING_L1_APPROVAL("Parallel Entry Pending L1 Approval","#FFC300"),
    PARALLEL_ENTRY_PENDING_L2_APPROVAL("Parallel Entry Pending L2 Approval","#FFC300"),
    PARALLEL_ENTRY_PENDING_L3_APPROVAL("Parallel Entry Pending L3 Approval","#FFC300"),
    PARALLEL_ENTRY_APPROVED("Approved","#77baa6");

    private final String status;
    private final String color;

    ModuleState(String status, String color){
        this.status=status;
        this.color=color;
    }

}
