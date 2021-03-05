package com.stanzaliving.website.response.dto;

import java.util.HashSet;
import java.util.Set;

import com.stanzaliving.website.enums.Gender;

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
public class ResidenceDTO {

	private Integer residenceId;
	private String name;
	private String slug;
	private String gender;
	private Integer micromarketId;
	private String micromarketName;
	private String micromarketSlug;
	private String pricingPlan;
	private Integer startingPrice;
	private Integer cityId;
	private Set<ImageResponseDTO> images = new HashSet<>(0);

}
