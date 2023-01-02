package com.stanzaliving.core.food.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
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
public class DateFoodMenuDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private LocalDate date;

	private List<FoodMenuDto> foodMenuDtos;

}
