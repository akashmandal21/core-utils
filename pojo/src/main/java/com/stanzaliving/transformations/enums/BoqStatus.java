/**
 * 
 */
package com.stanzaliving.transformations.enums;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.enums.UserType;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum BoqStatus {

	NOT_STARTED("Not Started", "#e5e3e3",null,null),
	DRAFT_IN_PROGRESS("Under Draft", "#e5e3e3",UserType.DESIGN_COORDINATOR,Department.DESIGN),
	SEND_FOR_APPROVAL("Sent For Approval to Zonal Head", "#FFC300",UserType.ZONAL_HEAD,Department.DESIGN),
	APPROVED_BY_ZH("Sent For Approval to Design Head", "#FFC300",UserType.NATIONAL_HEAD,Department.DESIGN),
	APPROVED_BY_NH("Sent For Approval to Design Head", "#FFC300",UserType.MANAGER,Department.TRANSFORMATIONS),
	SENT_BACK("Sent Back", "#d41111",UserType.DESIGN_COORDINATOR,Department.DESIGN),
	APPROVED("Approved", "#77baa6",null,null);
	
	private String desc;
	private String color;
	private UserType editableByUser;
	private Department editableByDepartment;


	private BoqStatus(String name, String color, UserType userType, Department department) {
		this.desc = name;
		this.color = color;
		this.editableByUser = userType;
		this.editableByDepartment = department;
	}
}