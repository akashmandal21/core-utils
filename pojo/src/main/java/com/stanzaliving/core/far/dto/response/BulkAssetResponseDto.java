package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BulkAssetResponseDto {
	private int assetsCreated;
	private int assetsNotCreated;
	private Map<String, String> response; // serialNo , responseMsg
}