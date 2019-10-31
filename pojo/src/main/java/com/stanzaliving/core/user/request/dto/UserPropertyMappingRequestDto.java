/**
 * 
 */
package com.stanzaliving.core.user.request.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen
 *
 * @date 13-Oct-2019
 */
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPropertyMappingRequestDto {

	@NotBlank(message = "UserId is mandatory to assign property")
	private String userId;

	@NotBlank(message = "PropertyId is mandatory to assign to user")
	private String propertyId;

}