package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.user.dto.UserProfileDto;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@ToString(callSuper = true)
@SuperBuilder
public class AclUserProfileDTO extends UserProfileDto {
    private List<UserDeptLevelRoleNameUrlExpandedDto> acl;
}
