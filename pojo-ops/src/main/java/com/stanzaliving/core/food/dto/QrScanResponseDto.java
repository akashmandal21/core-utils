/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QrScanResponseDto {

	private String qrContextType;
	private Object data;
}
