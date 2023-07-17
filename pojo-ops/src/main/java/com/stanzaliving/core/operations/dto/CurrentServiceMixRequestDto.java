package com.stanzaliving.core.operations.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurrentServiceMixRequestDto {
  
	private Map<String, List<String>> hostelIdWiseUserCodeMap;
	
}
