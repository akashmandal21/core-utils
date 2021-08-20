package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.base.common.dto.ListingDto;
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
public class OrderedListingDto extends ListingDto {
	private Integer sequence;

	public static OrderedListingDto of(String id, String name, Integer sequence) {
		return OrderedListingDto.builder()
				.id(id)
				.name(name)
				.sequence(sequence)
				.build();
	}

}
