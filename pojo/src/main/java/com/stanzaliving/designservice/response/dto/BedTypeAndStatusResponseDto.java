/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import com.stanzaliving.designservice.enums.BedType;

import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
public class BedTypeAndStatusResponseDto {

	private BedType bedType;
	private boolean status;
}
