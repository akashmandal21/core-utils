package com.stanzaliving.core.residenceservice.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OccupancyFunnelDto {
    private String label;
    private List<OnboardedFunnelDto> data;
}

