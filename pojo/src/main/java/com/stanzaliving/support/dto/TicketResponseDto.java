package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.Priority;
import com.stanzaliving.support.enums.Source;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketResponseDto {

    private String subCategoryUuid;

    private String subCategory;

    private String categoryUuid;

    private String category;

    private String complaintGroupUuid;

    private String complaintGroup;

    private Date slaTime;

    private String chipColor;

    private String description;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private UserResidenceDto raisedFor;

    private String assignedToUuid;

    private String assignedTo;

    private String status;

    private String statusUuid;

    private Long id;

    private String uuid;

    private Source source;

    private Priority priority;

}
