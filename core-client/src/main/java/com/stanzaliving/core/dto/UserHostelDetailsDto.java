/**
 * 
 */
package com.stanzaliving.core.dto;

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
public class UserHostelDetailsDto {

	private Integer userId;

	private String userCode;

	private String userName;

	private String mobile;

	private String email;

	private Integer currentHostelId;

	private String currentHostelName;

	private Integer originalHostelId;

	private String originalHostelName;
}