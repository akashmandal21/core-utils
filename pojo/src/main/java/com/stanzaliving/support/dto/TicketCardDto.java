package com.stanzaliving.support.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    private Long ticketId;
    private String ticketUuid;
    private String statusDetail;
    private Date createdAt;
    private Date slaTime;
    private String categoryUuid;
    private String categoryDetail;
    private String subCategoryUuid;
    private String subCategoryDetail;
    private String userName;
    private String userCode;
    private String residenceName;
    private String roomNumber;
    private String description;
    private String assignedToUuid;
    private String assignedTo;
    private String residenceUuid;
    private String micromarketUuid;
    private String cityUuid;
    @JsonProperty("isPrimary")
    private boolean isPrimary;
    private TicketChipColorDto ticketChipColorDto;

}

