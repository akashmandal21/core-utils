package com.stanzaliving.core.erp.supplychain.enums;

import com.stanzaliving.core.erp.supplychain.dto.SmsInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum SupplyChainEvents {
    PO_SUBMITTED("PO Submitted",false),
    PO_APPROVAL("PO Approval",true),
    PO_REJECTED("PO Rejected",true),
    PO_APPROVED("PO Approved",true),

    PO_SHORTCLOSE_SUBMIT("PO Shortclose Request Submitted",false,true),
    PO_SHORTCLOSE_APPROVAL("PO Shortclose Approval",true),
    PO_SHORTCLOSE_REJECTED("PO Shortclose Request Rejected",true),
    PO_SHORTCLOSED("PO Shortclosed",true),

    PO_CANCEL_SUBMIT("PO Cancel Request Submitted",false,true),
    PO_CANCEL_APPROVAL("PO Cancel Request Approval",true),
    PO_CANCEL_REJECTED("PO Cancel Request Rejected",true),
    PO_CANCELLED("PO Cancelled",true),
    PO_DURATION_EXPIRED("PO Duration expired",false),
    PO_DURATION_EXTENDED("PO Duration extended",false,true),


    GSRI_STARTED("GSRI Started",false),
    GSRI_REC("Goods Received",false),
    GSRI_INSTALL("Goods Installation",false),
    GSRI_COMPLETED("GSRI Completed",false),

    VENDOR_REJECTED("Vendor Rejeted", true),
    VENDOR_ACCEPTED("Vendor Accepted", true),


    ADV_INV_SUBMITTED("Advance Invoice Submitted",false),
    ADV_INV_APPROVAL("Advance Invoice Approval",false),
    ADV_INV_APPROVED("Advance Invoice Approved",true),
    ADV_INV_REJECTED("Advance Invoice Rejected",true),

    ADV_PAYMENT("Advance Payment",false),
    ADV_PAYMENT_COMPLETE("Advance Paid in Full",true),

    REG_INV_SUBMITTED("Regular Invoice Submitted",false),
    REG_INV_APPROVAL("Regular Invoice Approval",true),
    REG_INV_APPROVED("Regular Invoice Approved",true),
    REG_INV_REJECTED("Regular Invoice Rejected",true),

    REG_INV_PAYMENT("Regular Invoice Payment",false),
    REG_INV_PAYMENT_COMPLETE("Regular Invoice Paid in Full",true);



    private String eventText;
    private boolean slaEligible;
    private boolean actionReasonReqd;

    SupplyChainEvents(String eventText,boolean slaEligible){
        this.eventText=eventText;
        this.slaEligible=slaEligible;
        this.actionReasonReqd=false;
    }

    private static Map<SupplyChainEvents, List<SupplyChainEvents>> parentSCEvents = new HashMap<>();
    private static Map<SupplyChainEvents, SmsInfo> scDltTemplateMap = new HashMap<>();

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
        parentSCEvents.put(ADV_INV_APPROVAL, Arrays.asList(ADV_INV_SUBMITTED,ADV_INV_APPROVAL));
        parentSCEvents.put(ADV_INV_REJECTED, Arrays.asList(ADV_INV_SUBMITTED));

        parentSCEvents.put(REG_INV_APPROVED, Arrays.asList(REG_INV_SUBMITTED));
        parentSCEvents.put(REG_INV_APPROVAL, Arrays.asList(REG_INV_SUBMITTED,REG_INV_APPROVAL));
        parentSCEvents.put(REG_INV_REJECTED, Arrays.asList(REG_INV_SUBMITTED));

        parentSCEvents.put(REG_INV_PAYMENT_COMPLETE, Arrays.asList(REG_INV_SUBMITTED));
        parentSCEvents.put(ADV_PAYMENT_COMPLETE, Arrays.asList(ADV_INV_APPROVED));

        parentSCEvents.put(VENDOR_ACCEPTED, Arrays.asList(PO_APPROVAL));
        parentSCEvents.put(VENDOR_REJECTED, Arrays.asList(PO_APPROVAL));

        scDltTemplateMap.put(PO_APPROVAL, new SmsInfo("1707165813001183916","PARTNER", "A new Purchase Order has been raised by Stanza Living. Please login here to accept the purchase order: <url>"));
        scDltTemplateMap.put(VENDOR_ACCEPTED, new SmsInfo("1707165820435842841","SL", "Purchase order <poNumber> has been accepted by Stanza Living Partner <companyName>. Click here for the next steps: <url>"));
        scDltTemplateMap.put(VENDOR_REJECTED, new SmsInfo("1707165820437664749","SL", "Purchase Order <poNumber> has been rejected by Stanza Living partner <companyName>. Click here: <url> to know the details."));
        scDltTemplateMap.put(PO_CANCELLED, new SmsInfo("1707165820440339977","PARTNER", "Purchase order <poNumber> has been canceled by Stanza Living. For further information, please check here: <url>"));
        scDltTemplateMap.put(PO_SHORTCLOSE_SUBMIT, new SmsInfo("1707165820442446737","SL", "Stanza Living Partner<companyName> has requested to short close purchase order <poNumber>. To know more, click here: <url>"));
        scDltTemplateMap.put(GSRI_COMPLETED, new SmsInfo("1707165813021585699","PARTNER", "<grnPercentage>% of GRN for purchase order <poNumber> has been received at Stanza Living. Kindly login to see the details. Click here to know more: <url>"));
        scDltTemplateMap.put(REG_INV_SUBMITTED, new SmsInfo("1707165820444349249","SL", "Invoice <invoiceNumber> has been submitted by <companyName> for Stanza Living. Click here to know the details: <url>"));
        scDltTemplateMap.put(REG_INV_REJECTED, new SmsInfo("1707165813030073866","PARTNER", "Your invoice <invoiceNumber> has been rejected by Stanza Living. Kindly login to know the reason: <url>"));
        scDltTemplateMap.put(REG_INV_PAYMENT, new SmsInfo("1707165813033770944","SL", "Payment of Rs.<amountPaid> has been made against your invoice no. <invoiceNumber> by Stanza Living. To see the details, please click here: <url>"));
        scDltTemplateMap.put(GSRI_INSTALL, new SmsInfo("1707165813021585699","PARTNER", "<grnPercentage>% of GRN for purchase order <poNumber> has been received at Stanza Living. Kindly login to see the details. Click here to know more: <url>"));
        scDltTemplateMap.put(ADV_INV_SUBMITTED, new SmsInfo("1707165820444349249","SL", "Invoice <invoiceNumber> has been submitted by <companyName> for Stanza Living. Click here to know the details: <url>"));
        scDltTemplateMap.put(ADV_INV_REJECTED, new SmsInfo("1707165813030073866","PARTNER", "Your invoice <invoiceNumber> has been rejected by Stanza Living. Kindly login to know the reason: <url>"));
        scDltTemplateMap.put(ADV_PAYMENT, new SmsInfo("1707165813033770944","SL", "Payment of Rs.<amountPaid> has been made against your invoice no. <invoiceNumber> by Stanza Living. To see the details, please click here: <url>"));
        scDltTemplateMap.put(REG_INV_PAYMENT_COMPLETE, new SmsInfo("1707165813033770944","SL", "Payment of Rs.<amountPaid> has been made against your invoice no. <invoiceNumber> by Stanza Living. To see the details, please click here: <url>"));
        scDltTemplateMap.put(ADV_PAYMENT_COMPLETE, new SmsInfo("1707165813033770944","SL", "Payment of Rs.<amountPaid> has been made against your invoice no. <invoiceNumber> by Stanza Living. To see the details, please click here: <url>"));

    }


    public static List<SupplyChainEvents> getPossibleEvents(SupplyChainEvents currentSupplyChainEvents) {
        return parentSCEvents.get(currentSupplyChainEvents);
    }

    public static SmsInfo getDLTTemplateID(SupplyChainEvents supplyChainEvents) {
        if(scDltTemplateMap.containsKey(supplyChainEvents))
            return scDltTemplateMap.get(supplyChainEvents);
        return null;
    }

    private static List<SupplyChainEvents> invoiceSupplyChainEvents = Arrays.asList(SupplyChainEvents.ADV_INV_SUBMITTED, SupplyChainEvents.ADV_INV_APPROVAL,
            SupplyChainEvents.ADV_INV_APPROVED, SupplyChainEvents.ADV_INV_REJECTED, SupplyChainEvents.ADV_PAYMENT,
            SupplyChainEvents.ADV_PAYMENT_COMPLETE, SupplyChainEvents.REG_INV_SUBMITTED, SupplyChainEvents.REG_INV_APPROVAL,
            SupplyChainEvents.REG_INV_APPROVED, SupplyChainEvents.REG_INV_REJECTED, SupplyChainEvents.REG_INV_PAYMENT,
            SupplyChainEvents.REG_INV_PAYMENT_COMPLETE);

    public static List<SupplyChainEvents> getInvoiceSupplyChainEvents() {
        return invoiceSupplyChainEvents;
    }

    private static List<SupplyChainEvents> poSupplyChainEvents = Arrays.asList(SupplyChainEvents.PO_SUBMITTED, SupplyChainEvents.PO_APPROVAL,
            SupplyChainEvents.PO_REJECTED, SupplyChainEvents.PO_APPROVED, SupplyChainEvents.PO_SHORTCLOSE_SUBMIT,
            SupplyChainEvents.PO_SHORTCLOSE_APPROVAL, SupplyChainEvents.PO_SHORTCLOSE_REJECTED, SupplyChainEvents.PO_SHORTCLOSED,
            SupplyChainEvents.PO_CANCEL_SUBMIT, SupplyChainEvents.PO_CANCEL_APPROVAL, SupplyChainEvents.PO_CANCEL_REJECTED,
            SupplyChainEvents.PO_CANCELLED, SupplyChainEvents.PO_DURATION_EXPIRED);

    public static List<SupplyChainEvents> getPOSupplyChainEvents() {
        return poSupplyChainEvents;
    }

    private static List<SupplyChainEvents> gsriSupplyChainEvents = Arrays.asList(SupplyChainEvents.GSRI_STARTED, SupplyChainEvents.GSRI_REC,
            SupplyChainEvents.GSRI_INSTALL, SupplyChainEvents.GSRI_COMPLETED);

    public static List<SupplyChainEvents> getGSRISupplyChainEvents() {
        return gsriSupplyChainEvents;
    }

}
