package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stanzaliving.support.enums.Priority;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketCardDto {

    private String ticketId;
    private String ticketUuid;
    private String statusName;
    private String statusUuid;
    private Date createdAt;
    private Date slaTime;
    private Date totalSlaTime;
    private String complaintGroupUuid;
    private String complaintGroupName;
    private String categoryUuid;
    private String categoryName;
    private String subCategoryUuid;
    private String subCategoryName;
    private String userName;
    private String userCode;
    private String residenceName;
    private String roomNumber;
    private String description;
    private String assignedToUserUuid;
    private String assignedTo;
    private String residenceUuid;
    private String micromarketUuid;
    private String cityUuid;
    @JsonProperty("isPrimary")
    private boolean isPrimary;
    private TicketChipColorDto ticketChipColorDto;
    private String expandableBarColor;
    private String designation;
    private Date resolvedAt;
    private Date closedAt;
    private Priority priority;
    private String slaMessage;
    private boolean canAddDescription;
}

