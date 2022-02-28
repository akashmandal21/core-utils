package com.stanzaliving.community.response;

import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.community.feedpost.response.FeedPostResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndUserFeedPostsDto {
	
	private int page;

	private int records;

	private int totalPages;

	private long totalRecords;
	
	private String userId;
	
	private String userCode;
	
	private AppPage appPage;
	
	private List<FeedPostResponseDto> feedPostResponseDtos;
}
