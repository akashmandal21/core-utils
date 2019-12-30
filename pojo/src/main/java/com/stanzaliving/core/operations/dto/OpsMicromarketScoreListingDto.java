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
public class OpsMicromarketScoreListingDto extends OpsScoreListingDto {

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;
}