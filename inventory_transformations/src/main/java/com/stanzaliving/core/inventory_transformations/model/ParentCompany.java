package com.stanzaliving.core.inventory_transformations.model;

import java.util.ArrayList;
import java.util.List;

public enum ParentCompany {
    DTWELVE("DTwelve","DTwelve Spaces Private Ltd"){
		public int getParentCompanyType() {
			return 0;
		}
	}
    , PINK("Pink","DTWELVE PINK SPACES PRIVATE LIMITED"){
		public int getParentCompanyType() {
			return 1;
		}
	};
    private String name;
    private String displayName;

    private ParentCompany(String name,String displayName) {
        this.name = name;
        this.displayName=displayName;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static List<String> getAllCompanies() {
        List<String> propertyCompany = new ArrayList<String>();
        propertyCompany.add(ParentCompany.DTWELVE.getName());
        propertyCompany.add(ParentCompany.PINK.getName());
        return propertyCompany;
    }

    public static ParentCompany getParentCompany(String name) {
        switch (name.toUpperCase()) {
            case "DTwelve":
                return ParentCompany.DTWELVE;
            case "Pink":
                return ParentCompany.PINK;
        }

        return ParentCompany.DTWELVE;
    }

    public abstract int getParentCompanyType();

}
