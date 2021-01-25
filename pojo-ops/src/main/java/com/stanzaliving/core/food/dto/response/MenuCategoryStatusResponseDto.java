package com.stanzaliving.core.food.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuCategoryStatusResponseDto {

	private LocalDate startDate;

	private LocalDate endDate;

	private String categoryName;

	private String micromarketName;

	@Builder.Default
	private boolean menuCreated = true;

}
