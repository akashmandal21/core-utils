/**
 * 
 */
package com.stanzaliving.designservice.request.dto;

import lombok.*;

/**
 * @author raj.kumar
 *
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstateAttributeDto {

	private String estateId;
	private String attributeName;
	private String attributeValue;
}
