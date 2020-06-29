/**
 * 
 */
package com.stanzaliving.transformations.pojo;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class ResidenceDto extends AbstractDto {

	private String residenceName;

	private String micromarketUuid;

	private ResidenceType residenceType;

	private ResidenceBrand brandName;

	private int bedCount;

	private int roomCount;

	private EstateGender estateGender;

	private Integer coreResidenceId;

	private String coreResidenceName;
	
	private String residenceSlug;
}