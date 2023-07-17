package com.stanzaliving.core.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZHExitDetailResponseDto {

    private ExitDetailListResponseDto exitDetailListResponseDto;
    private LedgerOverviewDto ledgerOverviewDto;

}
