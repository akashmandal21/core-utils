package com.stanzaliving.core.operations.dto.serviceset.laundry;

import java.time.DayOfWeek;
import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.BrandComponentDto;

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
public class LaundryBrandDetailDto extends BrandComponentDto {

	private List<DayOfWeek> days;

	private boolean available;
	
	private boolean availableAsVas;

}