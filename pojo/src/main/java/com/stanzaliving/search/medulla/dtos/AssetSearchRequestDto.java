/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.search.medulla.dtos;

import com.stanzaliving.core.dto.PageAndSortDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class AssetSearchRequestDto {

	private String searchText;
	private PageAndSortDto pageDto;
	private String[] fieldsNeeded;

}
