/**
 * 
 */
package com.stanzaliving.core.operations.dto.serviceset;

import com.stanzaliving.core.enums.ResidenceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 07-Jan-2020
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidenceTypeAvailaibilityDto {

	private ResidenceType residenceType;

	private boolean available;
}