package com.stanzaliving.core.user.acl.request.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class RevokeUserDeptLevelRoleRequestDto extends RevokeUserDeptLevelRequestDto {

    @NotEmpty
    List<String> rolesUuid;

}
