package com.stanzaliving.community.feedpost.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
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

//	@JsonIgnore
//	@JsonProperty(access = Access.WRITE_ONLY)
//	private EnumListing<EventStatus> postStatus;
	
    private String title;

	private String description;

    private String ctaText;

	private String redirectLink;

    private Date startDate;

    private Date endDate;

    private Integer priority;
    
	protected boolean prompted;

	@JsonIgnore
	@JsonProperty(access = Access.AUTO)
	private List<EnumListing<AppPage>> appPages;
    
	@JsonIgnore
	@JsonProperty(access = Access.WRITE_ONLY)
	private UserListDTO userList;
	
	private List<FeedPostMediaDto> mediaDtos;
	
	private List<FeedPostTagsDto> tagDtos;
}