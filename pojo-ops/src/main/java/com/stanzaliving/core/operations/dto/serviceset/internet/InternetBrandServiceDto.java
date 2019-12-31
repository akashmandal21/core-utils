/**
 * 
 */
package com.stanzaliving.core.operations.dto.serviceset.internet;

import java.util.List;

import com.stanzaliving.core.operations.dto.serviceset.BrandAvailabilityDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 26-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class InternetBrandServiceDto extends BrandAvailabilityDto {

	private List<InternetBrandDetailDto> serviceDetails;

}