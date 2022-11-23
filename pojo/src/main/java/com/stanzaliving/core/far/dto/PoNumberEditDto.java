package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PoNumberEditDto {
    private String assetUuid;
    private String poNumber;
    private String vendorName;
    private String itemUuid;
    private String itemName;
    private String itemDescription;
    private BigDecimal itemsInPackage;
}
