package com.stanzaliving.core.user.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum Role {

    //For lead owner
    RESIDENCE_SALES_ASSOCIATE("RESIDENCE_SALES_ASSOCIATE", AccessLevel.RESIDENCE, ""),
    SALES_CLUSTER_MANAGER("SALES_CLUSTER_MANAGER", AccessLevel.MICROMARKET, "09de521b-73f8-47db-8ae1-9037c86c4fca"),
    SALES_CITY_HEAD("SALES_CITY_HEAD", AccessLevel.CITY, "af696671-b6e9-4408-9f42-00996e625f40"),
    SALES_ZONAL_HEAD("SALES_ZONAL_HEAD", AccessLevel.CITY, "f2306f5a-388f-4b8c-a5fa-7ac80b60d70c"),
    SALES_NATIONAL_ADMIN("SALES_NATIONAL_ADMIN", AccessLevel.COUNTRY, "31ccb595-2449-46fb-9d50-ea1d70ca36c8");

    private String roleName;
    private AccessLevel accessLevel;
    private String roleUuid;

}
