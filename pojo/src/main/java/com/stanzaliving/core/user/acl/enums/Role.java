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

    /* operations-service */
    COUNTRY_SERVICE_MIX_L1_APPROVER("Country- Service Mix L1 Approver", AccessLevel.COUNTRY, Department.OPS),
    COUNTRY_SERVICE_MIX_L2_APPROVER("Country- Service Mix L2 Approver", AccessLevel.COUNTRY, Department.OPS),
    EMAIL_CC_SERVICE_MIX_APPROVED("Email CC - Service Mix Approved", AccessLevel.COUNTRY, Department.OPS),



    /************************************ FOOD - OPS ************************************/
    CITY_CHEF_MANAGER("City Chef Manager", AccessLevel.CITY, Department.FOOD_OPS)



    ;
    private String roleName;
    private AccessLevel accessLevel;
    private Department department;

}
