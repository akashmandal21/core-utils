package com.stanzaliving.core.electricity.dto;

import java.util.Date;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.electricity.constants.ReadingUnitType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, exclude = { "image" })
public class ElectricityReadingDto extends AbstractDto {

	private static final long serialVersionUID = -1670129756539320124L;

	private Double reading;

	private Date time;

	private String image;

	private ReadingUnitType unitType;
	
	private String unitTypeName;

	private boolean mandatoryDay;

}