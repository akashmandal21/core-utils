package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.AccessModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAccessModuleAccessLevelRequestDto {

    private AccessModule accessModule;
    private AccessLevel accessLevel;
    private List<String> accessLevelEntityUuids;
    private String userUuid;
    private String roleUuid;
    private String userDepartmentLevelUuid;
}
