package com.stanzaliving.food.v2.preference.dto;

import com.stanzaliving.core.base.common.dto.ListingCountDto;
import com.stanzaliving.core.base.common.dto.PageResponse;
import com.stanzaliving.food.v2.category.dto.MenuCategoryResidenceRDto;
import com.stanzaliving.food.v2.common.dto.ResidenceRDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class UserPreferenceSearchRDto implements Serializable {
	private List<ListingCountDto> stats;
	private long preferenceCount;
	private long skipCount;
	private MenuCategoryResidenceRDto residenceData;
	private PageResponse<UserPreferenceRDto> preferenceData;
	
}
