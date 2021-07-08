package com.stanzaliving.food.v2.preference.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.DayOfWeek;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class DayWisePreferenceDto implements Serializable {
	private DayOfWeek day;
	private boolean enabled;
	private String locationId;
}
