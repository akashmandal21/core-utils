package com.stanzaliving.sfr.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PageDataDto {

    private String pageName;
    private String pageUuid;
    private String groupsUuid;
    private String pageIcon;
    private PrivilegesDto privileges;
    private Integer pageNumQuestion;
    private Integer pageNumAnswer;
}
