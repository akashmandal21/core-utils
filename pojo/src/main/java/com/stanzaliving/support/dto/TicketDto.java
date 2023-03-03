package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.Priority;
import com.stanzaliving.support.enums.Source;
import com.stanzaliving.support.enums.Status;
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
public class TicketDto {

    private String description;
    private String statusUuid;
    private String statusName;
    private String complaintGroupUuid;
    private String complaintGroupName;
    private String categoryUuid;
    private String categoryName;
    private String subCategoryUuid;
    private String subCategoryName;
    private String assignedToUserUuid;
    private String assignedTo;
    private Priority priorityDetail;
    private Long mergedTicketId;
    private String mergedByUuid;
    private String mergedBy;
    private Date closedAt;
    private Date slaTime;
    private String designation;
    private Source source;
    private Date resolvedAt;
    private Boolean removeSatisfied;
    private String resolvedByUuid;
    private String resolvedBy;
    private Date reopenedAt;
    private String ticketId;
    private String ticketUuid;
    private String subTicketId;
    private String subTicketUuid;
    private String taskTypeUuid;
    private String taskTypeDetail;
    private String teamUuid;
    private String teamDetail;
    private Boolean markForDelay;
    private String reason;
    private Date tentativeDate;
    private String userUuid;
    private String userName;
    private String residenceUuid;
    private String residenceName;
    private String micromarketName;
    private String micromarketUuid;
    private String cityUuid;
    private String cityName;
    private String zoneUuid;
    private String zoneName;
    private String userCode;
    private String roomNumber;
    private String mobile;
    private Date createdAt;
    private String createdBy;
    private String complaintGroupImage;
    private TicketChipColorDto ticketChipColorDto;
    private List<TicketDto> subTickets;
    private Integer version;
    private String assignedToRoleUuid;
    private String expandableBarColor;
    private Boolean satisfied;
    private String slaMessage;
}
