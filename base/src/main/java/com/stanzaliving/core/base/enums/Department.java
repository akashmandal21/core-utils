package com.stanzaliving.core.base.enums;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Department {


	TECH("Tech","TP","TCH"),
	FINANCE("Finance","FN","FIN"),
	HR("Talent Management","HR","HRS"),
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
	MARKETING("Marketing","MK","MKT"),
	SCM("Supply Chain Mgmt","SM","TRN"),
	GROWTH_STRATEGY("Growth and Strategy","GS","GRS"),
	LND("Learning & Development","LD","LND");

	public String departmentName;
	public String shortCode;
	public String genericPoShortCode;
	
	public static Collection<Department> departments;
	private static SortedMap<String, Department> departmentsMap = new TreeMap<String, Department>();

	static {
		for (Department d : Department.values()) {
			departmentsMap.put(d.getDepartmentName(), d);
		}
	}

	public static Collection<Department> getDepartments() {
		return departmentsMap.values();
	}
}