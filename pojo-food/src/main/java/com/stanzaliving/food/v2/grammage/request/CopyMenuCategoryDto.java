package com.stanzaliving.food.v2.grammage.request;

import com.stanzaliving.food.v2.grammage.category.constants.GrammageCopyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public class CopyMenuCategoryDto {

	@NotBlank(message = "From menuCategory is empty")
	private String fromMenuCategoryId;
	@NotBlank(message = "To menuCategory is empty")
	private String toMenuCategoryId;

	private List<GrammageCopyType> grammageCopyTypeList;

}
