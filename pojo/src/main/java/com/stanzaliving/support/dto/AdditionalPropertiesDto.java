package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.Priority;
import com.stanzaliving.support.enums.Source;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalPropertiesDto {

    private String description;
    private String statusUuid;
    private String statusDetail;
    private String complaintGroupUuid;
    private String complaintGroupDetail;
    private String categoryUuid;
    private String categoryDetail;
    private String subCategoryUuid;
    private String subCategoryDetail;
    private String assignedToUuid;
    private String assignedTo;
    private Priority priorityDetail;
    private Long mergedTicketId;
    private String mergedByUuid;
    private String mergedBy;
    private Date closedAt;
    private Date slaTime;
    private Source source;
    private Date resolvedAt;
    private String resolvedByUuid;
    private String resolvedBy;
    private Date reopenedAt;
    private Long ticketId;
    private String ticketUuid;
    private Long subTicketId;
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
    private String complaintGroupImage;
    private TicketChipColorDto ticketChipColorDto;
    private List<AdditionalPropertiesDto> subTickets;
    private Integer version;
    private String currentTicketLevelUuid;
}
