package com.stanzaliving.po.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class PoVersionHistoryDetailsDto {

    private String poDetailsId;

    private String poStage;

    private String poInfo;

    private String createdBy;

    private String createdAt;

}
