package com.stanzaliving.core.utility.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class MeterAddDto {

	@NotBlank(message = "Meter Category Cannot be blank")
	private String categoryId;

	@NotBlank(message = "Meter Number Cannot be blank")
	private String number;

	@NotNull(message = "Start reading is mandatory")
	@Min(value = 0, message = "Meter reading cannot be negative")
	private Double reading;

	@NotBlank(message = "Meter image is mandatory")
	private String image;
}