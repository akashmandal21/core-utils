package com.stanzaliving.core.food.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class ItemSubCategoryDto implements Serializable {

	public static final long serialVersionUID = 2938239L;

	private String subCategoryId;

	private String subCategoryName;
	
	private Integer sequence;

	private String categoryId;

	private String categoryName;

}