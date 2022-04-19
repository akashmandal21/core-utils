/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import java.util.List;

import com.stanzaliving.residenceservice.enums.ResidenceAttributes;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class ResidenceAttributesRequestDto {

	private List<ResidenceAttributes> residenceAttributes;
	private String residenceUuid;
}
