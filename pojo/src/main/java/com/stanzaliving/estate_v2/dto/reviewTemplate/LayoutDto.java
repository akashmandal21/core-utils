package com.stanzaliving.estate_v2.dto.reviewTemplate;

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
    private Integer displayOrder;

}
