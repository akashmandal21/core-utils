package com.stanzaliving.core.utility.dto;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class MeterDto extends AbstractDto {

	private static final long serialVersionUID = -2726986992417298162L;

	private String categoryId;
	
	private String categoryName;
	
	@NotBlank(message = "Meter Number Cannot be blank")
	private String number;
	
	private Date from;
	
	private Date deactivatedOn;
	
	private ReadingDto lReading;
	
	private ReadingDto oReading;
	
	private Double unitConsumed;
	
	private Double average;

	private List<ReadingDto> readings;
}