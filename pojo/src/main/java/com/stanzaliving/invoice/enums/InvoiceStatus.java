package com.stanzaliving.invoice.enums;

import java.util.*;

import com.stanzaliving.core.generic.constants.GenericConstants;
import com.stanzaliving.core.po.generic.enums.GenericPOTOStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceStatus {


    IN_DRAFT("In Draft", "#E6E9EA","#7A7D7E", -1),
    L1_APPROVAL_DUE("L1 Approval Due", "#FFEAB6","#FFB701", 0),
    L2_APPROVAL_DUE("L2 Approval Due", "#FFEAB6","#FFB701", 1),
    L3_APPROVAL_DUE("L3 Approval Due", "#FFEAB6","#FFB701", 2),
    L4_APPROVAL_DUE("L4 Approval Due", "#FFEAB6","#FFB701", 3),
    L5_APPROVAL_DUE("L5 Approval Due", "#FFEAB6","#FFB701", 4),
    L1_REJECTED("L1 Rejected", "#FFE5E1","#FF5238", GenericConstants.rejectionStart-1),//SENT_BACK_BY_FINANCE
    L2_REJECTED("L2 Rejected", "#FFE5E1","#FF5238", GenericConstants.rejectionStart-2),
    L3_REJECTED("L3 Rejected", "#FFE5E1","#FF5238", GenericConstants.rejectionStart-3),
    L4_REJECTED("L4 Rejected", "#FFE5E1","#FF5238", GenericConstants.rejectionStart-4),
    L5_REJECTED("L5 Rejected", "#FFE5E1","#FF5238", GenericConstants.rejectionStart-5),
    PAYMENT_PENDING("Payment Pending", "#F4EEFF", "#5F11D7",5),//INVOICE_SUBMITTED // 3->5
    PARTIALLY_PAID("Partially Paid", "#EDF4FF","#5FC4F5", 6), //4->6
    FULLY_PAID("Fully Paid", "#EDFFF5","#60C3AD", 7),
    SUBMITTED_BY_VENDOR("Submitted By Vendor", "#FFEAB6","#FFB701", -1),
    SENT_BACK_TO_VENDOR("Sent Back To Vendor", "#FFE5E1","#FF5238", -1);


    private String statusText;

    private String bgColor;

    private String statusColor;
    
    private Integer order;
      
    private static Map<Integer, InvoiceStatus> invoiceApprovalLevelMap ;

    @Getter
    private static Set<InvoiceStatus> approvalCycle ;

    @Getter
    private static Set<InvoiceStatus> approvalRejects ;

    @Getter
    private static Set<InvoiceStatus> paymentCycle ;

    @Getter
    private static Set<InvoiceStatus> paymentStatuses ;

    @Getter
    private static final Map<Integer, InvoiceStatus> firstApprovalOrderStatusMap = new HashMap<>();



    static {
        Map<Integer,InvoiceStatus> temp = new HashMap<>();
    	for(InvoiceStatus invoiceStatus : InvoiceStatus.values()) {
    		temp.put(invoiceStatus.getOrder(), invoiceStatus);
    	}

    	invoiceApprovalLevelMap = Collections.unmodifiableMap(temp);
        approvalCycle = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE,L4_APPROVAL_DUE,L5_APPROVAL_DUE,SUBMITTED_BY_VENDOR)));
        approvalRejects = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(L1_REJECTED, L2_REJECTED, L3_REJECTED,L4_REJECTED,L5_REJECTED,SENT_BACK_TO_VENDOR)));
        paymentCycle = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(PAYMENT_PENDING, PARTIALLY_PAID)));
        paymentStatuses = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(PAYMENT_PENDING, PARTIALLY_PAID,FULLY_PAID)));

        for (InvoiceStatus status : approvalCycle) {
            firstApprovalOrderStatusMap.put(status.getOrder(), status);
        }
    }


    public static InvoiceStatus getInvoiceStatus(int approvalLevel) {
    	return invoiceApprovalLevelMap.get(approvalLevel);
    }

    public static int getLevel(InvoiceStatus invoiceStatus) {
        return invoiceStatus.getOrder() >= 0 ? (invoiceStatus.getOrder()) + 1 : Math.abs(invoiceStatus.getOrder() - GenericConstants.rejectionStart);
    }

    public static InvoiceStatus getStatusByOrder(int statusOrder){

        return firstApprovalOrderStatusMap.get(statusOrder);
    }
}


