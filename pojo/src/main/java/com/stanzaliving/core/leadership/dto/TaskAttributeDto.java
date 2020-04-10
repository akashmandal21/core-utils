/**
 * 
 */
package com.stanzaliving.core.leadership.dto;

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
public class TaskAttributeDto {

	private String statusDesc;
	private int beds;
	private Long estateId;
	private String estateUuid;
	private String estateName;
	private String city;
	private String micromarket;
	private String colorCode;
	private String backgroundColorCode;
	private int days;
}
