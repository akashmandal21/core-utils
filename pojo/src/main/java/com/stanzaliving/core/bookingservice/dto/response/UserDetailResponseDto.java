/**
 * 
 */
package com.stanzaliving.core.bookingservice.dto.response;

import com.stanzaliving.core.bookingservice.dto.PhoneNumberDto;
import lombok.Builder;
import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
public class UserDetailResponseDto {

	private String userCode;
	private PhoneNumberDto mobile;
	private String email;
	private String profilePicture;
	private String firstName;
	private String lastName;
	private String birthday;
}
