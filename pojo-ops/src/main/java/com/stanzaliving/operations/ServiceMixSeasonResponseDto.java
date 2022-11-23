package com.stanzaliving.operations;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceMixSeasonResponseDto {
    private String residenceUuid;
    private List<SeasonResponseDto> seasonResponseDtoList;
}
