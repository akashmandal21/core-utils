package com.stanzaliving.core.client.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExitDetailListResponseDto {

    private List<ExitDetailSummaryDto> exitDetailSummaryDto;

    private ExitDetailsResponseDto exitDetails;

}
