package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessHourResponseDto {

    private Set<ComplaintGroupDto> complaintGroupDtoSet;
    private Set<CategoryDto> categoryDtoSet;
    private Set<SubCategoryDto> subCategoryDtoList;
    private String createdBy;
    private String lastUpdatedBy;
    private Date createdAt;
    private Date lastUpdatedAt;
    private Set<LocationDto> locationDto;
    private String groupUuid;
    private LocalTime StartTime;
    private LocalTime EndTime;
    private LocalTime BufferTime;
  //  private boolean isActive;

}
