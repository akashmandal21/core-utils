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
public class ApartmentElectricityBillSummaryDto implements Serializable {

	private static final long serialVersionUID = -5273206905008845543L;
	private List<QuickFilterCountDto> stats;
	private ApartmentElectricityBillListingHeaderDto headerDto;
    private PageResponse<ApartmentElectricityBillListingDto> apartmentElectricityBillListingDto;
}
