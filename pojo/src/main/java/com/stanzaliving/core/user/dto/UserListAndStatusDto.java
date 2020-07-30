package com.stanzaliving.core.user.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Set;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 29-July-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserListAndStatusDto {
	private Set<String> activeUsers;

	private Set<String> inActivesUsers;
}
