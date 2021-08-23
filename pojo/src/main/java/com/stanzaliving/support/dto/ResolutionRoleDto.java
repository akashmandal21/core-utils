package com.stanzaliving.support.dto;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.support.enums.ActionFlag;
import com.stanzaliving.support.enums.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRoleDto {
    @NotNull(message = "role uuid can't be left blank.")
    private String roleUuid;
    @NotNull(message = "first response time can't be left blank.")
    private Long firstResponseIn;
    @NotNull(message = "resolutionIn can't be left blank.")
    private Long resolutionIn;
    @NotNull(message = "isEscalation can't be left blank.")
    private Boolean isEscalation;
    private String escalateTo;
    @NotNull(message = "sequence can't be left blank.")
    private Integer sequence;

}
