package com.stanzaliving.website.response.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class SearchResponseDto {

    private long recordCount;
    private List<LeadAttributesDto> searchResult;

}
