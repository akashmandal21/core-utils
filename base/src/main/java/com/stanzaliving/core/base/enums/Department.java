package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Department {

	TECH("Tech"),
	FINANCE("Finance"),
	HR("HR"),
	LEGAL("Legal"),
	SUPERADMIN("Superadmin"),
	LEADERSHIP("Leadership"),
	BUSINESS_DEVELOPMENT("Real Estate"),
	OPS("Operations"),
	FOOD_OPS("Food Operations"),
	PROCUREMENT("Procurement"),
	DESIGN("Design"),
	PROJECTS("Projects"),
	TRANSFORMATIONS("Transformation"),
	SALES("Sales"),
	WEB("Web"),
	GC("GC Procurement"),
	WAREHOUSE("Warehouse");

	public String departmentName;

}