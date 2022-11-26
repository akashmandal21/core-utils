/**
 * 
 */
package com.stanzaliving.transformations.enums;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.enums.UserType;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author raj.kumar
 *
 */
@Getter
public enum BoqStatus {

	NOT_STARTED("Not Available", "#e5e3e3",null,null,0, "Not Started", "#e5e3e3", ColorCode.BLACK.getColorCode(), 0),
	DRAFT_IN_PROGRESS("Under Draft", "#e5e3e3",UserType.DESIGN_COORDINATOR,Department.DESIGN,1, "In Draft", ColorCode.DARK_GRAYISH_BLUE.getColorCode(), ColorCode.LIGHT_GRAYISH_BLUE.getColorCode(), 1),
	SEND_FOR_APPROVAL("Sent For Approval to Zonal Head", "#FFC300",UserType.ZONAL_HEAD,Department.DESIGN,2, "L1 Approval Due", ColorCode.VIVID_ORANGE.getColorCode(), ColorCode.PALE_ORANGE.getColorCode(), 3),
	APPROVED_BY_ZH("Sent For Approval to Design Head", "#FFC300",UserType.NATIONAL_HEAD,Department.DESIGN,3, "L2 Approval Due", ColorCode.VIVID_ORANGE.getColorCode(), ColorCode.PALE_ORANGE.getColorCode(), 4),
	APPROVED_BY_NH("Sent For Approval to Projects Zonal Head", "#FFC300",UserType.MANAGER,Department.TRANSFORMATIONS,4, "L3 Approval Due", ColorCode.VIVID_ORANGE.getColorCode(), ColorCode.PALE_ORANGE.getColorCode(), 5),
	APPROVED_BY_PZH("Sent For Approval to Nitin", "#FFC300",UserType.ZONAL_HEAD,Department.PROJECTS,5, "L4 Approval Due", ColorCode.VIVID_ORANGE.getColorCode(), ColorCode.PALE_ORANGE.getColorCode(), 6),
	SENT_BACK("Sent Back", "#d41111",UserType.DESIGN_COORDINATOR,Department.DESIGN,6, "Sent Back", ColorCode.SOFT_RED.getColorCode(), ColorCode.VERY_PALE_MOSTLY_WHITE_RED.getColorCode(), 2),
	APPROVED_BY_NITIN("Sent For Approval to Leadership", "#77baa6",UserType.MANAGER,Department.TRANSFORMATIONS,7, "L5 Approval Due", ColorCode.VIVID_ORANGE.getColorCode(), ColorCode.PALE_ORANGE.getColorCode(), 7),
	APPROVED_BY_LEADERSHIP("Approved", "#77baa6",UserType.LEADERSHIP,Department.LEADERSHIP,8, "Approved", ColorCode.GREEN_CYAN.getColorCode(), ColorCode.SOFT_GREEN.getColorCode(), 8);

	private String desc;
	private String color;
	private UserType editableByUser;
	private Department editableByDepartment;
	private Integer order;
	private String approvalState;
	private String textColor;
	private String bgColor;
	private Integer statusOrder;

	BoqStatus(String desc, String color, UserType editableByUser, Department editableByDepartment, Integer order, Integer statusOrder) {
		this.desc = desc;
		this.color = color;
		this.editableByUser = editableByUser;
		this.editableByDepartment = editableByDepartment;
		this.order = order;
		this.approvalState = null;
		this.textColor = null;
		this.bgColor = null;
		this.statusOrder = statusOrder;
	}

	BoqStatus(String name, String color, UserType userType, Department department, int order, String approvalState, String textColor, String bgColor, Integer statusOrder) {
		this.desc = name;
		this.color = color;
		this.editableByUser = userType;
		this.editableByDepartment = department;
		this.order=order;
		this.approvalState=approvalState;
		this.textColor=textColor;
		this.bgColor=bgColor;
		this.statusOrder = statusOrder;
	}


	public static Map<Integer, BoqStatus> boqStatusAndOrderMap = new HashMap<>();

	static{
		for(BoqStatus boqStatus: BoqStatus.values()) {
			boqStatusAndOrderMap.put(boqStatus.getStatusOrder(), boqStatus);
		}
	}
}