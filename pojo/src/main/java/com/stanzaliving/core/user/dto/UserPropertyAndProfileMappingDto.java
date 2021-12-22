/**
 * 
 */
package com.stanzaliving.core.user.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @date 01-Oct-2021
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserPropertyAndProfileMappingDto extends UserProfileDto {

	private String userId;

	private String propertyId;
	
	private LocalDate arrivalDate;
}