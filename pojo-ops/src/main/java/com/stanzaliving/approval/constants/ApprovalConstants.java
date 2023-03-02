package com.stanzaliving.approval.constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.user.acl.enums.Role;
import com.stanzaliving.core.user.enums.EnumListing;


public class ApprovalConstants {
	public static final List<String> l1ApprovalRoles;
	public static final List<String> l2ApprovalRoles;
	public static final List<String> l3ApprovalRoles;
	public static final List<String> l4ApprovalRoles;
	public static final List<String> l5ApprovalRoles;
	public static final List<String> allApprovalRoles;
	
	public static final HashMap<ApprovalEntityType, Role> l1ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>() {{
		put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L1_APPROVER);
		put(ApprovalEntityType.SERVICE_MIX_STAY_CURATION, Role.COUNTRY_SERVICE_MIX_L1_APPROVER);
		put(ApprovalEntityType.SESSION_UNDERWRITTEN, Role.UNDER_WRITTEN_L1_APPROVER);
		put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L1_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L1_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY_V2, Role.FOOD_MENU_CATEGORY_L1_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU, Role.WEEKLY_MENU_L1_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU_V2, Role.WEEKLY_MENU_L1_APPROVER);
		put(ApprovalEntityType.SUPPORT_TEMPLATE, Role.SUPPORT_TEMPLATE_APPROVAL_L1);
		put(ApprovalEntityType.MONTHLY_BUDGET_MENU_PLANNING, Role.MONTHLY_BUDGET_MENU_PLANNING_L1_APPROVER);
		put(ApprovalEntityType.ELECTRICITY_BILL_SPLITTER, Role.MICROMARKET_ELECTRICITY_SPLITTER_L1_APPROVER);
		put(ApprovalEntityType.DISH_DEBAR, Role.DISH_DEBAR_CITY_L1_APPROVER);
		put(ApprovalEntityType.DISH_REACTIVATION, Role.DISH_REACTIVATION_CITY_L1_APPROVER);


	}};
	
	public static final HashMap<ApprovalEntityType, Role> l2ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>() {{
		put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L2_APPROVER);
		put(ApprovalEntityType.SERVICE_MIX_STAY_CURATION, Role.COUNTRY_SERVICE_MIX_L2_APPROVER);
		put(ApprovalEntityType.SESSION_UNDERWRITTEN, Role.UNDER_WRITTEN_L2_APPROVER);
		put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L2_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L2_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY_V2, Role.FOOD_MENU_CATEGORY_L2_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU, Role.WEEKLY_MENU_L2_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU_V2, Role.WEEKLY_MENU_L2_APPROVER);
		put(ApprovalEntityType.SUPPORT_TEMPLATE, Role.SUPPORT_TEMPLATE_APPROVAL_L2);
		put(ApprovalEntityType.MONTHLY_BUDGET_MENU_PLANNING, Role.MONTHLY_BUDGET_MENU_PLANNING_L2_APPROVER);
		put(ApprovalEntityType.ELECTRICITY_BILL_SPLITTER, Role.CITY_ELECTRICITY_SPLITTER_L2_APPROVER);
		put(ApprovalEntityType.DISH_DEBAR, Role.DISH_DEBAR_COUNTRY_L2_APPROVER);
		put(ApprovalEntityType.DISH_REACTIVATION, Role.DISH_REACTIVATION_COUNTRY_L2_APPROVER);
	}};
	
	public static final HashMap<ApprovalEntityType, Role> l3ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>() {{
		put(ApprovalEntityType.SERVICE_MIX, Role.COUNTRY_SERVICE_MIX_L3_APPROVER);
		put(ApprovalEntityType.SERVICE_MIX_STAY_CURATION, Role.COUNTRY_SERVICE_MIX_L3_APPROVER);
		put(ApprovalEntityType.MONTHLY_UNDERWRITTEN, Role.MONTHLY_UNDER_WRITTEN_L3_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY, Role.FOOD_MENU_CATEGORY_L3_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY_V2, Role.FOOD_MENU_CATEGORY_L3_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU, Role.WEEKLY_MENU_L3_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU_V2, Role.WEEKLY_MENU_L3_APPROVER);
		put(ApprovalEntityType.SUPPORT_TEMPLATE, Role.SUPPORT_TEMPLATE_APPROVAL_L3);
		put(ApprovalEntityType.MONTHLY_BUDGET_MENU_PLANNING, Role.MONTHLY_BUDGET_MENU_PLANNING_L3_APPROVER);
		put(ApprovalEntityType.ELECTRICITY_BILL_SPLITTER, Role.COUNTRY_ELECTRICITY_SPLITTER_L3_APPROVER);
		put(ApprovalEntityType.DISH_DEBAR, Role.DISH_DEBAR_COUNTRY_L3_APPROVER);
		put(ApprovalEntityType.DISH_REACTIVATION, Role.DISH_REACTIVATION_COUNTRY_L3_APPROVER);
	}};
	
	public static final HashMap<ApprovalEntityType, Role> l4ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>() {{
		put(ApprovalEntityType.WEEKLY_MENU, Role.WEEKLY_MENU_L4_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU_V2, Role.WEEKLY_MENU_L4_APPROVER);
		put(ApprovalEntityType.FOOD_MENU_CATEGORY_V2, Role.FOOD_MENU_CATEGORY_L4_APPROVER);
		put(ApprovalEntityType.SUPPORT_TEMPLATE, Role.SUPPORT_TEMPLATE_APPROVAL_L4);
		put(ApprovalEntityType.MONTHLY_BUDGET_MENU_PLANNING, Role.MONTHLY_BUDGET_MENU_PLANNING_L4_APPROVER);
	}};
	
	public static final HashMap<ApprovalEntityType, Role> l5ApproverEntityTypeRoleMap = new HashMap<ApprovalEntityType, Role>() {{
		put(ApprovalEntityType.WEEKLY_MENU, Role.WEEKLY_MENU_L5_APPROVER);
		put(ApprovalEntityType.WEEKLY_MENU_V2, Role.WEEKLY_MENU_L5_APPROVER);
		put(ApprovalEntityType.SUPPORT_TEMPLATE, Role.SUPPORT_TEMPLATE_APPROVAL_L5);
		put(ApprovalEntityType.MONTHLY_BUDGET_MENU_PLANNING, Role.MONTHLY_BUDGET_MENU_PLANNING_L5_APPROVER);
	}};
	
	
	static {
		l1ApprovalRoles = l1ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
		l2ApprovalRoles = l2ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
		l3ApprovalRoles = l3ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
		l4ApprovalRoles = l4ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
		l5ApprovalRoles = l5ApproverEntityTypeRoleMap.values().stream().map(Role::getRoleName).collect(Collectors.toList());
		allApprovalRoles = Stream.of(l1ApprovalRoles, l2ApprovalRoles, l3ApprovalRoles, l4ApprovalRoles, l5ApprovalRoles).flatMap(Collection::stream).collect(Collectors.toList());
	}
	
	public static final List<EnumListing<ApprovalStatus>> l1ApprovalStatusDropDown = getL1ApprovalStatusDropDown();
	public static final List<EnumListing<ApprovalStatus>> l2ApprovalStatusDropDown = getL2ApprovalStatusDropDown();
	public static final List<EnumListing<ApprovalStatus>> l3ApprovalStatusDropDown = getL3ApprovalStatusDropDown();
	public static final List<EnumListing<ApprovalStatus>> l4ApprovalStatusDropDown = getL4ApprovalStatusDropDown();
	public static final List<EnumListing<ApprovalStatus>> l5ApprovalStatusDropDown = getL5ApprovalStatusDropDown();
	
	
	private static List<EnumListing<ApprovalStatus>> getL5ApprovalStatusDropDown() {
		return new ArrayList<>(Arrays.asList(
				EnumListing.of(ApprovalStatus.PENDING_L5_APPROVAL, ApprovalStatus.PENDING_L5_APPROVAL.getStatus()),
				EnumListing.of(ApprovalStatus.L5_REJECTED, ApprovalStatus.L5_REJECTED.getStatus()),
				EnumListing.of(ApprovalStatus.APPROVED, ApprovalStatus.APPROVED.getStatus())
		));
	}
	
	private static List<EnumListing<ApprovalStatus>> getL4ApprovalStatusDropDown() {
		List<EnumListing<ApprovalStatus>> dropDownData = new ArrayList<>(Arrays.asList(
				EnumListing.of(ApprovalStatus.PENDING_L4_APPROVAL, ApprovalStatus.PENDING_L4_APPROVAL.getStatus()),
				EnumListing.of(ApprovalStatus.L4_REJECTED, ApprovalStatus.L4_REJECTED.getStatus())
		));
		dropDownData.addAll(getL5ApprovalStatusDropDown());
		return dropDownData;
	}
	
	private static List<EnumListing<ApprovalStatus>> getL3ApprovalStatusDropDown() {
		List<EnumListing<ApprovalStatus>> dropDownData = new ArrayList<>(Arrays.asList(
				EnumListing.of(ApprovalStatus.PENDING_L3_APPROVAL, ApprovalStatus.PENDING_L3_APPROVAL.getStatus()),
				EnumListing.of(ApprovalStatus.L3_REJECTED, ApprovalStatus.L3_REJECTED.getStatus())
		));
		dropDownData.addAll(getL4ApprovalStatusDropDown());
		return dropDownData;
	}
	
	private static List<EnumListing<ApprovalStatus>> getL2ApprovalStatusDropDown() {
		List<EnumListing<ApprovalStatus>> dropDownData = new ArrayList<>(Arrays.asList(
				EnumListing.of(ApprovalStatus.PENDING_L2_APPROVAL, ApprovalStatus.PENDING_L2_APPROVAL.getStatus()),
				EnumListing.of(ApprovalStatus.L2_REJECTED, ApprovalStatus.L2_REJECTED.getStatus())
		));
		dropDownData.addAll(getL3ApprovalStatusDropDown());
		return dropDownData;
	}
	
	private static List<EnumListing<ApprovalStatus>> getL1ApprovalStatusDropDown() {
		List<EnumListing<ApprovalStatus>> dropDownData = new ArrayList<>(Arrays.asList(
				EnumListing.of(ApprovalStatus.PENDING_L1_APPROVAL, ApprovalStatus.PENDING_L1_APPROVAL.getStatus()),
				EnumListing.of(ApprovalStatus.L1_REJECTED, ApprovalStatus.L1_REJECTED.getStatus())
		));
		dropDownData.addAll(getL2ApprovalStatusDropDown());
		return dropDownData;
	}
	
	
}

