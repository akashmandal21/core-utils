/**
 * 
 */
package com.stanzaliving.core.user.dto;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.user.enums.BloodGroup;
import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.MaritalStatus;
import com.stanzaliving.core.user.enums.Nationality;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author naveen
 *
 * @date 09-Oct-2019
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDto extends UserDto {

	private String firstName;

	private String middleName;

	private String lastName;

	private String secondaryEmail;

	private Department department;

	private boolean secondaryEmailVerified;

	private String secondaryIsoCode;

	private String secondaryMobile;

	private boolean secondaryMobileVerified;

	private Gender gender;

	private String profilePicture;

	private LocalDate birthday;

	private MaritalStatus maritalStatus;

	private LocalDate anniversaryDate;

	private Address address;
	
	private Nationality nationality;
	
	private BloodGroup bloodGroup;
	
}