package com.stanzaliving.core.operations.dto;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.estate.enums.EstateGender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class CopyToResidenceListingDto {
	
	private String residenceId;
	private String residenceName;
	
	private String cityId;
	private String cityName;
	
	
	private String micromarketId;
	private String micromarketName;
	
	
	private ResidenceBrand brandName;
	private EstateGender estateGender;
	
}
