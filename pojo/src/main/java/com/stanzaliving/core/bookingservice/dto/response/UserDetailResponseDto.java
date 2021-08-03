/**
 * 
 */
package com.stanzaliving.core.bookingservice.dto.response;

import java.util.Date;

import com.stanzaliving.core.bookingservice.dto.PhoneNumberDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailResponseDto {

	private String userCode;
	private PhoneNumberDto mobile;
	private String email;
	private String profilePicture;
	private String firstName;
	private String lastName;
	private String birthday;
	private String gender;
}
