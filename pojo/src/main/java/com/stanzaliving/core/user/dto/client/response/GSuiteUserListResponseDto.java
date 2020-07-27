package com.stanzaliving.core.user.dto.client.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class GSuiteUserListResponseDto {
	private List<GSuiteUserResponseDto> users;

	private String nextPageToken;
}
