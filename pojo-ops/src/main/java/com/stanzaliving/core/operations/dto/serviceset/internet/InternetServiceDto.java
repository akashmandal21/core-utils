package com.stanzaliving.core.operations.dto.serviceset.internet;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.ServiceMetadata;
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
public class InternetServiceDto extends ServiceMetadata {

	private List<InternetResidenceDto> internetResidenceDtos;

	private List<Frequency> frequencies;

	private List<InternetDataUnit> dataUnits;

	private List<InternetSpeedUnit> SpeedUnits;
}