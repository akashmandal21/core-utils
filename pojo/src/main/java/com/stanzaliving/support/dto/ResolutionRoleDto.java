package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResolutionRoleDto {

    private String roleUuid;

    @NotNull(message = "first response time can't be left blank.")
    @Min(1)
    private Long firstResponseIn;

    @NotNull(message = "resolutionIn can't be left blank.")
    @Min(1)
    private Long resolutionIn;

    private Boolean isEscalation;

    private String escalateTo;

    @NotNull(message = "sequence can't be left blank.")
    @Min(0)
    private Integer sequence;
}
