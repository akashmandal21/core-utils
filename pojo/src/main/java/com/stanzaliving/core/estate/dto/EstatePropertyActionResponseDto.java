/**
 * 
 */
package com.stanzaliving.core.estate.dto;


import java.util.Date;

import com.stanzaliving.core.estate.enums.PropertyAction;

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
public class EstatePropertyActionResponseDto {

	private String uuid;
	private String estateUuid;
	private String reason;
	private PropertyAction requestType;
	private String requestTypeDesc;
	private Date createdAt;
}
