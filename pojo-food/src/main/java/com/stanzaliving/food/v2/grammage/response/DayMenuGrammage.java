package com.stanzaliving.food.v2.grammage.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 05-Jun-2021
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DayMenuGrammage {

	private LocalDate menuDate;

	private List<MenuOptionGrammage> menuOptions;
}
