package com.stanzaliving.invoice.enums;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.core.generic.constants.GenericConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
public enum InvoiceStatus {


    IN_DRAFT("In Draft", null, -1),
    L1_APPROVAL_DUE("L1 Approval Due", "#FFB701", 0),
    L2_APPROVAL_DUE("L2 Approval Due", "#FFB701", 1),
    L3_APPROVAL_DUE("L3 Approval Due", "#FFB701", 2),

    L1_REJECTED("L1 Rejected", "#F55F71", GenericConstants.rejectionStart-1),
    L2_REJECTED("L2 Rejected", "#F55F71", GenericConstants.rejectionStart-2),
    L3_REJECTED("L3 Rejected", "#F55F71", GenericConstants.rejectionStart-3),
    PAYMENT_PENDING("Payment Pending", null, 3),
    PARTIALLY_PAID("Partially Paid", null, 4),
    FULLY_PAID("Fully Paid", null, 5);


    private String statusText;

    private String statusColor;
    
    private Integer order;
      
    private static Map<Integer, InvoiceStatus> invoiceApprovalLevelMap = new HashMap<>();

    public static Set<InvoiceStatus> approvalCycle = new HashSet<>(5);

    public static Set<InvoiceStatus> approvalRejects = new HashSet<>(5);

    public static Set<InvoiceStatus> paymentCycle = new HashSet<>(5);

    
    
    static {
    	for(InvoiceStatus invoiceStatus : InvoiceStatus.values()) {
    		invoiceApprovalLevelMap.put(invoiceStatus.getOrder(), invoiceStatus);
    	}

        approvalCycle.addAll(Arrays.asList(L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE));
        approvalRejects.addAll(Arrays.asList(L1_REJECTED, L2_REJECTED, L3_REJECTED));
        paymentCycle.addAll(Arrays.asList(PAYMENT_PENDING, PARTIALLY_PAID));
    }
    
    
    public static InvoiceStatus getInvoiceStatus(int approvalLevel) {
    	return invoiceApprovalLevelMap.get(approvalLevel);
    }

    
    
}


