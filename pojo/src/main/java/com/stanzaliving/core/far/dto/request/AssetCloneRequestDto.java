/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.far.dto.AssetDto;
import com.stanzaliving.core.far.enums.AssetType;

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
	private String parentQrCode;

	@NotNull
	private String childQrCode;

	@Builder.Default
	private AssetType parentAssetType = AssetType.MULTIPLE;

	@Builder.Default
	private AssetType childAssetType = AssetType.SINGLE;

	private AssetDto childAssetDto;
}
