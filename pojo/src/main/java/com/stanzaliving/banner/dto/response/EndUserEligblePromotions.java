package com.stanzaliving.banner.dto.response;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.banner.enumeration.PageSection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndUserEligblePromotions {
	
	private String userCode;
	
	private AppPage appPage;
	
	@Default
	private Map<PageSection, SectionTypeAndPromotions> pageSectionMap = new HashMap<>();
}
