package com.stanzaliving.core.user.acl.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Role {

    RESIDENCE_LEAD_MANAGER("RESIDENCE_LEAD_MANAGER", AccessLevel.RESIDENCE, null),
    MICROMARKET_LEAD_MANAGER("MICROMARKET_LEAD_MANAGER", AccessLevel.MICROMARKET, null),
    CITY_LEAD_MANAGER("CITY_LEAD_MANAGER", AccessLevel.CITY, null),
    ZONAL_LEAD_MANAGER("ZONAL_LEAD_MANAGER", AccessLevel.CITY, null),
    COUNTRY_LEAD_MANAGER("COUNTRY_LEAD_MANAGER", AccessLevel.COUNTRY, null),
    COUNTRY_SERVICE_MIX_L1_APPROVER("Country- Service Mix L1 Approver", AccessLevel.COUNTRY, null),
    COUNTRY_SERVICE_MIX_L2_APPROVER("Country- Service Mix L2 Approver", AccessLevel.COUNTRY, null),
    ;

    private String roleName;
    private AccessLevel accessLevel;
    private String roleUuid;

}
