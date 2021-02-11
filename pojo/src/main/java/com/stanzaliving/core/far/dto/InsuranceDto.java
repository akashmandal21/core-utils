package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.InsuranceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceDto {
    private InsuranceType insuranceType;
    private String insuranceCompany;
    private String contactNumber;
    private String duration;
    private Integer insuredValue;
    private Integer insuranceAmount;
    private String insuranceDocumentPath; // where the uploaded doc. by user is stored
}