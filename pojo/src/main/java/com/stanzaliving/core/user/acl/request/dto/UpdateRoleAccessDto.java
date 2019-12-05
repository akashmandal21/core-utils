package com.stanzaliving.core.user.acl.request.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UpdateRoleAccessDto extends AddRoleAccessDto {

    @NotBlank
    private String roleAccessUuid;

}
