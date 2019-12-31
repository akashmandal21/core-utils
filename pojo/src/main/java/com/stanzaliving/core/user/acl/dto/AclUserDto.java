package com.stanzaliving.core.user.acl.dto;


import com.stanzaliving.core.user.dto.UserDto;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@ToString(callSuper = true)
@SuperBuilder
public class AclUserDto extends UserDto {
    private List<UserDeptLevelRoleNameUrlExpandedDto> acl;
}
