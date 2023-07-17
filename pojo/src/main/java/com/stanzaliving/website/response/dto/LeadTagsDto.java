package com.stanzaliving.website.response.dto;

import lombok.Data;

@Data
public class LeadTagsDto {

    private SystemGeneratedTags systemGeneratedTags;
    private CustomTagDto customTag;
}