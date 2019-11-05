package com.stanzaliving.core.estate.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LandlordAnalysisDto {

	private List<LandlordInfoDto> landlordInfoDtos;

	private String commentsOnKeyPositives;

	private String commentsOnKeyNegatives;
	private String landlordCount;
	private String landlordKeyNegative;
	private String landlordKeyPositive;
	
	private String pocName;
	private String pocNumber;
	private String pocEmail;
	
	
	private List<String> landlordKeyDocuments;
	private List<String> landlordKeyNegatives;
	private List<String> landlordKeyPositives;
	

}
