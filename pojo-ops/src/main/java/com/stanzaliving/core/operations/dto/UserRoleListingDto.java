/**
 * 
 */
package com.stanzaliving.core.operations.dto;

import java.util.List;

import com.stanzaliving.core.base.common.dto.ListingDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 10-Dec-2019
 *
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleListingDto {

	private String roleId;

	private String roleName;

	private List<ListingDto> roleMappings;
}