/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 22-Nov-2019
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OpsScoreListingDto extends OperationsScoreDto {

	private long propertiesLive;

	private long propertiesPending;

	private long expectedBeds;

	private long actualBeds;
}