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
public class LedgerOverviewDto {
    private List<CardListingDto> ledgerOverview;
    private CardWithSubTitleDto duesDetail;
}
