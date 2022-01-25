package com.stanzaliving.core.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum ResidenceSortBy {
    PRICE_LOW_TO_HIGH("order by price", "Price - low to high"),
    PRICE_HIGH_TO_LOW("order by price desc", "Price - high to low"),
    FlOOR_ASCENDING("order by a.floor", "Floor - ascending"),
    FLOOR_DESCENDING("order by a.floor desc", "Floor - descending"),
    OCCUPANCY_ASCENDING("order by b.occupancy", "Occupancy - ascending"),
    OCCUPANCY_DESCENDING("order by b.occupancy desc", "Occupancy - descending"),
    APARTMENT_TYPE_ASCENDING("order by b.occupancy", "ApartmentType - ascending"),
    APARTMENT_TYPE_DESCENDING("order by b.occupancy desc", "ApartmentType - descending"),
    DEFAULT("order by a.floor, price", "default");

    private String name;

    private String label;

    public static List<Map<String, Object>> sortByList() {

        List<Map<String, Object>> list = new ArrayList<>();

        for (ResidenceSortBy residenceSortBy : ResidenceSortBy.values()) {
            if (!(ResidenceSortBy.DEFAULT.equals(residenceSortBy)) && !(ResidenceSortBy.APARTMENT_TYPE_ASCENDING.equals(residenceSortBy)) && !(ResidenceSortBy.APARTMENT_TYPE_DESCENDING.equals(residenceSortBy))) {
                Map<String, Object> residenceSortByMap = new HashMap<>();
                residenceSortByMap.put("label", residenceSortBy.label);
                residenceSortByMap.put("value", residenceSortBy);
                list.add(residenceSortByMap);
            }
        }

        return list;
    }

    public static List<Map<String, Object>> sortByListForManagedApartment() {

        List<Map<String, Object>> list = new ArrayList<>();
        for (ResidenceSortBy residenceSortBy : ResidenceSortBy.values()) {
            if (!(ResidenceSortBy.DEFAULT.equals(residenceSortBy)) && !(ResidenceSortBy.OCCUPANCY_ASCENDING.equals(residenceSortBy)) && !(ResidenceSortBy.OCCUPANCY_DESCENDING.equals(residenceSortBy))) {
                Map<String, Object> residenceSortByMap = new HashMap<>();
                residenceSortByMap.put("label", residenceSortBy.label);
                residenceSortByMap.put("value", residenceSortBy);
                list.add(residenceSortByMap);
            }
        }

        return list;
    }
}
