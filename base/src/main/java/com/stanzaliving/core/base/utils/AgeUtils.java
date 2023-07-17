package com.stanzaliving.core.base.utils;

import java.time.LocalDate;
import java.time.Period;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AgeUtils {

	public Integer calculateAge(LocalDate birthDate) {

		LocalDate currentDate = LocalDate.now();

		if ((birthDate != null)) {
			return Period.between(birthDate, currentDate).getYears();
		} else {
			return null;
		}
	}
}
