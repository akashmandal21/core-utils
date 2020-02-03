/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.transformations.enums.BoqStatus;

import lombok.Builder;
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
@Builder
public class PropertyBoqStatusDto {

	private String propertyUuid;
	private BoqStatus boqStatus;
	private String boqStatusDesc;
	private String colorCode;
}
