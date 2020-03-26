package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoPaymentDetailsDto {

    private String poPaymentDetailsId;

    private String poDetailsId;

    private String paymentDate;

    private String paymentRefNum;

    private Double paidAmount;

    private String paymentProofUrl;

}
