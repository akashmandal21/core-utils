package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class UserRoleAssignRequestDto {

    @NotBlank
    private String userUuid;

    @NotBlank
    private Department department;

    @NotBlank
    private AccessLevel accessLevel;

    @NotBlank
    private List<String> accessLevelEntityListUuid;

    @NotEmpty
    private List<String> rolesUuid;
}
