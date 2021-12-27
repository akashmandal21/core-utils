package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalTime;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleDto {
    private String uuid;
    private String complaintGroupUuid;
    private String complaintGroup;
    private String categoryUuid;
    private String category;
    private String subCategoryUuid;
    private String subCategory;
    private String subTicketTaskUuid;
    private String subTicketTask;
    private TicketType ticketType;
    private String primaryReferenceUuid;
    private AccessLevel accessLevel;
    private String referenceUuid;
    private String roleUuid;
    private Long firstResponseIn;
    private Long resolutionIn;
    private Boolean isEscalation;
    private String escalateTo;
    private Integer sequence;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
    private Boolean isActive;
    private String groupUuid;
    private LocalTime StartTime;
    private LocalTime EndTime;
    private LocalTime BufferTime;
}
