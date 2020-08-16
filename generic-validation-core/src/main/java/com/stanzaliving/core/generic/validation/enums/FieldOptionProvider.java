package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FieldOptionProvider {

    //Vendor Master Providers
    VendorTypeProvider,VendorDepartmentProvider,CountryProvide,CityProvider,StateProvider,CompanyTypeProvider,
    MSMEProvider,VendorItemNameProvider,AccountTypeProvider,FinancialYearProvider,

    //Item master Providers
    ItemCategoryProvider,CostHeadProvider,ItemSubCategoryProvider,ItemTypeProvider,UOMProvider,GstPCTProvider,
    ItemColorProvider,LBHUOMProvider,SLBrandProvider,SLSubBrandProvider,AreaOfUseProvider,ConsumptionTypeProvider,
    StorageTypeProvider,ItemBrandProvider;
}
