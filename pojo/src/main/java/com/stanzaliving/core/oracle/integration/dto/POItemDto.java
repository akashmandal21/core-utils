package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class POItemDto {

    @JsonProperty("item")
    private String item;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("rate")
    private String rate;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("actualrate")
    private String actualRate;

    @JsonProperty("indiataxnature")
    private String indiaTaxNature;

    @JsonProperty("hsnCod")
    private String hsnCode;

    /*@JsonProperty("lineid")
    private String lineId;*/

    @JsonProperty("isclosed")
    private String isClosed;

    @JsonProperty("taxlocationtype")
    private String taxLocationType;

    @JsonProperty("taxrate")
    private String taxrRte;

    @JsonProperty("taxamount")
    private String taxAmount;

    @JsonProperty("refundablesdtype")
    private String refundableSDType;

    @JsonProperty("refundablesdvalue")
    private String refundableSDValue;

    @JsonProperty("rentperiodinmonths")
    private String rentPeriodInMonths;

    @JsonProperty("porefundabledeposit")
    private String poRefundableDeposit;

    @JsonProperty("poitemsubtotal")
    private String poItemSubTotal;

    @JsonProperty("feetype")
    private String feeType;

}
