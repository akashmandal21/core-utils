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
public class PoItemDetailsDto {

    private String poItemDetailsId;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String itemUom;

    private Double itemRate;

    private Float itemQuantity;

    private Double itemAmount;

}
