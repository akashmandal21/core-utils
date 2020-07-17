package com.stanzaliving.operations.dto.servicemix;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ResidenceFoodCategoryChangeDto {

	private String residenceId;
	private LocalDate fromDate;
	private String foodCategoryId;
	private String userId;
}