package com.stanzaliving.core.dto;

import lombok.*;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 28-Aug-2020
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserHostelDto {
	private String userCode;

	private Integer hostelId;

	private String hostelName;
}
