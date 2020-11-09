package com.stanzaliving.core.erp.supplychain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public enum SupplyChainEvents {
    PO_SUBMITTED("PO Submitted",false),
    PO_APPROVAL("PO Approval",true),
    PO_REJECTED("PO Rejected",true),
    PO_APPROVED("PO Approved",true),

    PO_SHORTCLOSE_SUBMIT("PO Shortclose Request Submitted",false),
    PO_SHORTCLOSE_APPROVAL("PO Shortclose Approval",true),
    PO_SHORTCLOSE_REJECTED("PO Shortclose Request Rejected",true),
    PO_SHORTCLOSED("PO Shortclosed",true),

    PO_CANCEL_SUBMIT("PO Cancel Request Submitted",false),
    PO_CANCEL_APPROVAL("PO Cancel Request Approval",true),
    PO_CANCEL_REJECTED("PO Cancel Request Rejected",true),
    PO_CANCELLED("PO Cancelled",true),
    PO_DURATION_EXPIRED("PO Duration expired",false),


    GSRI_STARTED("GSRI Started",false),
    GSRI_REC("Goods Received",false),
    GSRI_INSTALL("Goods Installation",false),
    GSRI_COMPLETED("GSRI Completed",false),


    ADV_INV_SUBMITTED("Advance Invoice Submitted",false),
    ADV_INV_APPROVED("Advance Invoice Approved",true),
    ADV_INV_REJECTED("Advance Invoice Rejected",true),

    ADV_PAYMENT("Advance Payment",false),
    ADV_PAYMENT_COMPLETE("Advance Paid in Full",true),

    REG_INV_SUBMITTED("Regular Invoice Submitted",false),
    REG_INV_APPROVED("Regular Invoice Approved",true),
    REG_INV_REJECTED("Regular Invoice Rejected",true),

    REG_INV_PAYMENT("Regular Invoice Payment",false),
    REG_INV_PAYMENT_COMPLETE("Regular Invoice Paid in Full",true);



    private String eventText;
    private boolean slaEligible;

    SupplyChainEvents(String eventText,boolean slaEligible){
        this.eventText=eventText;
        this.slaEligible=slaEligible;
    }

    private static Map<SupplyChainEvents, List<SupplyChainEvents>> parentSCEvents = new HashMap<>();

    static {
        parentSCEvents.put(PO_APPROVAL, Arrays.asList(PO_APPROVAL,PO_SUBMITTED));
        parentSCEvents.put(PO_REJECTED, Arrays.asList(PO_APPROVAL,PO_SUBMITTED));
        parentSCEvents.put(PO_APPROVED, Arrays.asList(PO_SUBMITTED));


        parentSCEvents.put(PO_SHORTCLOSE_APPROVAL, Arrays.asList(PO_SHORTCLOSE_APPROVAL,PO_SHORTCLOSE_SUBMIT));
        parentSCEvents.put(PO_SHORTCLOSE_REJECTED, Arrays.asList(PO_SHORTCLOSE_APPROVAL,PO_SHORTCLOSE_SUBMIT));
        parentSCEvents.put(PO_SHORTCLOSED, Arrays.asList(PO_SHORTCLOSE_SUBMIT));

        parentSCEvents.put(PO_CANCEL_APPROVAL, Arrays.asList(PO_CANCEL_APPROVAL,PO_CANCEL_SUBMIT));
        parentSCEvents.put(PO_CANCEL_REJECTED, Arrays.asList(PO_CANCEL_APPROVAL,PO_CANCEL_SUBMIT));
        parentSCEvents.put(PO_CANCELLED, Arrays.asList(PO_CANCEL_SUBMIT));

        parentSCEvents.put(ADV_INV_APPROVED, Arrays.asList(ADV_INV_SUBMITTED));
        parentSCEvents.put(ADV_INV_REJECTED, Arrays.asList(ADV_INV_SUBMITTED));

        parentSCEvents.put(REG_INV_APPROVED, Arrays.asList(REG_INV_SUBMITTED));
        parentSCEvents.put(REG_INV_REJECTED, Arrays.asList(REG_INV_SUBMITTED));

        parentSCEvents.put(REG_INV_PAYMENT_COMPLETE, Arrays.asList(REG_INV_SUBMITTED));
        parentSCEvents.put(ADV_PAYMENT_COMPLETE, Arrays.asList(ADV_INV_APPROVED));
    }


    public static List<SupplyChainEvents> getPossibleEvents(SupplyChainEvents currentSupplyChainEvents) {
        return parentSCEvents.get(currentSupplyChainEvents);
    }
}
