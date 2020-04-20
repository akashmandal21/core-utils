package com.stanzaliving.core.user.enums;

import lombok.*;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class EnumListing <T> {
	private T key;
	private String value;
}
