package com.stanzaliving.core.electricity.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
@ToString(exclude = "image")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EMeterAddDto {

	@NotBlank(message = "Meter Category Cannot be blank")
	private String categoryId;

	@NotBlank(message = "Meter Sub Category Cannot be blank")
	private String subCategoryId;

	@NotBlank(message = "Meter Number Cannot be blank")
	private String number;

	@NotNull(message = "Start reading is mandatory")
	@Min(value = 0, message = "Meter reading cannot be negative")
	private Double reading;

	@NotBlank(message = "Meter image is mandatory")
	private String image;

	@NotNull(message = "Meter Type is mandatory")
	private MeterType meterType;

	@NotNull(message = "Reading Unit Type is mandatory")
	private ReadingUnitType unitType;
}