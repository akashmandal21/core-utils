package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleSnapshot {
    private String userUuid;
    private List<UserDeptLevelRoleNameUrlExpandedDto> userDeptLevelRoles;
}
