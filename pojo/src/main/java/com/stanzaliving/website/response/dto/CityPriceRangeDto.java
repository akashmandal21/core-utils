package com.stanzaliving.website.response.dto;

import java.io.Serializable;

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
public class CityPriceRangeDto implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer minPrice;
	
	Integer maxPrice;
}
