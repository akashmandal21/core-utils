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
public class UsersByAccessModulesAndCitiesRequestDto {

    private List<AccessModule> accessModuleList;
    private List<String> cityUuids;
    private AccessLevel accessLevel;
    private String searchText;
}
