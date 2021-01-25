package com.stanzaliving.vendor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class VendorPaymentDetailsDto {

    private String uuid;

    private String bankName;

    private String bankAddress;

    private String bankBranchName;

    private String ifscCode;

    private String micrCode;

    private String accountType;

    private String accountHolderName;

    private String accountNumber;

    private String cancelChequeUrl;

    private String paymentTerms;

    private String createdBy;

    private String updatedBy;
}
