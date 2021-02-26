package com.stanzaliving.banner.dto.response;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.wanda.enums.AppPageSectionInstance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppPageSectionInstanceMap {

	@Default
	private Map<AppPageSectionInstance, SectionTypeAndPromotions> pageSectionMap = new HashMap<>();
}
