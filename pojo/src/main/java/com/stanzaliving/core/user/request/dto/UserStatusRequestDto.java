package com.stanzaliving.core.user.request.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 17-Apr-2020
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
@Getter
@Setter
public class UserStatusRequestDto {

	private String userId;

	private Boolean status;
}