package com.stanzaliving.core.user.acl.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.enums.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccessLevelIdsByRoleNameDto {
    
    @NotNull(message = "department can not be null")
    private Department department;

    @NotNull(message = "role name can not be null")
    private String roleName;

    @NotEmpty(message = "acess level uuids should not be an empty array")
    List<String> accessLevelId;
}
