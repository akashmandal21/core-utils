package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
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
public class EditPurchaseDetailsDto {

    private String invoiceNumber;
    private Date invoiceDate;
    private BigDecimal itemsInPackage;
    private BigDecimal unitRate;
    private BigDecimal itemTax;
    private BigDecimal otherFee;
    private BigDecimal otherFeeTax;
    private BigDecimal acquisitionPrice;
}
