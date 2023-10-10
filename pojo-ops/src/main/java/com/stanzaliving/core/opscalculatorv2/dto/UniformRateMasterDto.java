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
public class UniformRateMasterDto implements Serializable {

	private String cityUuid;
	private String microMarketUuid;

	private String rcBlueTShirtSetPerYear;
	private String rcBlueTShirtRate;

	private String rcSweatShirtSetPerYear;
	private String rcSweatShirtRate;

	private String rcVaccinatedBadgeSetPerYear;
	private String rcVaccinatedBadgeRate;

	private String hkKurtaPantSetPerYear;
	private String hkKurtaPantRate;

	private String hkApronSetPerYear;
	private String hkApronRate;

	private String hkSweaterSetPerYear;
	private String hkSweaterRate;

	private String hkVaccinatedBadgeSetPerYear;
	private String hkVaccinatedBadgeRate;

	private String ftcGrayTShirtSetPerYear;
	private String ftcGrayTShirtRate;

	private String ftcSweaterSetPerYear;
	private String ftcSweaterRate;

	private String ftcVaccinatedBadgeSetPerYear;
	private String ftcVaccinatedBadgeRate;

}
