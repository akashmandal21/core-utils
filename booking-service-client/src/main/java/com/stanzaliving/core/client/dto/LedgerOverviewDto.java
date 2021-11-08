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
public class LedgerOverviewDto {
    private List<CardListingDto> ledgerOverview;
    private CardWithSubTitleDto duesDetail;
}
