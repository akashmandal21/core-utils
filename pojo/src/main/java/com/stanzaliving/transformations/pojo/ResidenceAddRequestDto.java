/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.enums.ResidenceType;
import com.stanzaliving.core.estate.enums.EstateGender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 28-May-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceAddRequestDto {

	@NotBlank(message = "Residence Name is mandatory")
	private String residenceName;

	@NotBlank(message = "Micromarket UUID is mandatory")
	private String micromarketUuid;

	@NotNull(message = "Residence Type is mandatory")
	private ResidenceType residenceType;

	@NotNull(message = "Residence Brand is mandatory")
	private ResidenceBrand brandName;

	@Min(value = 0, message = "Bed Count cannot be negative")
	private int bedCount;

	@Min(value = 0, message = "Room Count cannot be negative")
	private int roomCount;

	@NotNull(message = "Residence Gender is mandatory")
	private EstateGender estateGender;

	private Integer coreResidenceId;

	private String coreResidenceName;
}