package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDeptLevelRoleNameUrlExpandedDto {

    private String userUuid;

    private Department department;

    private AccessLevel accessLevel;

    private List<String> accessLevelEntityListUuid;

    private List<String> rolesList;

    private List<String> urlList;

}
