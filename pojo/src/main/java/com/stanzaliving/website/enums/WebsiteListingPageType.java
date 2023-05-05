package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

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

    public static final List<WebsiteListingPageType> defaultListingPageTypes = Arrays.asList(CITY_PG_PAGE_DEFAULT, CITY_APARTMENT_PAGE_DEFAULT);
    public static final List<WebsiteListingPageType> customListingPageTypes = Arrays.asList(CITY_PG_PAGE, CITY_APARTMENT_PAGE, MICROMARKET_PG_PAGE, MICROMARKET_APARTMENT_PAGE);

    public static final List<WebsiteListingPageType> cityListingPageTypes = Arrays.asList(CITY_PG_PAGE, CITY_APARTMENT_PAGE);

    public static final List<WebsiteListingPageType> mmListingPageTypes = Arrays.asList(MICROMARKET_PG_PAGE, MICROMARKET_APARTMENT_PAGE);


    public static List<WebsiteListingPageType> getHierarchicalChildrenFromDefaultPageType(WebsiteListingPageType defaultListingPageType) {

        if (WebsiteListingPageType.CITY_PG_PAGE_DEFAULT.equals(defaultListingPageType)) {
            return Arrays.asList(WebsiteListingPageType.CITY_PG_PAGE, WebsiteListingPageType.MICROMARKET_PG_PAGE);
        } else if (WebsiteListingPageType.CITY_APARTMENT_PAGE_DEFAULT.equals(defaultListingPageType)) {
            return Arrays.asList(WebsiteListingPageType.CITY_APARTMENT_PAGE, WebsiteListingPageType.MICROMARKET_APARTMENT_PAGE);
        }
        return Arrays.asList(defaultListingPageType);
    }

    public static WebsiteListingPageType getHierarchicalChildrenFromParentPageType(WebsiteListingPageType parentPageType) {

        if (WebsiteListingPageType.CITY_PG_PAGE.equals(parentPageType)) {
            return WebsiteListingPageType.MICROMARKET_PG_PAGE;
        } else if (WebsiteListingPageType.CITY_APARTMENT_PAGE.equals(parentPageType)) {
            return WebsiteListingPageType.MICROMARKET_APARTMENT_PAGE;
        } else {
            return parentPageType;
        }
    }
}
