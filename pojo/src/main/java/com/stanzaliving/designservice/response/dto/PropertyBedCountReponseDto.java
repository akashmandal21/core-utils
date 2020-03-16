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
public class PropertyBedCountReponseDto {

	private int bdBedCount;
	private int primaBed;
	private int magnaBed;
	private int summaBed;
	private String designRemark;
	private DesignStatus designStatus;
	private String designDescription;
}
