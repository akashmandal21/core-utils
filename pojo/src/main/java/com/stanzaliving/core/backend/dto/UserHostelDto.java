package com.stanzaliving.core.backend.dto;

import lombok.*;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 28-Aug-2020
 */

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserHostelDto {

	private String userCode;

	private Integer hostelId;

	private String hostelName;
}