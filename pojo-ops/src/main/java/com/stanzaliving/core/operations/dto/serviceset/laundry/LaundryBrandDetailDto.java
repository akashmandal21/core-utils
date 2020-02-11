package com.stanzaliving.core.operations.dto.serviceset.laundry;

import java.time.DayOfWeek;
import java.util.List;

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
public class LaundryBrandDetailDto {

	private String componentId;

	private boolean available;

	private boolean availableAsVas;

	private List<DayOfWeek> days;
}