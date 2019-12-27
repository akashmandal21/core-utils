/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.time.LocalDate;
import java.util.Date;

import com.stanzaliving.core.enums.ResidenceBrand;

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
public class OpsResidenceScoreListingDto extends OperationsScoreDto {

	private String cityId;

	private String cityName;

	private String microMarketId;

	private String microMarketName;

	private String residenceId;

	private String residenceName;

	private String residenceGender;

	private ResidenceBrand brandName;

	private int roomCount;

	private int bedCount;

	private LocalDate dueDate;

	private Date actualLiveDate;

	private String liveMarkedBy;

}