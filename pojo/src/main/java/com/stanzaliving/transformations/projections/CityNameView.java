package com.stanzaliving.transformations.projections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CityNameView {

	private Long id;

	private String uuid;

	private String cityName;

	private Long stateId;

	private String zoneUuid;

}