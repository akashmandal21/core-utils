package com.stanzaliving.sfr.dto.reviewTemplate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LayoutDto {
    private String name;
    private String layoutType;
    private String commentType;
    private String approvalType;
    private Object layoutData;
}
