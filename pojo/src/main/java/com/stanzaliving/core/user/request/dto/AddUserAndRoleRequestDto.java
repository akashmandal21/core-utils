package com.stanzaliving.core.user.request.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddUserAndRoleRequestDto extends AddUserRequestDto {

    private Department roleDepartment;

    private List<String> rolesUuid;

    private AccessLevel accessLevel;

    private List<String> accessLevelEntityListUuid;

}
