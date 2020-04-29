package com.stanzaliving.core.inventory_transformations.model;

public enum BloodGroup {
	A_POSITIVE("A+"),A_NEGATIVE("A-"),B_POSTIVE("B+"),B_NEGATIVE("B-"),AB_POSTIVE("AB+"),AB_NEGATIVE("AB-"),O_POSTIVE("O+"),O_NEGATIVE("O-");
	
    private String displayName;

    private BloodGroup(String displayName) {
        this.displayName=displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
