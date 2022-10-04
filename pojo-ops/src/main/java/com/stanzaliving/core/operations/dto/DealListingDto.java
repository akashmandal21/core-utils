package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.operations.enums.DealCategory;
import com.stanzaliving.core.operations.enums.DealStatus;
import com.stanzaliving.core.operations.enums.DealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class DealListingDto {
	
	private String uuid;
	private String residenceUuid;
	private String dealName;
	private String dealDisplayName;
	private DealType dealType;
	private DealStatus dealStatus;
	private DealCategory dealCategory;
	private String residenceBrand;
	private String residenceEstateGender;
	
	private boolean mgDeal;
	
	@Builder.Default
	private int bedCount = 0;
	
	private Map<String, Object> pocConfig;

	private LocalDate fromDate;
	private LocalDate toDate;
	private Date dealCreatedOn;
	private Date dealApprovedOn;
	private LocalDate dealCreatedAtVenta;
	private String statementOfWorkDocumentUrl;

	@Builder.Default
	private Integer approvedServiceMixCount = 0;

	@Builder.Default
	private Integer residentOnBoardCount = 0;

	private boolean stabilizeUnderWrite;
	private boolean annualOperatingPlan;
	private boolean monthlyForecast;

	private boolean isServiceMixV2Active;
	
	List<DealServiceMixListingDto> serviceMixDtoList;
	List<DealServiceMixListingDto> serviceMixV2DtoList;
	
}
