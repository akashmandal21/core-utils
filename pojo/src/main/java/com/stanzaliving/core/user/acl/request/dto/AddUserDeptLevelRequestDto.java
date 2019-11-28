package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public class AddUserDeptLevelRequestDto {

    @NotBlank
    private String userUuid;

    @NotBlank
    private Department department;

    @NotBlank
    private AccessLevel accessLevel;

    @NotEmpty
    private List<String> accessLevelEntityListUuid;

    public AddUserDeptLevelRequestDto(AddUserDeptLevelRoleRequestDto addUserDeptLevelRoleDto) {
        this.userUuid = addUserDeptLevelRoleDto.getUserUuid();
        this.department = addUserDeptLevelRoleDto.getDepartment();
        this.accessLevel = addUserDeptLevelRoleDto.getAccessLevel();
        this.accessLevelEntityListUuid = addUserDeptLevelRoleDto.getAccessLevelEntityListUuid();
    }

}
