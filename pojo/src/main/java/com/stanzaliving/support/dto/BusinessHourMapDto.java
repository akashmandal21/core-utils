package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourMapDto {
    private String uuid;
    private String complaintGroupUuid;
    private String complaintGroup;
    private String categoryUuid;
    private String category;
    private String subCategoryUuid;
    private String subCategory;
    private String primaryReferenceUuid;
    private AccessLevel accessLevel;
    private String referenceUuid;
    private LocalTime StartTime;
    private LocalTime EndTime;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
    private Boolean isActive;
    private String groupUuid;
}
