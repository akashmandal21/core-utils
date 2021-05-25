package com.stanzaliving.estate_v2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class GroupDataDto {

    private String groupName;
    private String groupUuid;
    private List<PageDataDto> pages;
}
