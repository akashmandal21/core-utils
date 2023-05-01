package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BannerPageType {

    CITY_PG_DEFAULT("City PG Page Default Banners"),
    CITY_APARTMENT_DEFAULT("City Apartment Page Default Banners"),
    CITY_PG("City PG Page Custom Banners"),
    CITY_APARTMENT("City Apartment Page Custom Banners"),
    MICROMARKET_PG("Micromarket PG Page Custom Banners"),
    MICROMARKET_APARTMENT("Micromarket Apartment Page Custom Banners");

    private String bannerPageTypeName;
}
