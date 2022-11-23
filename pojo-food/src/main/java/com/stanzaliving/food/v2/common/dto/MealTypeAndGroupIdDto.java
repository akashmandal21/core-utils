package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.operations.enums.MealType;
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
public class MealTypeAndGroupIdDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private MealType mealType;

	private String mealGroup;


}
