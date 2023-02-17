/**
 * 
 */
package com.stanzaliving.core.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@NoArgsConstructor
public enum UserType {

	EMPLOYEE("employee"),
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
	SYSTEM("System"),
	CITY_TEAM("City Team"),
	CENTRAL_TEAM("Central Team"),
	EXTERNAL("External"),
	GUEST("Guest"),
	INVITED_GUEST("Invited Guest"),
	FOOD_DELIVERY_AGENT("Food Delivery Agent"),
	VENDOR("Vendor");

	public static List<UserType> getMigratedUserTypes(){
		return Arrays.asList(UserType.MANAGER,UserType.DESIGN_COORDINATOR,
				UserType.PROJECT_MANAGER,UserType.SITE_ENGINEER,UserType.ZONAL_HEAD,UserType.NATIONAL_HEAD,UserType.LEADERSHIP);
	}

	public String typeName;

	public String getTypeName(){
		return typeName;
	}

	UserType(String typeName){
		this.typeName=typeName;
	}

}