package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Department {

	TECH("Tech","TP"),
	FINANCE("Finance","FN"),
	HR("HR","HR"),
	LEGAL("Legal","LG"),
	SUPERADMIN("Superadmin",null),
	LEADERSHIP("Leadership",null),
	BUSINESS_DEVELOPMENT("Real Estate","RE"),
	OPS("Operations","OP"),
	FOOD_OPS("Food Operations","FB"),
	PROCUREMENT("Procurement",null),
	DESIGN("Design",null),
	PROJECTS("Projects",null),
	TRANSFORMATIONS("Transformation","TN"),
	SALES("Sales","SM"),
	WEB("Web",null),
	GC("GC Procurement",null),
	WAREHOUSE("Warehouse",null),
	CX("Customer Experience","CX"),
	ADMIN("Admin","AD");
	public String departmentName;
	public String shortCode;
}