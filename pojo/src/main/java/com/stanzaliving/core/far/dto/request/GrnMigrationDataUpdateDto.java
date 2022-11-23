/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.dto.request;

import java.util.List;

import com.stanzaliving.core.grsi.dto.GrsiEventUpdateDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author nipunaggarwal
 *
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GrnMigrationDataUpdateDto {

	private List<GrsiEventUpdateDto> grsiEventUpdateDtos;
}
