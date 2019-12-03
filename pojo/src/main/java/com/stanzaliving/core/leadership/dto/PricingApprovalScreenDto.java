package com.stanzaliving.core.leadership.dto;

import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.leadership.enums.PricingStepStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@ToString
@Setter
public class PricingApprovalScreenDto extends AbstractDto{

	private Long estateId;
	
	private String estateCode;
	
	private String estateName;
	
	private Long cityId;
	
	private String cityName;

	private Long microMarketId;

	private String microMarketName;
	
	private Double lat;

	private Double lon;

	private Integer numberOfBeds;
	
	private Double opexPerAvailableBed;
	
	private Double opexPerOccupiedBed;
	
	private Double pricePerAvailableBed;
	
	private Double capexPerAvailableBed;
	
	private Double capexPerOccupiedBed;

	private Double pricePerOccupiedBed;
	
	private Double margin;
	
	private LocalDate handoverDate;
	
	private PricingStepStatus pricingStepStatus;

	private EstateStatus estateStatus;

}
