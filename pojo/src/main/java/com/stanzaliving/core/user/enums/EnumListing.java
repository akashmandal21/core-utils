package com.stanzaliving.core.user.enums;

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
public class EnumListing<T> {

	private T key;
	private String value;

	public static <T> EnumListing<T> of(T key, String value) {
		return new EnumListing<>(key, value);
	}
}