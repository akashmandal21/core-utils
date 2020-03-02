package com.stanzaliving.core.base.enums;

public enum Department {
    TECH ("Tech"),
    FINANCE ("Finance"),
    HR ("Hr"),
    LEGAL ("Legal"),
    SUPERADMIN ("Superadmin"),
    LEADERSHIP ("Leadership"),
    BUSINESS_DEVELOPMENT ("Business Development"),
    OPS ("Ops"),
    PROCUREMENT ("Procurement"),
    DESIGN ("Design"),
    PROJECTS ("Projects"),
    TRANSFORMATIONS ("Transformations"),
    SALES ("Sales"),
    WEB ("Web");
    
    public String departmentName;
	
	private Department(String departmentName) {
		this.departmentName = departmentName;
	}
}
