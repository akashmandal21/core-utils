/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import java.util.List;

import com.stanzaliving.residenceservice.enums.ResidenceAttributes;

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
public class ResidenceAttributesRequestDto {

	private List<ResidenceAttributes> residenceAttributes;
	private String residenceUuid;
}
