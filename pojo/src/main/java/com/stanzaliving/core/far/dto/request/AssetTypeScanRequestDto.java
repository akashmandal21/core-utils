/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.far.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.AssetType;

import com.stanzaliving.core.far.enums.RoleAction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nipunaggarwal
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetTypeScanRequestDto {

	@Builder.Default
	private AssetType assetType = AssetType.MULTIPLE;

	private String qrCode;
	private String qrCodeId;
	private String allocationUuid;
	private String sourceAddressUuid;
	private RoleAction actionType;

	@Builder.Default
	private boolean assetCreation = Boolean.FALSE;

}
