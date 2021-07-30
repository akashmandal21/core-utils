package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleDto {

    private TicketType ticketType;
    private String primaryReferenceUUID;
    private AccessLevel accessLevel;
    private String referenceUUID;
    private String roleUUID;
    private Long firstResponseIn;
    private Long resolutionIn;
    private Boolean isEscalation;
    private Long escalationIn;
    private String escalateToRole;
    private Integer sequence;

}
