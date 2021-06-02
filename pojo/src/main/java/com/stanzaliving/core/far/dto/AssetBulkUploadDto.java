package com.stanzaliving.core.far.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssetBulkUploadDto {

    @CsvBindByName(column = "Row Number")
    @CsvBindByPosition(position = 0)
    private String rowNumber;

    @CsvBindByName(column = "Added Time")
    @CsvBindByPosition(position = 1)
    private String addedTime;

    @CsvBindByName(column = "IP Address")
    @CsvBindByPosition(position = 2)
    private String ipAddress;

    @CsvBindByName(column = "City")
    @CsvBindByPosition(position = 3)
    private String city;

    @CsvBindByName(column = "Micromarket")
    @CsvBindByPosition(position = 4)
    private String micromarket;

    @CsvBindByName(column = "Location Name")
    @CsvBindByPosition(position = 5)
    private String locationName;

    @CsvBindByName(column = "Item category")
    @CsvBindByPosition(position = 6)
    private String itemCategory;

    @CsvBindByName(column = "Item name")
    @CsvBindByPosition(position = 7)
    private String itemName;

    @CsvBindByName(column = "Old item code")
    @CsvBindByPosition(position = 8)
    private String oldItemCode;

    @CsvBindByName(column = "New item code")
    @CsvBindByPosition(position = 9)
    private String newItemCode;

    @CsvBindByName(column = "Image Upload")
    @CsvBindByPosition(position = 10)
    private String imageUpload;

    @CsvBindByName(column = "Added Email ID")
    @CsvBindByPosition(position = 11)
    private String addedEmailID;

    @CsvBindByName(column = "Item owner")
    @CsvBindByPosition(position = 12)
    private String itemOwner;

    @CsvBindByName(column = "Comment")
    @CsvBindByPosition(position = 13)
    private String comment;

    @CsvBindByName(column = "Item code")
    @CsvBindByPosition(position = 14)
    private String newCode;

    @CsvBindByName(column = "New Code")
    @CsvBindByPosition(position = 15)
    private String itemCode;

    @CsvBindByName(column = "Date of acquisition")
    @CsvBindByPosition(position = 16)
    private String acquisitionDate;

    @CsvBindByName(column = "Vendor Name")
    @CsvBindByPosition(position = 17)
    private String vendorName;

    @CsvBindByName(column = "Vendor Code")
    @CsvBindByPosition(position = 18)
    private String vendorCode;

    @CsvBindByName(column = "Asset Owner (SL/LL/Rental)")
    @CsvBindByPosition(position = 19)
    private String assetType; // (SL/LL/Rental)

    @CsvBindByName(column = "PO Number")
    @CsvBindByPosition(position = 20)
    private String poNumber;

    @CsvBindByName(column = "Invoice Number")
    @CsvBindByPosition(position = 21)
    private String invoiceNumber;

    @CsvBindByName(column = "Invoice Date")
    @CsvBindByPosition(position = 22)
    private String invoiceDate;

    @CsvBindByName(column = "Unit Rate")
    @CsvBindByPosition(position = 23)
    private String unitRate;

    @CsvBindByName(column = "GST")
    @CsvBindByPosition(position = 24)
    private String GST;

    @CsvBindByName(column = "Other Fee")
    @CsvBindByPosition(position = 25)
    private String otherFee;

    @CsvBindByName(column = "Other Fee Tax")
    @CsvBindByPosition(position = 26)
    private String tax;

    @CsvBindByName(column = "Acquisition Price")
    @CsvBindByPosition(position = 27)
    private String acquisitionPrice;

    // These 2 will only be part of Response
    @CsvBindByName(column = "Response Status")
    @CsvBindByPosition(position = 28)
    private String responseStatus;

    @CsvBindByName(column = "Response Message")
    @CsvBindByPosition(position = 29)
    private String responseMessage;

    public String toString() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
