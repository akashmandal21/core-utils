/**
 * 
 */
package com.stanzaliving.core.user.enums;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */

public enum UserType {

	STUDENT("Student"),
	PARENT("Parent"),
	LEGAL("Legal"),
	HR("HR"),
	TECH("Tech"),
	FINANCE("Finance"),
	PROCUREMENT("Procurement"),
	MANAGER("Manager"),
	BD("BD"),
	LEADERSHIP("Leadership"),
	OPS("OPS"),
	SITE_ENGINEER("Site Engineer"),
	PROJECT_MANAGER("Project Manager"),
	ZONAL_HEAD("Zonal Head"),
	NATIONAL_HEAD("National Head"),
	DESIGN_COORDINATOR("Design Coordinator"),
	CONSUMER("Consumer"),
	SYSTEM("System");

	public String typeName;

	private UserType(String name){
		this.typeName = name;
	}
}