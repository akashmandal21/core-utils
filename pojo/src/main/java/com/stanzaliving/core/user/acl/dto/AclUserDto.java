package com.stanzaliving.core.user.acl.dto;

import java.util.List;

import com.stanzaliving.core.user.dto.UserDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AclUserDto extends UserDto {
    private List<UserDeptLevelRoleNameUrlExpandedDto> acl;
}
