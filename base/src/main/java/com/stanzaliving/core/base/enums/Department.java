package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Department {

	TECH("Tech","TP","TCH"),
	FINANCE("Finance","FN","FIN"),
	HR("HR","HR","HRS"),
	LEGAL("Legal","LG","LGL"),
	SUPERADMIN("Superadmin",null,null),
	LEADERSHIP("Leadership",null,null),
	BUSINESS_DEVELOPMENT("Real Estate","RE","RET"),
	OPS("Operations","OP","OPS"),
	FOOD_OPS("Food Operations","FB","FNB"),
	PROCUREMENT("Procurement",null,"TRN"),
	DESIGN("Design",null,"TRN"),
	PROJECTS("Projects",null,"TRN"),
	TRANSFORMATIONS("Transformation","TN","TRN"),
	SALES("Sales","SM","SNM"),
	WEB("Web",null,null),
	GC("GC Procurement",null,"TRN"),
	WAREHOUSE("Warehouse",null,null),
	CX("Customer Experience","CX","CXP"),
	ADMIN("Admin","AD","ADM"),
	SCM("Supply Chain Mgmt","SM","TRN");
	public String departmentName;
	public String shortCode;
	public String genericPoShortCode;
}