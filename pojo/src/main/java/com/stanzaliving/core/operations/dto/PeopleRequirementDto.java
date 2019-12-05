/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.enums.AccessLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 14-Nov-2019
 *
 **/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class PeopleRequirementDto extends OpsDashboardDataDto {

	@NotEmpty(message = "Role Requirements are mandatory for People Requirement")
	private List<@Valid RoleRequirementDto> roleRequirementDtos;
}