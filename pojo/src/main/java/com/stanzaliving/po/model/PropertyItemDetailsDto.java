package com.stanzaliving.po.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PropertyItemDetailsDto {

    private String propertyId;

    private String poType;

    private String itemId;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String itemUom;

    private Float itemQuantity;

    private Double itemRate;

}
