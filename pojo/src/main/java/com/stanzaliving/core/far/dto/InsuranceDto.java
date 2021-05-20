package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.InsuranceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuranceDto {
    private InsuranceType insuranceType;
    private String insuranceCompany;
    private String contactNumber;
    private Date insuranceStartDate;
    private Date insuranceEndDate;
    private BigDecimal insuredValue;
    private BigDecimal insuranceAmount;
    private List<String> insuranceDocumentPathList; // where the uploaded doc. by user is stored
}