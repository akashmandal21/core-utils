/**
 * 
 */
package com.stanzaliving.residenceservice.Dto;

import com.stanzaliving.residenceservice.enums.ResidenceAttributes;
import lombok.*;

import java.util.List;

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
