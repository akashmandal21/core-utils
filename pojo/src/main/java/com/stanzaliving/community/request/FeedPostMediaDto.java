package com.stanzaliving.community.request;

import com.stanzaliving.community.enums.MediaType;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostMediaDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

    private String postUuid;

    private MediaType mediaType;
    
	private String url;

    private Integer displayOrder;
}