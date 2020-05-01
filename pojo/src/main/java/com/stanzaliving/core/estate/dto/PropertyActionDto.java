/**
 * 
 */
package com.stanzaliving.core.estate.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PropertyActionDto {

	private boolean status;
	private String description;
	private String submitTextDescription;
	
	public PropertyActionDto(boolean status, String description) {
		this.status = status;
		this.description = description;
	}
}
