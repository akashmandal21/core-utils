/**
 * 
 */
package com.stanzaliving.core.operations.dto.people;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.stanzaliving.core.operations.dto.OpsDashboardDataDto;

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
public class PeopleStaffingDto extends OpsDashboardDataDto {

	@NotEmpty(message = "Role Requirements are mandatory for People Staffing")
	private List<RoleStaffingDto> roleStaffingDtos;
}