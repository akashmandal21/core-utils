package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.AccessModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentLevelAccessModulesDto {
    
    private AccessModule accessModule;
    private String accessModuleName;
    private String roleUuid;
    private String userDepartmentLevelUuid;
    private AccessLevel accessLevel;
    private Map<String, String> accessLevelEntityUuidNameMap;
    private boolean isLeadTransferApplicable;
}
