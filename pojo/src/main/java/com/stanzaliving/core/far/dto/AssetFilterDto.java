package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@SuperBuilder
public class AssetFilterDto {
	private String assetUuid;
	private String assetId;
	private String assetName;
	private AssetType assetType;
	//private String subCategory;
	//private String assetLocation;
	private String addedBy;
	private Date addedOn;
	private Date lastAuditedOn;
	private String lastAuditedBy;
	private AssetStatus assetStatus;
	private Integer taskDueCount;
	//private String textColor;
	//private String bgColor;
}
