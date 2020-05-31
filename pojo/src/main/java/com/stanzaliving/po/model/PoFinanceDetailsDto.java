package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PoFinanceDetailsDto {

    private String poFinanceDetailsId;

    private Boolean isAdvanceApplicable;

    private String advancePercent;

    private Boolean isRetentionApplicable;

    private String retentionPercent;

    private Double subTotal;

    @NotBlank(message = "Fee can't be blank")
    private String serviceFee;

    private Double totalAmount;

    private Double advanceInvoiceAmount;

    private Double regularInvoiceAmount;

}
