/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class RoleRequirementDto {

	@NotBlank(message = "Role is Mandatory for People Requirement")
	private String roleId;

	private String roleName;

	@Min(value = 0, message = "Requirement cannot be negative")
	private int requirement;

	private int signedOffRequirement;

	private Date lastSignedOffTime;

}