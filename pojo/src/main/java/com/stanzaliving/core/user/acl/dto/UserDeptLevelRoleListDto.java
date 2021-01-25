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
    @NotBlank(message = "userUuid Can not be blank")
    private String userUuid;

    @NotNull(message = "department can not be null")
    private Department department;

    @NotNull(message = "access level can not be null")
    private AccessLevel accessLevel;

    @NotEmpty(message = "roles Uuid should not be empty array")
    List<String> rolesUuid;
}
