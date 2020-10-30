package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FieldOptionProvider {

    //Vendor Master Providers
    VendorTypeProvider,VendorDepartmentProvider,CountryProvider,CityProvider,StateProvider,CompanyTypeProvider,
    AccountTypeProvider,FinancialYearProvider,YesNoProvider,CurrencyProvider,ProjectYearProvider,HouseNameProvider,
    KitchenStoreProvider,SupplyCityProvider,

    //Item master Providers
    ItemCategoryProvider,CostHeadProvider,ItemSubCategoryProvider,ItemTypeProvider,UOMProvider,GstPCTProvider,
    ItemColorProvider,LBHUOMProvider,SLBrandProvider,SLSubBrandProvider, UsageTypeProvider,ConsumptionTypeProvider,
    StorageTypeProvider,ItemBrandProvider,BaseItemProvider,ItemModelProvider,PackOfOptionProvider,InactiveOptionProvider,
    AcquisitionTypeProvider,


    poTypeProvider,poExpenseTypeProvider,deliveryLocationTypeProvider,deliveryLocationProvider,deliveryAddressProvider,
    vendorPoTriggerProvider,vendorProvider,vendorPocProvider,advanceTypeProvider,retentionTypeProvider,specialTnCProvider,otherFeeTypeProvider;

}
