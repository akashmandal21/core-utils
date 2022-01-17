package com.stanzaliving.core.electricity.dto;


import java.io.Serializable;
import java.util.List;

import com.stanzaliving.core.base.common.dto.PageResponse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class ElectricityBillSearchSummaryDto implements Serializable {

	private static final long serialVersionUID = -6779962402404539465L;
	private List<QuickFilterCountDto> stats;
    private PageResponse<ElectricityBillListingDto> electricityBillListingData;
}
