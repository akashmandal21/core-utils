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
@NoArgsConstructor
@AllArgsConstructor
public class InvalidScanDto {

	private Date updatedAt;
	private String code;
	private String message;
}
