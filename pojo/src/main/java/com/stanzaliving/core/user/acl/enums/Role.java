package com.stanzaliving.core.user.acl.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Role {

    /************************************ SALES ************************************/
    SALES_CITY_HEAD("SALES_CITY_HEAD", AccessLevel.CITY, Department.SALES),
    SALES_ZONAL_HEAD("SALES_ZONAL_HEAD", AccessLevel.CITY, Department.SALES),
    SALES_CLUSTER_MANAGER("SALES_CLUSTER_MANAGER", AccessLevel.MICROMARKET, Department.SALES),

    /* lead-service */
    RESIDENCE_LEAD_MANAGER("RESIDENCE_LEAD_MANAGER", AccessLevel.RESIDENCE, Department.SALES),
    MICROMARKET_LEAD_MANAGER("MICROMARKET_LEAD_MANAGER", AccessLevel.MICROMARKET, Department.SALES),
    CITY_LEAD_MANAGER("CITY_LEAD_MANAGER", AccessLevel.CITY, Department.SALES),
    ZONAL_LEAD_MANAGER("ZONAL_LEAD_MANAGER", AccessLevel.CITY, Department.SALES),
    COUNTRY_LEAD_MANAGER("COUNTRY_LEAD_MANAGER", AccessLevel.COUNTRY, Department.SALES),


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


    /************************************ FOOD - OPS ************************************/
    CITY_CHEF_MANAGER("City Chef Manager", AccessLevel.CITY, Department.FOOD_OPS),


    WEEKLY_MENU_L1_APPROVER("Ops Weekly Menu Approval", AccessLevel.CITY, Department.OPS),
    WEEKLY_MENU_L2_APPROVER("Country - Menu Approval L1", AccessLevel.COUNTRY, Department.OPS),
    WEEKLY_MENU_L3_APPROVER("Country - Menu Approval L2", AccessLevel.COUNTRY, Department.OPS),
    WEEKLY_MENU_L4_APPROVER("Vendor Approval", AccessLevel.FOOD_VENDOR, Department.FOOD_OPS),
    WEEKLY_MENU_L5_APPROVER("Country - Menu Approval L3", AccessLevel.COUNTRY, Department.OPS);
    private String roleName;
    private AccessLevel accessLevel;
    private Department department;

}
