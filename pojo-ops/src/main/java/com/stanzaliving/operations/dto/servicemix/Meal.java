package com.stanzaliving.operations.dto.servicemix;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Meal extends BooleanService {
	private int days;
	private String startTime;
	private String endTime;
}
