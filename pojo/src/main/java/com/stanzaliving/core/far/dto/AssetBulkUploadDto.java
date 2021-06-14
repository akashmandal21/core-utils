package com.stanzaliving.core.far.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetBulkUploadDto {

    private String rowNumber;
    private String addedTime;
    private String ipAddress;
    private String city;
    private String micromarket;
    private String locationName;
    private String itemCategory;
    private String itemName;
    private String oldItemCode;
    private String newItemCode;
    private String imageUpload;
    private String addedEmailID;
    private String itemOwner;
    private String comment;
    private String itemCode;
    private String newCode;
    private String acquisitionDate;
    private String vendorName;
    private String vendorCode;
    private String assetType; // (SL/LL/Rental)
    private String poNumber;
    private String invoiceNumber;
    private String invoiceDate;
    private String unitRate;
    private String GST;
    private String otherFee;
    private String tax;
    private String acquisitionPrice;

    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
