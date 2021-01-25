package com.stanzaliving.core.user.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;


/**
 *
 * @author piyush srivastava<piyush.srivastava@stanzaliving.com/>
 *
 * @date 14-Apr-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserManagerDetailsDto {

	private String managerId;

	private String firstName;

	private String middleName;

	private String lastName;
}
