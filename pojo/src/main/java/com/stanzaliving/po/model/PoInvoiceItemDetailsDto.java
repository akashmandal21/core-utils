package com.stanzaliving.po.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PoInvoiceItemDetailsDto {

    private String poInvoiceItemDetailsId;

    private String poInvoiceDetailsId;

    private String itemCode;

    private String itemName;

    private String itemDescription;

    private String itemUom;

    private Double itemRate;

    private Float itemQuantity;

    private Double itemAmount;

    private Double poItemRate;

    private Float poItemQuantity;

    private String cgst;

    private String igst;

    private String sgst;

    private Double gstAmount;

}
