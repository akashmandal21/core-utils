package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleMetadataDto {
    private String complaintGroup;
    private String complaintGroupUuid;
    private String category;
    private String categoryUuid;
    private Set<SubCategoryDto> subCategoryDtoList;
    private Set<SubTicketTaskDto> subTicketTaskDtoList;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdAt;
    private Date lastUpdatedAt;
    private Set<ResolutionLevelDto> resolutionLevelList;
    private boolean isResolutionRuleActive;
    private Set<LocationDto> locationDto;
    private String groupUuid;

}