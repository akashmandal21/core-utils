package com.stanzaliving.core.user.acl.enums;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum AccessLevelEntityEnum {

    INDIA(AccessLevel.COUNTRY, "7d0e47bf-52c0-4560-924e-e6599e56501a");

    private AccessLevel accessLevel;
    private String uuid;
}
