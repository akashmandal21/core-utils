package com.stanzaliving.core.opscalculator.v2.dto;

import java.util.Map;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;

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
public class PersonnelRateMasterDto {

	private String cityUuid;
	private String microMarketUuid;
	private String hk12HrRate;
	private String sgRate;
	private String rcRate;
	private String jrRcRate;
	private String releiverJrRcRate;

}
