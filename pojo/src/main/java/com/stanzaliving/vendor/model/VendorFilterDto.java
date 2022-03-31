package com.stanzaliving.vendor.model;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.leadership.dto.DateRange;
import lombok.*;

import java.util.List;
import java.util.Set;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class VendorFilterDto {

    private Set<String> availableFields;

    //When we are filling this, we need to make sure we include vendor type based on login.
    private List<UIKeyValue> vendorTypeOptions;
    //When we are filling this, we need to make sure we include vendor status based on login role.
    private List<UIKeyValue> vendorStatusOptions; //Add
    //When we are filling this, we need to make sure we include distinct names.
    private List<String> companyNameOptions;
    //When we are filling this, we need to make sure we include distinct brand names.
    private List<String> brandNameOptions;
    //When we are filling this, we need to make sure we include distinct poc names.
    private List<String> vendorPocNameOptions;//Add
    //When we are filling this, we need to make sure we include distinct item names.
    private List<String> itemNameOptions;

    private List<UIKeyValue> vendorStateOptions;

    private List<UIKeyValue> companyTypeOptions;
    private List<UIKeyValue> gstExemptOptions;
    private List<UIKeyValue> gstStateOptions;
    private List<UIKeyValue> msmeRegisteredOptions;
    private List<UIKeyValue> fssaiRegisteredOptions;
    private List<UIKeyValue> costHeadOptions;
    private List<UIKeyValue> categoryOptions;
    private List<UIKeyValue> subCategoryOptions;
    private List<UIKeyValue> supplyLocationsOptions;

    private List<UIKeyValue> addedByOptions;//Add
    private List<UIKeyValue> lastUpdateByOptions;//Add
    private List<UIKeyValue> approvedByOptions;//Add


    private String vendorUuid;
    private Department department;
    private String roleName;
    private List<UIKeyValue> vendorType;
    private List<UIKeyValue> vendorStatus;
    private List<String> companyName;
    private List<String> brandName;
    private List<String> vendorPocName;
    private List<UIKeyValue> companyType;
    private List<UIKeyValue> gstState;
    private List<UIKeyValue> gstExempt;
    private List<UIKeyValue> msmeRegistered;
    private List<UIKeyValue> fssaiRegistered;
    private List<UIKeyValue> costHead;
    private List<UIKeyValue> category;
    private List<UIKeyValue> subCategory;
    private List<UIKeyValue> supplyLocations;
    private List<UIKeyValue> addedBy;
    private List<UIKeyValue> lastUpdateBy;
    private List<UIKeyValue> approvedBy;
    private List<UIKeyValue> vendorState;
    private DateRange dateRangeCreatedAt;
    private DateRange dateRangeLastUpdatedAt;
    private List<String> itemName;

}
