package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class UserDeptLevelRoleListDto {
    @NotBlank
    private String userUuid;

    @NotNull
    private Department department;

    @NotNull
    private AccessLevel accessLevel;

    @NotEmpty
    List<String> rolesUuid;
}
