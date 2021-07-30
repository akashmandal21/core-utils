/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.far.dto.AssetDto;

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
public class AssetCloneRequestDto {

	@NotNull
	private AssetDto parentAsset;

	@NotNull
	private AssetDto childAsset;
}
