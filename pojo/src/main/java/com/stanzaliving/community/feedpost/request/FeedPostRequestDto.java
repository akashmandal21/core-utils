package com.stanzaliving.community.feedpost.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostRequestDto extends AbstractDto {

	private static final long serialVersionUID = 1L;
	
	private String postId;
}
