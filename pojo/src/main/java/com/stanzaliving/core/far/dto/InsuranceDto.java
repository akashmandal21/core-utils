package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.InsuranceType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.collections.CollectionUtils;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsuranceDto {
    @NotNull
    private String insuranceDocumentNumber;
    private InsuranceType insuranceType;
    private String insuranceCompany;
    private String contactNumber;
    private Date insuranceStartDate;
    private Date insuranceEndDate;
    private BigDecimal insuredValue;
    private BigDecimal insuranceAmount;
    private List<String> insuranceDocumentPathList; // where the uploaded doc. by user is stored

    public boolean isEmpty() {
        return Objects.isNull(this.insuranceDocumentNumber) && Objects.isNull(this.insuranceType) && Objects.isNull(this.insuranceCompany)
                && Objects.isNull(this.contactNumber) && Objects.isNull(this.insuranceStartDate) && Objects.isNull(this.insuranceEndDate)
                && Objects.isNull(this.insuredValue) && Objects.isNull(this.insuranceAmount) && CollectionUtils.isEmpty(this.insuranceDocumentPathList);
    }
}