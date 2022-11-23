package com.stanzaliving.core.residenceservice.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.utilservice.annotations.DateFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResidenceLockInDto {
	private String uuid;

	@DateFormat(message = "Move-in date is invalid | Expected format 'yyyy-dd-MM'")
	@NotBlank(message = "Start date cannot be empty or null")
	private String start;

	@DateFormat(message = "Move-in date is invalid | Expected format 'yyyy-dd-MM'")
	@NotBlank(message = "End date cannot be empty or null")
	private String end;

	@NotEmpty(message = "Allowed tenures cannot be empty or null")
	@Valid
	private List<TenureDto> tenure;

}
