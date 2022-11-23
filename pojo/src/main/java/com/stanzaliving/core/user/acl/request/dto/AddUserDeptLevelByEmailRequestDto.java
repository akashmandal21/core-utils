package com.stanzaliving.core.user.acl.request.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddUserDeptLevelByEmailRequestDto {

    @NotNull
    private List<String> emails;

    @NotNull
    private Department department;

    @NotNull
    private AccessLevel accessLevel;

//    @NotEmpty
    private List<String> accessLevelEntityListUuid;
}
