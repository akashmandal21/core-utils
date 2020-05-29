package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

import com.stanzaliving.core.food.enums.TiffinOrderType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActiveTiffinDto {

	private LocalDate date;

	private Boolean status;

	private TiffinOrderType tiffinOrderType;

	private String collegeName;

	private Boolean orderExists;

	private Boolean isModificationAllowed;

	private TiffinOrderType[] orderTypes;

}
