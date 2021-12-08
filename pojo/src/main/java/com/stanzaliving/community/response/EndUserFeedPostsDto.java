package com.stanzaliving.community.response;

import java.util.HashMap;
import java.util.Map;

import com.stanzaliving.banner.enumeration.AppPage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndUserFeedPostsDto {
	
	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	@Default
	private Map<String, String> pageSectionMap = new HashMap<>();
}
