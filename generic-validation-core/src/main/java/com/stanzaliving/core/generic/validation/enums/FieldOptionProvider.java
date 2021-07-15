package com.stanzaliving.core.generic.validation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum FieldOptionProvider {

    //Vendor Master Providers
    VendorTypeProvider,VendorDepartmentProvider,CountryProvider,CityProvider,StateProvider,CompanyTypeProvider,
    AccountTypeProvider,FinancialYearProvider,YesNoProvider,CurrencyProvider,ProjectYearProvider,HouseNameProvider,
    KitchenStoreProvider,SupplyCityProvider,SupportingDocTypeProvider,

    //Item master Providers
    ItemCategoryProvider,CostHeadProvider,ItemSubCategoryProvider,ItemTypeProvider,UOMProvider,GstPCTProvider,
    ItemColorProvider,LBHUOMProvider,SLBrandProvider,SLSubBrandProvider, UsageTypeProvider,ConsumptionTypeProvider,
    StorageTypeProvider,ItemBrandProvider,BaseItemProvider,ItemModelProvider,PackOfOptionProvider,InactiveOptionProvider,
    AcquisitionTypeProvider,RecipeTagProvider,


    poTypeProvider,poExpenseTypeProvider,deliveryLocationTypeProvider,deliveryLocationProvider,deliveryAddressProvider,
    vendorPoTriggerProvider,vendorProvider,vendorPocProvider,advanceTypeProvider,retentionTypeProvider,specialTnCProvider,otherFeeTypeProvider,

    toTypeProvider,foodCostTypeProvider,

    voucherTypeProvider,categoryProvider,verticalProvider,groupProvider,subGroupProvider,expenseTypeProvider,taxCodeProvider,tdsSectionProvider,tdsRateProvider,

    FarCategoryProvider,

    // Item Rate Master Providers


}
