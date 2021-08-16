package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRuleAddDto {
    private List<String> primaryReferenceUuid;
    private TicketType ticketType;
    private List<String> city;
    private List<String> micromarket;
    private List<String> residence;
    private List<ResolutionRoleDto> resolutionRole;

}

