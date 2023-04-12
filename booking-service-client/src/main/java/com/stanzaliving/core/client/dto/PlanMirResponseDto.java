package com.stanzaliving.core.client.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PlanMirResponseDto {
    private String residenceUuid;
    private List<PlanMirDto> planMir;
}
