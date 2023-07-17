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
public class LaundryRateMasterDto implements Serializable {

	private String cityUuid;
	private String microMarketUuid;
	private String laundryRatePerKg;

}
