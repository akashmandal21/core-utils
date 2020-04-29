package com.stanzaliving.core.inventory_transformations.model;

public enum UserCategory {
	B2B("C"), B2C("I"), MANAGED("M");

	private UserCategory(String shorthand) {
		this.shorthand = shorthand;
	}

	private String shorthand;

	public String getShorthand() {
		return shorthand;
	}

}
