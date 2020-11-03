package com.stanzaliving.core.electricity.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

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
public class ElectricityMeterDto extends AbstractDto {

	private static final long serialVersionUID = -7575068647325350104L;

	private String categoryId;

	private String categoryName;

	private String subCategoryId;

	private String subCategoryName;

	@NotBlank(message = "Meter Number Cannot be blank")
	private String number;

	private Date from;

	private Date deactivatedOn;

	private ElectricityReadingDto lReading;

	private ElectricityReadingDto oReading;

	private Double unitConsumed;

	private Double average;
	
	private ReadingUnitType readingUnitType;

	private List<ElectricityReadingDto> readings;

	private MeterType meterType;

}
