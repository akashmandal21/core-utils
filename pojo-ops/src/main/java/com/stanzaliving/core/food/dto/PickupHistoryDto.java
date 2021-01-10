/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
public class PickupHistoryDto {

	private Object data;
	private Date date;
	private String qrContextType;
	private boolean requestReplacement;
	private String requestReplacementText;
	private String qrUuid;	
}
