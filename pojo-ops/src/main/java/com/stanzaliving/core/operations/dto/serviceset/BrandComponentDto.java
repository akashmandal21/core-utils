/**
 * 
 */
package com.stanzaliving.core.operations.dto.serviceset;

import com.stanzaliving.transformations.enums.BrandName;

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
public class BrandComponentDto {

	private String componentId;

	private BrandName brandName;
}