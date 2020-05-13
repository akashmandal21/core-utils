package com.stanzaliving.core.leadership.dto;

import java.time.LocalDate;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.estate.enums.EstateStatus;
import com.stanzaliving.core.leadership.enums.PricingStepStatus;
import com.stanzaliving.core.user.dto.Address;

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
	
	private String estateUuid;
	
	private String estateCode;
	
	private String estateName;
	
	private String estateCreatedBy;
	
	private Long cityId;
	
	private String cityName;

	private Long microMarketId;

	private String microMarketName;
	
	private Double lat;

	private Double lon;

	private Integer numberOfBeds;
	
	private Double rent;
	
	private Double opexPerAvailableBed;
	
	private Double opexPerOccupiedBed;
	
	private Double pricePerAvailableBed;
	
	private Double capexPerBed;
	
	private Double pricePerOccupiedBed;
	
	private Double margin;
	
	private LocalDate handoverDate;
	
	private PricingStepStatus pricingStepStatus;
	
	private String pricingStepStatusStr;
	
	private String pricingStepStatusColor;

	private EstateStatus estateStatus;
	private EstateStatus estateStatusColor;
	
	private Address address;

	private PricingViewEstateData pricingViewEstateData;
	private PropertyNamingDto propertyNamingDto;
	
	private String legalDocumentType;
}
