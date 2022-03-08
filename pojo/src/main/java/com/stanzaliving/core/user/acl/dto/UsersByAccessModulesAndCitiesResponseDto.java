package com.stanzaliving.core.user.acl.dto;

import com.stanzaliving.core.user.dto.UserProfileDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsersByAccessModulesAndCitiesResponseDto {
    
    private String accessLevelEntityUuid;
    private String accessLevelEntityName;
    private List<UserProfileDto> userProfileDtoList;
}
