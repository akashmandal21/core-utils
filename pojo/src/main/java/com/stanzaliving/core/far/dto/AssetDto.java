package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetDto {

    private String rowNumber;
    private InsuranceDto insuranceDto;
    private AmcDto amcDto;
    private AllocationDto allocationDto;
    private ItemDto itemDto;

    private String assetId;
    private String poNumber;
    private String sourceLocationName; // In case the asset is created with a TO (instead of a PO)
    private String poUuid;
    private GenericPOType poType;
    private String poUrl;
    private String toNumber;
    private String grnNumber;
    //private String vendorUuid;
    private String vendorName;
    private Date poDate;
    private BigDecimal unitRate;
    private BigDecimal gstPct;
    private BigDecimal otherFee;
    private BigDecimal otherFeeTax;
    private String invoiceNumber;
    private Date invoiceDate;

    private String invoiceVendorDocPath;
    private String assetName;
    private String assetDescription;
    private String itemCode;
    private String owner;
    private String landlordName;
    private Date verifiedOn;
    private Date lastAuditedOn;
    private String verifiedBy;
    private String lastAuditedBy;
    private Integer itemsInPackage;
    private List<String> assetImagesPath;
    private AssetType assetType;
    private String qrCode; // is from QrCode Table
    private String qrCodeId;
    private String itemUuid;
    //private String allocationUuid;
    private AssetStatus assetStatus;
    private String brandName;
    private String modelName;
    private String serialNumber;
    private String assetCondition;
    private Integer taskDueCount;
    private Date rentalStartDate;
    private Date rentalEndDate;

    private Date acquisitionDate;
    private BigDecimal acquisitionPrice;
    private Date bulkUploadAddedDate;

    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
