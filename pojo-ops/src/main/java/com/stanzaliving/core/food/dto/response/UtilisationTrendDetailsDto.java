package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.operations.enums.DealCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UtilisationTrendDetailsDto {

	private String dealUuid;
	private DealCategory dealCategory;
	private String dealCategoryName;
	private String menuCategoryId;
	private String menuName;
	private int mirCount;
	private List<UtilisationWastageDetailsDto> utilisationWastageDetailsDtoList;

}
