/**
 * 
 */
package com.stanzaliving.core.base.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 30-Sep-2019
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUser {

	private String userId;

	private String firstName;

	private String lastName;
}