package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.dto.ItemDto;
import com.stanzaliving.core.far.enums.AssetStatus;
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
public class AssetDetailsResponseDto {

    private InsuranceResponseDto insuranceResponseDto;
    private AmcResponseDto amcResponseDto;
    private AllocationResponseDto allocationResponseDto;
    private ItemDto itemDto;

    private String assetId;
    private BigDecimal costPrice;
    private String poNumber;
    private String poType;
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
    private String owner;
    private String landlordName;
    private Date verifiedOn;
    private Date lastAuditedOn;
    private String verifiedBy;
    private String lastAuditedBy;
    private Integer itemsInPackage;
    private List<String> imageWithoutQrCodePath;
    private List<String> imageWithQrCodePath;
    private String assetType;
    private String qrCode; // is from QrCode Table
    private String itemUuid;
    //private String allocationUuid;
    private AssetStatus assetStatus;
    private String statusText;
    private String brandName;
    private String modelName;
    private String serialNumber;
    private String assetCondition;
    private Integer taskDueCount;
}
