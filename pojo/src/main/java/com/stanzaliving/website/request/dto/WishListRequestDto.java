package com.stanzaliving.website.request.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WishListRequestDto {
	
	private List<Integer> residenceIds;

//	private List<String> roomIds;

	// propertyLocationIdsWhereEntireFlatIsFalse
	List<Long> roomLevelPropertyLocationIds;

	// propertyLocationIdsWhereEntireFlatIsTrue
	List<Long> entireFlatPropertyLocationIds;
}
