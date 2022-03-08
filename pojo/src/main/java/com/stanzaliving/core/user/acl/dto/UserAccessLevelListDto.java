package com.stanzaliving.core.user.acl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccessLevelListDto {
    
    private String userUuid;
    private List<String> accessLevelIds;
}
