package com.stanzaliving.invoice.enums;

import java.util.*;

import com.stanzaliving.core.generic.constants.GenericConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceStatus {


    IN_DRAFT("In Draft", "#7a7d7e4d","#7A7D7E", -1),
    L1_APPROVAL_DUE("L1 Approval Due", "#FFEAB6","#FFB701", 0),
    L2_APPROVAL_DUE("L2 Approval Due", "#FFEAB6","#FFB701", 1),
    L3_APPROVAL_DUE("L3 Approval Due", "#FFEAB6","#FFB701", 2),
    L1_REJECTED("L1 Rejected", "#FBECDB","#F55F71", GenericConstants.rejectionStart-1),
    L2_REJECTED("L2 Rejected", "#FBECDB","#F55F71", GenericConstants.rejectionStart-2),
    L3_REJECTED("L3 Rejected", "#FBECDB","#F55F71", GenericConstants.rejectionStart-3),
    PAYMENT_PENDING("Payment Pending", "#EDF4FF", "#5FC4F5",3),
    PARTIALLY_PAID("Partially Paid", "#F4EEFF","#7A7D7E", 4),
    FULLY_PAID("Fully Paid", "#EDFFF5","#60C3AD", 5);


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



    static {
        Map<Integer,InvoiceStatus> temp = new HashMap<>();
    	for(InvoiceStatus invoiceStatus : InvoiceStatus.values()) {
    		temp.put(invoiceStatus.getOrder(), invoiceStatus);
    	}

    	invoiceApprovalLevelMap = Collections.unmodifiableMap(temp);
        approvalCycle = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(L1_APPROVAL_DUE, L2_APPROVAL_DUE, L3_APPROVAL_DUE)));
        approvalRejects = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(L1_REJECTED, L2_REJECTED, L3_REJECTED)));
        paymentCycle = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(PAYMENT_PENDING, PARTIALLY_PAID)));
    }


    public static InvoiceStatus getInvoiceStatus(int approvalLevel) {
    	return invoiceApprovalLevelMap.get(approvalLevel);
    }
    
}


