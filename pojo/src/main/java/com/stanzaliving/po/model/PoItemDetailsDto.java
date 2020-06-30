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

	private int sequence;
	
    private String poItemDetailsId;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String itemUom;

    private Double itemRate;

    private Float itemQuantity;

    private Double itemAmount;

    private String cgst;

    private String igst;

    private String sgst;

    private Double gstAmount;

    private Float propertyItemQuantity;

    private Float shortPoApprovedQuantity;

    private Float grnItemQuantity;

}
