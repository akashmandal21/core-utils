package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetOwner;
import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import com.stanzaliving.core.po.generic.enums.GenericPOType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetDto {

    private InsuranceDto insuranceDto;
    private AmcDto amcDto;
    private AllocationDto allocationDto;

    private String assetId;
    private BigDecimal costPrice;
    private String poNumber;
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
    private BigDecimal totalCost;
    private String invoiceNumber;
    private Date invoiceDate;
    private String invoiceVendorDocPath;
    private String assetName;
    private String itemName;
    private String itemDescription;
    private String itemCode;
    private AssetOwner owner;
    private String landlordName;
    private Date verifiedOn;
    private Date lastAuditedOn;
    private String verifiedBy;
    private String lastAuditedBy;
    private Integer itemsInPackage;
    private String imageWithoutQrCodePath;
    private String imageWithQrCodePath;
    private AssetType assetType;
    private String qrCode; // is from QrCode Table
    private String itemUuid;
    //private String allocationUuid;
    private AssetStatus assetStatus;
    private String brandName;
    private String modelName;
    private String serialNumber;
    private String assetCondition;
    private Integer taskDueCount;
}
