package com.stanzaliving.core.user.dto.client.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 27-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GSuiteUserPhone {
	private String value;

	private boolean primary;

	private String type;

	private String customType;
}
