package com.stanzaliving.community.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.stanzaliving.community.enums.FeedPostTagType;
import com.stanzaliving.core.base.common.dto.AbstractDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedPostTagsDto extends AbstractDto {
	
	private static final long serialVersionUID = 1L;

    private String postUuid;

    private FeedPostTagType tagType;
    
    @JsonIgnore
    @JsonProperty(access = Access.WRITE_ONLY)
	private List<String> tagValues;
}