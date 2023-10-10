package com.stanzaliving.food.v2.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class WeeklyMenuPDto implements Serializable {
	private static final long serialVersionUID = 1635296868115644218L;
	private String menuId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	private String categoryGroupId;
	private String categoryId;
}
