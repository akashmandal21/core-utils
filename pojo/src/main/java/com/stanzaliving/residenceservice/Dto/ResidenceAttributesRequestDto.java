/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import java.util.List;

import com.stanzaliving.residenceservice.enums.ResidenceAttributes;

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
public class ResidenceAttributesRequestDto {

	private List<ResidenceAttributes> residenceAttributes;
	private String residenceUuid;
}
