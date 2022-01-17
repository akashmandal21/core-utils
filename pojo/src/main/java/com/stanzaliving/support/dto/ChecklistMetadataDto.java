package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChecklistMetadataDto {
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
    private int checkListDetailsCount;
}
