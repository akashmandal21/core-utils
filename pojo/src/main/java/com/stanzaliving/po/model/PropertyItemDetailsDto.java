package com.stanzaliving.po.model;

import com.stanzaliving.po.enums.PoType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
public class PropertyItemDetailsDto {

    private String propertyId;

    private PoType poType;

    private String itemId;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String itemUom;

    private BigDecimal itemQuantity;

    private BigDecimal itemRate;

    private String cgst;

    private String igst;

    private String sgst;

}
