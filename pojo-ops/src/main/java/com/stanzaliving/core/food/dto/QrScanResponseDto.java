/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class QrScanResponseDto {

	private String qrContextType;
	private Object data;

}