package com.stanzaliving.website.response.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
public class ResidenceDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
	
	@Builder.Default
	private Set<ImageResponseDTO> images = new HashSet<>(0);
}
