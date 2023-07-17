package com.stanzaliving.community.feedpost.response;

import java.util.Date;
import java.util.List;

import com.stanzaliving.banner.enumeration.AppPage;
import com.stanzaliving.community.enums.EventStatus;
import com.stanzaliving.community.request.FeedPostMediaDto;
import com.stanzaliving.community.request.FeedPostTagsDto;
import com.stanzaliving.community.request.UserListDTO;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostResponseDto extends AbstractDto {

	private static final long serialVersionUID = 1L;

	private EnumListing<EventStatus> postStatusDto;
	
    private String title;
    
    private String postId;

	private String description;

    private String ctaText;

	private String redirectLink;

    private Date startDate;

    private Date endDate;

    private Integer priority;
    
	protected boolean prompted;

	private List<EnumListing<AppPage>> appPagesDto;
    
	private UserListDTO userListDto;
	
	private List<FeedPostMediaDto> mediaDtos;
	
	private List<FeedPostTagsDto> tagDtos;
}