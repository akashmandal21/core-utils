package com.stanzaliving.sfr.dto;

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
    private PrivilegesDto privileges;
    private String groupApprovalStatus;
    private boolean legalInfoGroup;
    private boolean legalDocumentInfoGroup;
    private List<String> legalGroupRoles;
    private Integer totalQuestionCount;

}
