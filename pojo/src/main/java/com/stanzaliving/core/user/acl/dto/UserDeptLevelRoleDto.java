package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.user.acl.request.dto.AddUserDeptLevelRoleRequestDto;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserDeptLevelRoleDto extends AddUserDeptLevelRoleRequestDto {
    String userDeptLevelUuid;

}
