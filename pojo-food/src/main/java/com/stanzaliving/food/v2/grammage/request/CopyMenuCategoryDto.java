package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.food.v2.grammage.category.constants.GrammageCopyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class CopyMenuCategoryDto {

	@NotBlank(message = "Select menuCategory to copy from")
	private String fromMenuCategoryId;

	@NotBlank(message = "Select menuCategory to copy to")
	private String toMenuCategoryId;

	@NotEmpty(message = "Grammage type selection is mandatory for copying")
	private List<GrammageCopyType> copyTypeList;

}
