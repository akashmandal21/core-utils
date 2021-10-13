package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExitDetailListResponseDto {

    private List<ExitDetailSummaryDto> exitDetailSummaryDto;

    private ExitDetailsResponseDto exitDetails;

}
