package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.user.acl.dto.RoleAssignDto;

import javax.validation.constraints.NotBlank;

public class UpdateRoleAssignDto extends AddRoleAssignDto {

    @NotBlank
    private String roleAssignUuid;

}
