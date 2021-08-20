package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class CategoryApprovedMenuDto implements Serializable {
	private List<MenuCategoryResidenceRDto> toBeDeleted;
	private MenuCategoryResidenceRDto toBeAdded;
}
