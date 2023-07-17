package com.stanzaliving.core.electricity.dto;


import java.util.Map;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.MeterType;
import com.stanzaliving.core.electricity.constants.ReadingUnitType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ElectricityMeterPrepaidDto extends AbstractDto {

	private static final long serialVersionUID = -2517785139088275195L;

	private String categoryId;

	private String categoryName;

	private String subCategoryId;

	private String subCategoryName;

	private MeterType meterType;
	
	private String meterNumber;
	
	private String roomNumber;
	
	private Double currentBalance;
	
	private Double daysLeft;
	
	private Boolean rechargeRequired;
	
	private Double balanceAfterLastSuccessfulRecharge;
	
	private Double balanceConsumedSinceLastRecharge;
	
	private ReadingUnitType readingUnitType;

	private String readingUnitTypeName;
	
	private ElectricityReadingDto lReading;

	private ElectricityReadingDto oReading;
	
	private PrepaidMeterConsumptionSummaryDto dailyConsumptionSummaryDto;
	
	private PrepaidMeterRechargeSummaryDto rechargeSummaryDto;
	
	private Map<String, String> tags;
	
	private Double blendedUnitRate;
	
	private Double avgUnitConsumedPerDay;

}