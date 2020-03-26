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

    private Double rate;

    private Float quantity;

}
