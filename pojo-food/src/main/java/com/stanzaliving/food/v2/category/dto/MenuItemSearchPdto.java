package com.stanzaliving.food.v2.category.dto;

import com.stanzaliving.core.food.dto.request.MenuItemSearchRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuItemSearchPdto extends MenuItemSearchRequestDto {
	private String menuCategoryId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ratingDate;
	private boolean customMapApplicable;
}
