package com.stanzaliving.core.operations.dto.serviceset.internet;

import com.stanzaliving.core.operations.enums.Frequency;
import com.stanzaliving.core.operations.enums.InternetDataUnit;
import com.stanzaliving.core.operations.enums.InternetSpeedUnit;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetBrandDetailDto {

	private String componentId;

	private double speed;

	private InternetSpeedUnit speedUnit;

	private double data;

	private InternetDataUnit dataUnit;

	private Frequency frequency;
	
}