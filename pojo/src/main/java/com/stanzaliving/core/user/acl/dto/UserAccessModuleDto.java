package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.base.enums.AccessModule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccessModuleDto {
    
    private AccessModule accessModule;
    private String accessModuleName;
}
