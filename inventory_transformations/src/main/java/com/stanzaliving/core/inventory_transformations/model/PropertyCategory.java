package com.stanzaliving.core.inventory_transformations.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum PropertyCategory {
    SUITES("Suites"), STELLO("Stello");

    private static int bufferInMonthsForSuites = 1;
    private static int bufferInMonthsForStello = 5;

    private String name;
    private static Map<Integer, PropertyCategory> idToPropertyCategoryMap = new HashMap<>();

    static {
        idToPropertyCategoryMap.put(0, SUITES);
        idToPropertyCategoryMap.put(1, STELLO);
    }

    private PropertyCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<String> getAllCategories() {
        List<String> propertyCategory = new ArrayList<String>();
        propertyCategory.add(PropertyCategory.SUITES.getName());
        propertyCategory.add(PropertyCategory.STELLO.getName());
        return propertyCategory;
    }

    public static PropertyCategory getCategory(Integer id) {
        return idToPropertyCategoryMap.get(id);
    }

    public static PropertyCategory getCategory(String name) {
        switch (name.toUpperCase()) {
            case "SUITES":
                return PropertyCategory.SUITES;
            case "STELLO":
                return PropertyCategory.STELLO;
        }

        return PropertyCategory.STELLO;
    }

    public static boolean isSuitesProperty(Residence residence) {
        return residence.getPropertyCategory() == SUITES;
    }

    public static int getBufferInMonths(PropertyCategory propertyCategory) {

        if (propertyCategory.equals(PropertyCategory.SUITES))
            return bufferInMonthsForSuites;
        else
            return bufferInMonthsForStello;

    }

}
