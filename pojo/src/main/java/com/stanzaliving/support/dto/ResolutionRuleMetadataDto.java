package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleMetadataDto {
    private String complaintGroup;
    private String complaintGroupUuid;
    private String category;
    private String categoryUuid;
    private String subCategory;
    private String subCategoryUuid;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdAt;
    private Date lastUpdatedAt;
    private List<ResolutionLevelDto> resolutionLevelList;
    private SubTicketTaskDto subTicketTaskDto;
    private boolean isResolutionRuleActive;
    private String referenceUuid;
    private AccessLevel accessLevel;

}