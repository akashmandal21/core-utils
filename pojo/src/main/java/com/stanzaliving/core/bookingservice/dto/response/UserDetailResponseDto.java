/**
 * 
 */
package com.stanzaliving.core.bookingservice.dto.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author raj.kumar
 *
 */
@Data
@Builder
public class UserDetailResponseDto {

	private String name;
	private String userCode;
	private String phone;
	private String email;
	private String profilePicture;
}
