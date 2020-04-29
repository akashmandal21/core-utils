package com.stanzaliving.core.inventory_transformations.model;

import java.util.ArrayList;
import java.util.List;

public enum PropertyType {
	
	RESIDENTIAL("Residential"),COMMERCIAL("Commercial");
	
	private String name;
	private PropertyType(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public static List<String> getAllPropertyTypes() {
		List<String> propertyTypes = new ArrayList<String>();
		propertyTypes.add(PropertyType.RESIDENTIAL.getName());
		propertyTypes.add(PropertyType.COMMERCIAL.getName());
		return propertyTypes;
	}
	
	public static PropertyType getType(String name) {
		switch(name.toUpperCase()) {
		case "RESIDENTIAL" :
			return PropertyType.RESIDENTIAL;
		case "COMMERCIAL"  :
			return PropertyType.COMMERCIAL;
			
		}
		return PropertyType.RESIDENTIAL;
	}
	
	public static String getEnum(int orid) {
		if(orid == PropertyType.COMMERCIAL.ordinal())
			return "Commercial";
		else 
			return "Residential";
	}

}
