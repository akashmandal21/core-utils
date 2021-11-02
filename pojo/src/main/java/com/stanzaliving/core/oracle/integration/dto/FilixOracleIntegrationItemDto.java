package com.stanzaliving.core.oracle.integration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FilixOracleIntegrationItemDto extends AbstractOracleDto {

    @NotNull
    @JsonProperty("stanzaId")
    private String itemUuid;

    @NotNull
    @JsonProperty("itemName")
    private String itemName;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("costHead")
    private String costHead;

    @JsonProperty("GSTPercentage")
    private String gstPercentage;

    @JsonProperty("PackOfAndBaseItemName")
    private String packOfAndBaseItemName;

    @JsonProperty("specificationDocument")
    private String specificationDocument;

    @JsonProperty("itemLengthAndUnit")
    private String itemLengthAndUnit;

    @JsonProperty("itemBreathAndUnit")
    private String itemBreathAndUnit;

    @JsonProperty("itemHeightAndUnit")
    private String itemHeightAndUnit;

    @JsonProperty("itemColor")
    private String itemColor;

    @JsonProperty("itemImage")
    private String itemImage;

    @JsonProperty("ConsumptionType")
    private String consumptionType;

    @JsonProperty("ItemBrand")
    private String itemBrand;

    @JsonProperty("ItemModel")
    private String itemModel;

    @JsonProperty("SLBrand")
    private String slBrand;

    @JsonProperty("SL_SubBrand")
    private String slSubBrand;

    @JsonProperty("UsageType_Area")
    private String usageTypeArea;

    @JsonProperty("StorageType")
    private String storageType;

    @JsonProperty("priceVarianceAccount")
    private String priceVarianceAccount;

    @JsonProperty("quantityVarianceAccount")
    private String quantityVarianceAccount;

    @JsonProperty("exchangeRateVarianceAccount")
    private String exchangeRateVarianceAccount;

    @JsonProperty("deferredExpenseAccount")
    private String deferredExpenseAccount;

    @JsonProperty("expenseAccount")
    private String expenseAccount;

    @NotNull
    @JsonProperty("incomeAccount")
    private String incomeAccount;

    @JsonProperty("cogsAccount")
    private String cogsAccount;

    @JsonProperty("assetAccount")
    private String assetAccount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("subCategory")
    private String subCategory;

    @JsonProperty("farCategory")
    private String farCategory;

    @JsonProperty("acquisitionType")
    private String acquisitionType;

    @JsonProperty("isinactive")
    private String isInactive;

    @JsonProperty("description")
    private String description;

    @JsonProperty("fulfillable")
    private String fulfillable;

    @JsonProperty("generateaccruals")
    private String generateaccruals;

    @JsonProperty("revenuerecognitionrule")
    private String revenuerecognitionrule;

    @JsonProperty("revrecforecastrule")
    private String revrecforecastrule;

    @JsonProperty("department")
    private String department;

    @JsonProperty("createrevenueplanson")
    private String createrevenueplanson;

    @JsonProperty("glcodes")
    private String glCodes;

    @JsonProperty("directrevenueposting")
    private String directRevenuePosting;

    @JsonProperty("incomeAccount1")
    private String incomeAccount1;
    
    @JsonProperty("itemType")
    private String itemType;

}
