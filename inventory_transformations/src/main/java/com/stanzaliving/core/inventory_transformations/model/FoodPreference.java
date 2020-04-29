package com.stanzaliving.core.inventory_transformations.model;
public enum FoodPreference {
		VEG, NON_VEG;
	
	public static FoodPreference getFoodPreference(String name) {
		switch(name.toUpperCase()) {
		case "VEG" :
			return FoodPreference.VEG;
		case "NON VEG" :
			return FoodPreference.NON_VEG;
		}
		
		return FoodPreference.VEG;
	}
	}