package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.ActionFlag;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRoleDto {

    private String roleUuid;
    private Long firstResponseIn;
    private Long resolutionIn;
    private Boolean isEscalation;
    private String escalateTo;
    private Integer sequence;

}
