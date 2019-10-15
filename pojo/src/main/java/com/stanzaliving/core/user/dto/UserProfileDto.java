/**
 * 
 */
package com.stanzaliving.core.user.dto;

import java.time.LocalDate;

import com.stanzaliving.core.user.enums.Gender;
import com.stanzaliving.core.user.enums.MaritalStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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
}