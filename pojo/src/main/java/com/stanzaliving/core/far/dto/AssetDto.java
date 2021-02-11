package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.dto.AllocationDto;
import com.stanzaliving.core.far.dto.AmcDto;
import com.stanzaliving.core.far.dto.InsuranceDto;
import com.stanzaliving.core.far.enums.AssetOwner;
import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetDto {

    private InsuranceDto insuranceDto;
    private AmcDto amcDto;
    private AllocationDto allocationDto;

    private String assetCode;
    private Integer costPrice;
    private Long poNumber;
    private String poType;
    private String poUrl;
    private Long toNumber;
    private Long grnNumber;
    //private String vendorUuid;
    private String vendorName;
    private Date poDate;
    private Integer unitRate;
    private Integer gstPct;
    private Integer otherFee;
    private Integer otherFeeTax;
    private Integer totalCost;
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
    private Long itemsInPackage;
    private String employeeId;
    private String employeeDepartment;
    private String employeeName;
    private String employeeEmail;
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