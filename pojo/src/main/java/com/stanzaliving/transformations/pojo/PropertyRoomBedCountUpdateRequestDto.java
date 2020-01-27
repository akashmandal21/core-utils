/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
public class PropertyRoomBedCountUpdateRequestDto {

	@NotEmpty(message = "PropertyUuid cannot be empty")
	private String propertyUuid;
	
	@Min(value = 1, message = "room count should not be less than 1")
	private int roomCount;
	
	@Min(value = 1, message = "bed count should not be less than 1")
	private int bedCount;
}
