/**
 * 
 */
package com.stanzaliving.core.food.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 28-Oct-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserResidenceDetailDto {

	private String userId;

	private String userCode;

	private String userName;

	private String mobile;

	private String email;

	private String currentResidenceId;

	private String currentResidenceName;

	private String originalResidenceId;

	private String originalResidenceName;
}