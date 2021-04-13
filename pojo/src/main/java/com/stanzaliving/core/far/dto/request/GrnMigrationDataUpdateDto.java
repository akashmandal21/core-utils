/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.dto.request;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.tuple.Pair;

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

	@NotNull
	private Pair<String, List<GrsiEventUpdateDto>> poGrnItemsPair;

}
