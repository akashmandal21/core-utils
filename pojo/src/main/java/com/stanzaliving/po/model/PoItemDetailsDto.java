package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

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

    private BigDecimal itemRate;

    private BigDecimal itemQuantity;
    private BigDecimal rentPeriod;
    private BigDecimal rentPerMonth;
    private String transferAvgRate;
    private BigDecimal transferQuantity;
    private String refundableType;
    private String refundableValue;

    private BigDecimal itemAmount;

    private String cgst;

    private String igst;

    private String sgst;

    private BigDecimal gstAmount;

    private BigDecimal propertyItemQuantity;

    private BigDecimal shortPoApprovedQuantity;

    private Integer grnItemQuantity;

    private String hsnCode;
    
    private String totalGst;

    private BigDecimal remainingItemQuantity;

    private String itemRateStr;

    private String itemAmountStr;

}
