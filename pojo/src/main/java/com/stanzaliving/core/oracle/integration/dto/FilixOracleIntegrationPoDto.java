package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FilixOracleIntegrationPoDto extends AbstractOracleDto {

    @JsonProperty("date")
    private String date;

    @JsonProperty("startDate")
    private String startDate;

    @JsonProperty("endDate")
    private String endDate;

    @JsonProperty("poType")
    private String poType;

    @JsonProperty("entityid")
    private String entityId;

    @JsonProperty("vendor")
    private String vendor;

    @JsonProperty("poNumber")
    private String poNumber;

    @JsonProperty("postatus")
    private String poStatus;

    @JsonProperty("billingState")
    private String billingState;

    @JsonProperty("billingCountry")
    private String billingCountry;

    @JsonProperty("isclosed")
    private String isClosed;

    @JsonProperty("pocname")
    private String pocName;

    @JsonProperty("poctitle")
    private String pocTitle;

    @JsonProperty("pocmail")
    private String pocEmail;

    @JsonProperty("class")
    private String clazz;

    @JsonProperty("department")
    private String department;

    @JsonProperty("actiondocurl")
    private String actionDocUrl;

    @JsonProperty("actionreason")
    private String actionReason;

    @JsonProperty("poexpensetype")
    private String poExpenseType;

    @JsonProperty("potriggertovendor")
    private String poTriggerToVendor;

    @JsonProperty("deliverylocation")
    private String deliveryLocation;

    @JsonProperty("exchangeRate")
    private String exchangeRate;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("porefundabledeposit")
    private String poRefundableDeposit;

    @JsonProperty("poitemsubtotal")
    private String poItemSubTotal;

    @JsonProperty("receivebydate")
    private String receiveByDate;

    @JsonProperty("scopeofwork")
    private String scopeOfWork;

    @JsonProperty("locationType")
    private String locationType;

    @JsonProperty("termsandconditions")
    private String termsAndConditions;

    @JsonProperty("advancetype")
    private String advanceType;

    @JsonProperty("advancevalue")
    private String advanceValue;

    @JsonProperty("advanceamount")
    private String advanceAmount;

    @JsonProperty("retentiontype")
    private String retentionType;

    @JsonProperty("retentionvalue")
    private String retentionValue;

    @JsonProperty("retentionamount")
    private String retentionAmount;

    @JsonProperty("itemList")
    private List<POItemDto> itemList;

    @JsonProperty("poTotal")
    private String poTotal;

    @JsonProperty("pogstTotal")
    private String pogstTotal;

    @JsonProperty("taxRegNo")
    private String taxRegNo;

}
