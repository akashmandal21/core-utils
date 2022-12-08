package com.stanzaliving.core.user.acl.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.AccessModule;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Role {

    /************************************ SALES ************************************/
    SALES_CITY_HEAD("SALES_CITY_HEAD", AccessLevel.CITY, Department.SALES),
    SALES_ZONAL_HEAD("SALES_ZONAL_HEAD", AccessLevel.CITY, Department.SALES),
    SALES_CLUSTER_MANAGER("SALES_CLUSTER_MANAGER", AccessLevel.MICROMARKET, Department.SALES),

    /* lead-service */
    UBONA_CALLING("UBONA_CALLING", AccessLevel.RESIDENCE, Department.SALES),
    RESIDENCE_LEAD_MANAGER("RESIDENCE_LEAD_MANAGER", AccessLevel.RESIDENCE, Department.SALES, AccessModule.PG_LEAD_EDIT),
    MICROMARKET_LEAD_MANAGER("MICROMARKET_LEAD_MANAGER", AccessLevel.MICROMARKET, Department.SALES, AccessModule.PG_LEAD_EDIT),
    CITY_LEAD_MANAGER("CITY_LEAD_MANAGER", AccessLevel.CITY, Department.SALES, AccessModule.PG_LEAD_EDIT),
    ZONAL_LEAD_MANAGER("ZONAL_LEAD_MANAGER", AccessLevel.CITY, Department.SALES),
    COUNTRY_LEAD_MANAGER("COUNTRY_LEAD_MANAGER", AccessLevel.COUNTRY, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_RESIDENCE("INTERNAL_SALES_RESIDENCE", AccessLevel.RESIDENCE, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_MICROMARKET("INTERNAL_SALES_MICROMARKET", AccessLevel.MICROMARKET, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_CITY("INTERNAL_SALES_CITY", AccessLevel.CITY, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_COUNTRY("INTERNAL_SALES_COUNTRY", AccessLevel.COUNTRY, Department.SALES, AccessModule.PG_LEAD_EDIT),

    RESIDENCE_LEAD_VIEWER("RESIDENCE_LEAD_VIEWER", AccessLevel.RESIDENCE, Department.SALES),

    MICROMARKET_LEAD_VIEWER("MICROMARKET_LEAD_VIEWER", AccessLevel.MICROMARKET, Department.SALES),

    CITY_LEAD_VIEWER("CITY_LEAD_VIEWER", AccessLevel.CITY, Department.SALES),

    COUNTRY_LEAD_VIEWER("COUNTRY_LEAD_VIEWER", AccessLevel.COUNTRY, Department.SALES),

    INTERNAL_SALES_RESIDENCE("INTERNAL_SALES_RESIDENCE", AccessLevel.RESIDENCE, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_MICROMARKET("INTERNAL_SALES_MICROMARKET", AccessLevel.MICROMARKET, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_CITY("INTERNAL_SALES_CITY", AccessLevel.CITY, Department.SALES, AccessModule.PG_LEAD_EDIT),

    INTERNAL_SALES_COUNTRY("INTERNAL_SALES_COUNTRY", AccessLevel.COUNTRY, Department.SALES, AccessModule.PG_LEAD_EDIT),
    
    /* lead-service apartment role*/
    RESIDENCE_APARTMENT_LEAD_MANAGER("RESIDENCE_APARTMENT_LEAD_MANAGER", AccessLevel.RESIDENCE, Department.SALES, AccessModule.APARTMENTS_LEAD_EDIT),
	MICROMARKET_APARTMENT_LEAD_MANAGER("MICROMARKET_APARTMENT_LEAD_MANAGER", AccessLevel.MICROMARKET, Department.SALES, AccessModule.APARTMENTS_LEAD_EDIT),
	CITY_APARTMENT_LEAD_MANAGER("CITY_APARTMENT_LEAD_MANAGER", AccessLevel.CITY, Department.SALES, AccessModule.APARTMENTS_LEAD_EDIT),
	ZONAL_APARTMENT_LEAD_MANAGER("ZONAL_APARTMENT_LEAD_MANAGER", AccessLevel.CITY, Department.SALES),
	COUNTRY_APARTMENT_LEAD_MANAGER("COUNTRY_APARTMENT_LEAD_MANAGER", AccessLevel.COUNTRY, Department.SALES, AccessModule.APARTMENTS_LEAD_EDIT),

    RESIDENCE_APARTMENT_LEAD_VIEWER("RESIDENCE_APARTMENT_LEAD_VIEWER", AccessLevel.RESIDENCE, Department.SALES),

    MICROMARKET_APARTMENT_LEAD_VIEWER("MICROMARKET_APARTMENT_LEAD_VIEWER", AccessLevel.MICROMARKET, Department.SALES),

    CITY_APARTMENT_LEAD_VIEWER("CITY_APARTMENT_LEAD_VIEWER", AccessLevel.CITY, Department.SALES),

    COUNTRY_APARTMENT_LEAD_VIEWER("COUNTRY_APARTMENT_LEAD_VIEWER", AccessLevel.COUNTRY, Department.SALES),

    /*******************************Support service - Template Management*******************************/
    SUPPORT_TEMPLATE_APPROVAL_L1("SUPPORT_TEMPLATE_APPROVAL_L1", AccessLevel.COUNTRY, Department.CX),
    SUPPORT_TEMPLATE_APPROVAL_L2("SUPPORT_TEMPLATE_APPROVAL_L2", AccessLevel.COUNTRY, Department.CX),
    SUPPORT_TEMPLATE_APPROVAL_L3("SUPPORT_TEMPLATE_APPROVAL_L3", AccessLevel.COUNTRY, Department.CX),
    SUPPORT_TEMPLATE_APPROVAL_L4("SUPPORT_TEMPLATE_APPROVAL_L4", AccessLevel.COUNTRY, Department.CX),
    SUPPORT_TEMPLATE_APPROVAL_L5("SUPPORT_TEMPLATE_APPROVAL_L5", AccessLevel.COUNTRY, Department.CX),

    /************************************ OPS ************************************/
    RC("Resident Captain", AccessLevel.RESIDENCE, Department.OPS),
    CLUSTER_MANAGER("Cluster Manager", AccessLevel.MICROMARKET, Department.OPS),
    CITY_MANAGER("City Manager", AccessLevel.CITY, Department.OPS),
    ZONAL_HEAD("Zonal Head", AccessLevel.CITY, Department.OPS),

    /* operations-service / approval dashboard*/
    COUNTRY_SERVICE_MIX_L1_APPROVER("Country - Service Mix L1 Approver", AccessLevel.COUNTRY, Department.OPS),
    COUNTRY_SERVICE_MIX_L2_APPROVER("Country - Service Mix L2 Approver", AccessLevel.COUNTRY, Department.OPS),
    COUNTRY_SERVICE_MIX_L3_APPROVER("Country - Service Mix L3 Approver", AccessLevel.COUNTRY, Department.OPS),
    EMAIL_CC_SERVICE_MIX_APPROVED("Email CC - Service Mix Approved", AccessLevel.COUNTRY, Department.OPS),

    /* ops-calculator-service / approval dashboard */
    UNDER_WRITTEN_L1_APPROVER("Country - Season Underwritten L1 Approver", AccessLevel.COUNTRY, Department.OPS),
    UNDER_WRITTEN_L2_APPROVER("Country - Season Underwritten L2 Approver", AccessLevel.COUNTRY, Department.OPS),

    /* ops-calculator-service / approval dashboard */
    MONTHLY_UNDER_WRITTEN_L1_APPROVER("Country - Monthly Underwritten L1 Approver", AccessLevel.COUNTRY, Department.OPS),
    MONTHLY_UNDER_WRITTEN_L2_APPROVER("Country - Monthly Underwritten L2 Approver", AccessLevel.COUNTRY, Department.OPS),
    MONTHLY_UNDER_WRITTEN_L3_APPROVER("Country - Monthly Underwritten L3 Approver", AccessLevel.COUNTRY, Department.OPS),

    /* food-service / approval dashboard */
    FOOD_MENU_CATEGORY_L1_APPROVER("Country - food menu category L1 Approver", AccessLevel.COUNTRY, Department.FOOD_OPS),
    FOOD_MENU_CATEGORY_L2_APPROVER("Country - food menu category L2 Approver", AccessLevel.COUNTRY, Department.FOOD_OPS),
    FOOD_MENU_CATEGORY_L3_APPROVER("Country - food cost approver", AccessLevel.COUNTRY, Department.FOOD_OPS),
    FOOD_MENU_CATEGORY_L4_APPROVER("Country - Menu Category Approval L4", AccessLevel.COUNTRY, Department.FOOD_OPS),

    EMAIL_SERVICEMIX_AUTO_CHANGE_IN_COST("Email_CC_Servicemix_Auto_change_in_cost", AccessLevel.COUNTRY, Department.OPS),
    EMAIL_SERVICEMIX_AUTO_CHANGE_IN_COST_MM("Email_CC_Servicemix_Auto_change_in_cost_mm", AccessLevel.MICROMARKET, Department.OPS),
    EMAIL_SERVICEMIX_AUTO_CHANGE_IN_COST_RESIDENCE("Email_CC_Servicemix_Auto_change_in_cost_res", AccessLevel.RESIDENCE, Department.OPS),

    /************************************ FOOD - OPS ************************************/
    CITY_CHEF_MANAGER("City Chef Manager", AccessLevel.CITY, Department.FOOD_OPS),


    WEEKLY_MENU_L1_APPROVER("City - Ops Weekly Menu Approval", AccessLevel.CITY, Department.OPS),
    WEEKLY_MENU_L2_APPROVER("Country - Weekly Menu Approval L1", AccessLevel.COUNTRY, Department.FOOD_OPS),
    WEEKLY_MENU_L3_APPROVER("Country - Weekly Menu Approval L2", AccessLevel.COUNTRY, Department.FOOD_OPS),
    WEEKLY_MENU_L4_APPROVER("Weekly Menu Vendor Approval", AccessLevel.FOOD_VENDOR, Department.FOOD_OPS),

    WEEKLY_MENU_L5_APPROVER("Country - Weekly Menu Approval L3", AccessLevel.COUNTRY, Department.FOOD_OPS),


    MONTHLY_BUDGET_MENU_PLANNING_L1_APPROVER("City - Menu Budget Planner L1 Approver", AccessLevel.CITY, Department.FOOD_OPS),
    MONTHLY_BUDGET_MENU_PLANNING_L2_APPROVER("City - Menu Budget Planner L2 Approver", AccessLevel.CITY, Department.FOOD_OPS),
    MONTHLY_BUDGET_MENU_PLANNING_L3_APPROVER("Country - Menu Budget Planner L3 Approver", AccessLevel.COUNTRY, Department.FOOD_OPS),
    MONTHLY_BUDGET_MENU_PLANNING_L4_APPROVER("Country - Menu Budget Planner L4 Approver", AccessLevel.COUNTRY, Department.FOOD_OPS),
    MONTHLY_BUDGET_MENU_PLANNING_L5_APPROVER("Country - Menu Budget Planner L5 Approver", AccessLevel.COUNTRY, Department.FOOD_OPS),


    /************************************ ELECTRICITY ************************************/
	MICROMARKET_ELECTRICITY_SPLITTER_L1_APPROVER("MICROMARKET_ELECTRICITY_SPLITTER_L1_APPROVER", AccessLevel.MICROMARKET, Department.OPS),
	CITY_ELECTRICITY_SPLITTER_L2_APPROVER("CITY_ELECTRICITY_SPLITTER_L2_APPROVER", AccessLevel.CITY, Department.OPS),
	COUNTRY_ELECTRICITY_SPLITTER_L3_APPROVER("COUNTRY_ELECTRICITY_SPLITTER_L3_APPROVER", AccessLevel.COUNTRY, Department.OPS),

    /************************************ DISH DEBAR ************************************/
    DISH_DEBAR_CITY_L1_APPROVER("City - Debar Approval L1", AccessLevel.CITY, Department.FOOD_OPS),
    DISH_DEBAR_COUNTRY_L2_APPROVER("Country - Debar Approval L2", AccessLevel.COUNTRY, Department.FOOD_OPS),
    DISH_DEBAR_COUNTRY_L3_APPROVER("Country - Debar Approval L3", AccessLevel.COUNTRY, Department.FOOD_OPS),

    /************************************ DISH REACTIVATION ************************************/
    DISH_REACTIVATION_CITY_L1_APPROVER("City - Reactivate Dish Approval L1", AccessLevel.CITY, Department.FOOD_OPS),
    DISH_REACTIVATION_COUNTRY_L2_APPROVER("Country - Reactivate Dish Approval L2", AccessLevel.COUNTRY, Department.FOOD_OPS),
    DISH_REACTIVATION_COUNTRY_L3_APPROVER("Country - Reactivate Dish Approval L3", AccessLevel.COUNTRY, Department.FOOD_OPS),


    /********************************* GENERIC-APPROVAL-DASHBOARD *************************************/

    CITY_INVENTORY_L1_APPROVAL("CITY_INVENTORY_L1_APPROVAL", AccessLevel.CITY, Department.SALES),
    CITY_INVENTORY_L2_APPROVAL("CITY_INVENTORY_L2_APPROVAL", AccessLevel.CITY, Department.SALES),
    CITY_INVENTORY_L3_APPROVAL("CITY_INVENTORY_L3_APPROVAL", AccessLevel.CITY, Department.SALES),
    CITY_INVENTORY_L4_APPROVAL("CITY_INVENTORY_L4_APPROVAL", AccessLevel.CITY, Department.SALES),
    CITY_INVENTORY_L5_APPROVAL("CITY_INVENTORY_L5_APPROVAL", AccessLevel.CITY, Department.SALES),
    COUNTRY_INVENTORY_L1_APPROVAL("COUNTRY_INVENTORY_L1_APPROVAL", AccessLevel.COUNTRY, Department.SALES),
    COUNTRY_INVENTORY_L2_APPROVAL("COUNTRY_INVENTORY_L2_APPROVAL", AccessLevel.COUNTRY, Department.SALES),
    COUNTRY_INVENTORY_L3_APPROVAL("COUNTRY_INVENTORY_L3_APPROVAL", AccessLevel.COUNTRY, Department.SALES),
    COUNTRY_INVENTORY_L4_APPROVAL("COUNTRY_INVENTORY_L4_APPROVAL", AccessLevel.COUNTRY, Department.SALES),
    COUNTRY_INVENTORY_L5_APPROVAL("COUNTRY_INVENTORY_L5_APPROVAL", AccessLevel.COUNTRY, Department.SALES),
    MICROMARKET_INVENTORY_L1_APPROVAL("MICROMARKET_INVENTORY_L1_APPROVAL", AccessLevel.MICROMARKET, Department.SALES),
    MICROMARKET_INVENTORY_L2_APPROVAL("MICROMARKET_INVENTORY_L2_APPROVAL", AccessLevel.MICROMARKET, Department.SALES),
    MICROMARKET_INVENTORY_L3_APPROVAL("MICROMARKET_INVENTORY_L3_APPROVAL", AccessLevel.MICROMARKET, Department.SALES),
    MICROMARKET_INVENTORY_L4_APPROVAL("MICROMARKET_INVENTORY_L4_APPROVAL", AccessLevel.MICROMARKET, Department.SALES),
    MICROMARKET_INVENTORY_L5_APPROVAL("MICROMARKET_INVENTORY_L5_APPROVAL", AccessLevel.MICROMARKET, Department.SALES);

    private String roleName;
    private AccessLevel accessLevel;
    private Department department;
    private AccessModule accessModule;

    Role(String roleName, AccessLevel accessLevel, Department department) {
        this.roleName = roleName;
        this.accessLevel = accessLevel;
        this.department = department;
    }

    public static boolean internalSalesRole(Role role) {
        Set<Role> internalSalesRoleSet = new HashSet<>();
        internalSalesRoleSet.add(INTERNAL_SALES_RESIDENCE);
        internalSalesRoleSet.add(INTERNAL_SALES_MICROMARKET);
        internalSalesRoleSet.add(INTERNAL_SALES_CITY);
        internalSalesRoleSet.add(INTERNAL_SALES_COUNTRY);
        return internalSalesRoleSet.contains(role);
    }
}
