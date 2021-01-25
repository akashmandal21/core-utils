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
public class VendorFinancialDetailsDto {

    private String uuid;

    private String financialYear;

    private String annualTurnoverInRs;

    private String turnoverSupportingDocsUrl;

    private String createdBy;

    private String updatedBy;
}
