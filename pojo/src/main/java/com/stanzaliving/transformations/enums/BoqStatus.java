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

	NOT_STARTED("Not Started", "#e5e3e3",null,null,0),
	DRAFT_IN_PROGRESS("Under Draft", "#e5e3e3",UserType.DESIGN_COORDINATOR,Department.DESIGN,1),
	SEND_FOR_APPROVAL("Sent For Approval to Zonal Head", "#FFC300",UserType.ZONAL_HEAD,Department.DESIGN,2),
	APPROVED_BY_ZH("Sent For Approval to Design Head", "#FFC300",UserType.NATIONAL_HEAD,Department.DESIGN,3),
	APPROVED_BY_NH("Sent For Approval to Projects Zonal Head", "#FFC300",UserType.MANAGER,Department.TRANSFORMATIONS,4),
	APPROVED_BY_PZH("Sent For Approval to Nitin", "#FFC300",UserType.ZONAL_HEAD,Department.PROJECTS,5),
	SENT_BACK("Sent Back", "#d41111",UserType.DESIGN_COORDINATOR,Department.DESIGN,6),
	APPROVED("Approved", "#77baa6",null,null,7);
	
	private String desc;
	private String color;
	private UserType editableByUser;
	private Department editableByDepartment;
	private Integer order;


	private BoqStatus(String name, String color, UserType userType, Department department, int order) {
		this.desc = name;
		this.color = color;
		this.editableByUser = userType;
		this.editableByDepartment = department;
		this.order=order;
	}
}