package com.stanzaliving.operations.dto.servicemix;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResidenceFoodCategoryChangeDto {
	String residenceId;
	LocalDate fromDate;
	String foodCategoryId;
	String userId;
}
