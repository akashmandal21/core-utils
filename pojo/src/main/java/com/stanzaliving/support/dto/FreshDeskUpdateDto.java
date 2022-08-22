package com.stanzaliving.support.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class FreshDeskUpdateDto {
    private String complaintStatus;

    private String agentEmail;

    private String agentName;

    private String complaintType; // Complaint Type

    private String complaintCategory; // Complaint Category

    private String complaintSubcategory; // Complaint Sub Category

    private String description;

    private String cityName;

    private String userName;

    private String source;

    private String roomNo;

    private String micromarketName;

    private String userId;

    private String studentId;

    private Long cmsId;

    private String subject;

    private String userEmail;

    private String requesterEmail;

    private String userMobileNo;

    private String residenceName;

    private String complaintId;

    private String closingComment;

    private String amountPaid;

    private String modeOfPayment;

    private String dateOfPayment;

    private String referenceNumber;

    private String idMapped;

    private String actualContractStartDate;

    private String changeIn;

    private String changeInInstallment;

    private String value;

    private String agreementTenurePromisedByStanzaLiving;

    private String discountAmount;

    private String creditNoteAmount;

    private String issueDate;

    private String requestedRent;

    private String rentChangeReason;

    private String comments;

    private String vasDescription;

    private String changeEffectiveFromDate;

    private String requestType;

    private String priority;

    private String ventaContractStartDate;

    private String currentPaymentFrequencyAsPerVenta;

    private String agreementTenureAsPerVenta;

    private String rentAsPerVenta;

    private String differenceAmount;

    private String paidAsPerVenta;

    private String requesterName;

    private String requesterMobileNo;

    private String userType;

    private String reopenSource;
}
