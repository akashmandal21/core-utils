package com.stanzaliving.operations.dto.servicemix;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Meal extends BooleanService {
	private int days;
	private String startTime;
	private String endTime;
}
