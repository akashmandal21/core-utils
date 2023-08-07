/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotBlank;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 28-Oct-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UserResidenceChangeRequestDto {

	@CsvBindByName(column = "User UUID")
	@NotBlank(message = "User Id is mandatory")
	private String userId;

	@CsvBindByName(column = "Residence Id")
	@NotBlank(message = "Residence selection is mandatory")
	private String residenceId;

	@CsvBindByName(column = "Resident ID")
	private String residentId;

	@CsvBindByName(column = "Room Number")
	@NotBlank(message = "Room Selection is mandatory")
	private String roomNum;
}