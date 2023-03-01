package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum DynamicUrlsFilterCategory {

    PG_PAGE_IDENTIFIERS("PG templates and aliases"),
    PG_CO_LIVING_PAGE_IDENTIFIERS("Coliving templates and aliases"),
    APARTMENT_PAGE_IDENTIFIERS("Apartment templates and aliases"),
    CITY_FILTER("City"),
    MM_FILTER("Micromarket"),
    GENDER_FILTER("Gender"),
    OCCUPANCY_FILTER("Occupancy"),
    AMENITIES_FILTER("Amenities"),
    SERVICES_FILTER("Services"),
    BUDGET_FILTER("Budget"),
    BHK_FILTER("BKH Type"),
    ENTIRE_FLAT_FILTER("Entire Flat");

    private String filterCategoryName;
}
