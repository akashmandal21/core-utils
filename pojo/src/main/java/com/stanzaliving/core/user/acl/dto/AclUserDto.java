package com.stanzaliving.core.user.acl.dto;


import java.util.List;

import com.stanzaliving.core.user.dto.UserProfileDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class AclUserDto extends UserProfileDto {
    private List<UserDeptLevelRoleNameUrlExpandedDto> acl;
}
