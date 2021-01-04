/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.stanzaliving.core.base.enums.AccessLevel;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.dto.Address;
import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.MaritalStatus;
import com.stanzaliving.core.user.enums.Nationality;
import com.stanzaliving.core.user.enums.UserType;
import com.stanzaliving.core.utilservice.annotations.Email;
import com.stanzaliving.core.utilservice.annotations.EnsureNumber;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 11-Oct-2019
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddUserRequestDto {

	@NotNull(message = "User Type is mandatory to add new user")
	private UserType userType;

	@NotNull(message = "Department is mandatory to add new user")
	private Department department;

	@NotBlank(message = "ISO Code is mandatory to add new user")
	@Size(min = 2, max = 3, message = "ISO Code must be of 2-4 characters")
	private String isoCode;

	@NotBlank(message = "Mobile is mandatory to add new user")
	@EnsureNumber(message = "Mobile Number must contain only numbers", fieldName = "mobile")
	private String mobile;

	@NotBlank(message = "Email is mandatory to add new user")
	@Email
	private String email;

	@NotBlank(message = "First Name is mandatory to add new user")
	private String firstName;

	private String middleName;

	private String lastName;

	private String secondaryEmail;

	private Boolean secondaryEmailVerified;

	private String secondaryIsoCode;

	private String secondaryMobile;

	private Boolean secondaryMobileVerified;

	private Gender gender;

	private String profilePicture;

	private LocalDate birthday;

	private MaritalStatus maritalStatus;

	private LocalDate anniversaryDate;

	private Address address;

	private Nationality nationality;

	private BloodGroup bloodGroup;
	
	private boolean signupFlow;
	
	private String roleUuid;

	private String accessLevelUuid;

}