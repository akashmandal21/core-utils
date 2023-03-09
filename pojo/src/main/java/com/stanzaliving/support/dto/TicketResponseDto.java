package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.TicketRaisedForType;
import com.stanzaliving.support.enums.Priority;
import com.stanzaliving.support.enums.Source;
import com.stanzaliving.support.enums.TicketSource;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TicketResponseDto {

    private String subCategoryUuid;

    private String subCategory;
    private String subCategoryDisplayName;

    private String categoryUuid;

    private String category;
    private String categoryDisplayName;

    private String complaintGroupUuid;

    private String complaintGroup;

    private Date slaTime;

    private String chipColor;

    private String description;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private UserResidenceDto raisedFor;

    private UserResidenceDto createdByDetail;

    private TicketRaisedForType raisedForType;

    private String assignedToUuid;

    private String assignedTo;

    private String status;

    private String statusUuid;

    private Long id;

    private String uuid;

    private Source source;

    private Priority priority;

    private String residenceUuid;

    private TicketSource ticketSource;

    private String currentResolutionLevelUuid;

    private String ticketId;

    private Integer version;

    private Date alfredSlaTime;

}
