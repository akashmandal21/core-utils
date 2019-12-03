/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.user.acl.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 02-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OpsDashboardDataDto {

	@NotNull(message = "Access Level is Mandatory")
	private AccessLevel accessLevel;

	@NotBlank(message = "City Id is Mandatory")
	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	private int numberOfBeds;

	private int expectedBeds;
}