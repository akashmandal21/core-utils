package com.stanzaliving.item_master.dtos;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.generic.dto.UIKeyValue;
import com.stanzaliving.core.leadership.dto.DateRange;
import com.stanzaliving.item_master.enums.SortDirection;
import com.stanzaliving.item_master.enums.SortSpecs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FilterDto {

    private Set<String> availableFields;
    //For internal requests
    private Set<String> itemCodes;
    private boolean excludingCodes;
    private Integer pageNum;
    private Integer limit;

    //Main Top Filters
    @Valid
    @NotNull
    private Department department;
    private String searchKey;
    private DateRange dateRangeCreatedAt;
    private String itemName;
    private String itemDescription;

    //Options
    private List<UIKeyValue> costHeadOptions;
    private List<UIKeyValue> itemTypeOptions;
    private List<UIKeyValue> gstOptions;
    private List<UIKeyValue> slBrandOptions;
    private List<UIKeyValue> slSubBrandOptions;
    private List<UIKeyValue> itemBrandOptions;
    private List<String> itemModelOptions;
    private List<UIKeyValue> itemCategoryOptions;
    private List<UIKeyValue> itemSubCategoryOptions;
    private List<UIKeyValue> consumptionTypeOptions;
    private List<UIKeyValue> usageTypeAreaOptions;
    private List<UIKeyValue> storageTypeOptions;
    private List<UIKeyValue> baseItemOptions;
    private List<UIKeyValue> inactiveOptions;
    private List<Double> itemsPerPackOptions;


    //Main Filters
    private List<UIKeyValue> itemCategory;
    private List<UIKeyValue> itemSubCategory;

    //More Filters
    //Primary Filters
    private String itemCode;
    private List<UIKeyValue> costHead;
    private List<UIKeyValue> itemType;//Mutli Select
    private List<UIKeyValue> gst;

    //Status
    private List<UIKeyValue> inactive;

    //Brand
    private List<UIKeyValue> itemBrand;
    private List<UIKeyValue> slBrand;
    private List<UIKeyValue> slSubBrand;
    private List<String> itemModel;//Mutli Select

    //Usage
    private List<UIKeyValue> consumptionType;
    private List<UIKeyValue> usageTypeArea;
    private List<UIKeyValue> storageType;
    private List<Double> itemsPerPack; //Mutli Select
    private List<UIKeyValue> baseItem;//Mutli Select



    //Sort
    private SortSpecs sortSpecs;
    private SortDirection sortDirection;

    private String itemUuid;


    public void addAdditionalFilterFields(Set<String> deptFields){
        deptFields.add("department");
        deptFields.add("dateRangeCreatedAt");
        deptFields.add("searchKey");
        deptFields.add("itemName");
        deptFields.add("itemUuid");
    }
}
