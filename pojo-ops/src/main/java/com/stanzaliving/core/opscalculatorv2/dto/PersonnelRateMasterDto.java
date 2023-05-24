package com.stanzaliving.core.opscalculatorv2.dto;

import java.io.Serializable;

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
public class PersonnelRateMasterDto implements Serializable {

	private String cityUuid;
	private String microMarketUuid;
	private String hk12HrRate;
	private String sgRate;
	private String rcRate;
	private String jrRcRate;
	private String releiverJrRcRate;

}
