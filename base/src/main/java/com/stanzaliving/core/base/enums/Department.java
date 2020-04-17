package com.stanzaliving.core.base.enums;

import lombok.Getter;

@Getter
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
    TRANSFORMATIONS ("Transformations"),
    SALES ("Sales"),
    WEB ("Web"),
    GC("GC Procurement");
    
    public String departmentName;
	
	private Department(String departmentName) {
		this.departmentName = departmentName;
	}
}
