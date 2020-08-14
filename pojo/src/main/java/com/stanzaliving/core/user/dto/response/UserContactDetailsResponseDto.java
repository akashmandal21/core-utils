package com.stanzaliving.core.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = { "userId" })
public class UserContactDetailsResponseDto {

	private String userId;

	private String email;

	private String mobile;

	private String name;

}