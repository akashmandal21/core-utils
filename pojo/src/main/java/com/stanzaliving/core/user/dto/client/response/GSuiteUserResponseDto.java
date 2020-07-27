package com.stanzaliving.core.user.dto.client.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 27-July-2020
 */


@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GSuiteUserResponseDto {
	private String id;

	private String primaryEmail;

	private List<GSuiteUserPhone> phones;

	private boolean isAdmin;

	private boolean isDelegatedAdmin;

	private LocalDateTime deletionTime;

	private boolean suspended;

	private boolean archived;

	private String recoveryEmail;

	private String recoveryPhone;

}
