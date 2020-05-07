package com.stanzaliving.core.base.enums;

public enum Department {
    TECH ("Tech"),
    FINANCE ("Finance"),
    HR ("Hr"),
    LEGAL ("Legal"),
    SUPERADMIN ("Superadmin"),
    LEADERSHIP ("Leadership"),
    BUSINESS_DEVELOPMENT ("Real Estate"),
    OPS ("Operations"),
    PROCUREMENT ("Procurement"),
    DESIGN ("Design"),
    PROJECTS ("Projects"),
    TRANSFORMATIONS ("Transformation"),
    SALES ("Sales"),
    WEB ("Web"),
    GC("GC Procurement"),
    WAREHOUSE("Warehouse");
    
    public String departmentName;
	
	private Department(String departmentName) {
		this.departmentName = departmentName;
	}
}
