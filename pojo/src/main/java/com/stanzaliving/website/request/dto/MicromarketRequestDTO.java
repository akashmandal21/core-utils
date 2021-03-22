package com.stanzaliving.website.request.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder.Default;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MicromarketRequestDTO {

	private int micromarketId;
	private int cityId;
	private String name;
	private double latitude;
	private double longitude;
	private String phone;
	private List<MicromarketAliasDTO> micromarketAlias;
	@Default
	private Boolean leadQualificationForm=false;
	private List<AttributeDto> attributeDto;

}
