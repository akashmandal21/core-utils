package com.stanzaliving.food.v2.category.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MenuCategoryClonePdto implements Serializable {
	private String fromCategoryId;
	private String toCategoryId;
	private String toVersionId;
}
