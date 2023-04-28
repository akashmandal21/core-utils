package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BannerPageType {

    CITY_PG_DEFAULT("City Pg Default"),
    CITY_APARTMENT_DEFAULT("Apartment Pg Default"),
    CITY_PG("City Pg"),
    CITY_APARTMENT("City Apartment"),
    MICROMARKET_PG("Micromarket Pg"),
    MICROMARKET_APARTMENT("Micromarket Apartment");

    private String bannerPageTypeName;
}
