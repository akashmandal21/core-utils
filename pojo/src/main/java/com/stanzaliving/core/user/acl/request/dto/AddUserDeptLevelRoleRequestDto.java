package com.stanzaliving.core.user.acl.request.dto;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@SuperBuilder
public class AddUserDeptLevelRoleRequestDto extends AddUserDeptLevelRequestDto {

    @NotEmpty
    List<String> rolesUuid;

}
