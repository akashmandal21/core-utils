/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.operations.enums.HiringStatus;
import com.stanzaliving.core.user.enums.Designation;
import com.stanzaliving.core.user.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 09-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OpsUserDto {

	private String userId;

	@NotBlank(message = "First Name is mandatory for user")
	private String firstName;

	private String middleName;

	private String lastName;

	@NotBlank(message = "ISO Code is mandatory for user")
	private String isoCode;

	@NotBlank(message = "Mobile is mandatory for user")
	private String mobile;

	@NotBlank(message = "Email is mandatory for user")
	private String email;

	private Gender gender;

	private Designation designation;

	private String primaryCity;

	private HiringStatus hiringStatus;

	private boolean assigned;

	private String role;

	private int numberOfBeds;

	private double score;

	private List<UserRoleListingDto> assignedRoles;

}