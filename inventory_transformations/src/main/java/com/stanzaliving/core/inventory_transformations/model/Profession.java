package com.stanzaliving.core.inventory_transformations.model;

public enum Profession {
	COLLEGE_STUDENT, OTHER_STUDENT, WORKING_PROFESSIONAL;
	
	public static Profession getProfession(String name) {
		switch(name.toUpperCase()) {
		case "COLLEGE STUDENT" :
			return Profession.COLLEGE_STUDENT;
		case "OTHER STUDENT" :
			return Profession.OTHER_STUDENT;
		case "WORKING PROFESSIONAL" :
			return Profession.WORKING_PROFESSIONAL;
		}
		
		return Profession.COLLEGE_STUDENT;
	}
}
