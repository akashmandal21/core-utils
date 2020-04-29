package com.stanzaliving.core.inventory_transformations.model;

public enum UserType {
	STUDENT("student"), WORKINGPROFESSIONAL("workingProfessional"), BROKER("broker");
	
	
	private UserType(String type)
	{
		this.type = type;
	}
	private String type;

	public String getType() {
		return type;
	}
	
	public static UserType getCategory(String name) {
		switch(name.toUpperCase()) {
		case "STUDENT" :
			return UserType.STUDENT;
		case "WORKINGPROFESSIONAL" :
			return UserType.WORKINGPROFESSIONAL;
		case "BROKER":
			return UserType.BROKER;
		}

		
		return UserType.STUDENT;
	}
	
}
