/**
 * 
 */
package com.stanzaliving.designservice.response.dto;

import com.stanzaliving.designservice.enums.DesignStatus;

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
public class DesignStatusCountDto {

	private DesignStatus status;
	private String name;
	private Integer count;
	private Float percentage;
	private String color;
}
