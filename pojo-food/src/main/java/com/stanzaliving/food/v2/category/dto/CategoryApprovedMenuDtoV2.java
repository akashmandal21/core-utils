package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CategoryApprovedMenuDtoV2 implements Serializable {
	private List<MenuCategoryResidenceRDto> toBeDeleted;
	private List<MenuCategoryResidenceRDto> toBeAdded;
	private LocalDate startDate;
	private LocalDate endDate;
}
