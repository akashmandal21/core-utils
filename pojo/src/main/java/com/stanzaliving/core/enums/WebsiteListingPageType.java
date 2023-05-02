package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WebsiteListingPageType {

    CITY_PG_PAGE_DEFAULT("City PG Page Default Configurations"),
    CITY_APARTMENT_PAGE_DEFAULT("City Apartment Page Default Configurations"),
    CITY_PG_PAGE("City PG Page Configurations"),
    CITY_APARTMENT_PAGE("City Apartment Page Configurations"),
    MICROMARKET_PG_PAGE("Micromarket PG Page Configurations"),
    MICROMARKET_APARTMENT_PAGE("Micromarket Apartment Page Configurations");

    private String websiteListingPageTypeName;
}
