package com.stanzaliving.core.user.acl.request.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddUserDeptLevelRoleRequestDto extends AddUserDeptLevelRequestDto {

    @NotEmpty
    List<String> rolesUuid;

}
