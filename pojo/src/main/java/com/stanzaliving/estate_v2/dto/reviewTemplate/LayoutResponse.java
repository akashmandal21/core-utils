package com.stanzaliving.estate_v2.dto.reviewTemplate;

import com.stanzaliving.estate_v2.enumeration.ApprovalType;
import com.stanzaliving.estate_v2.enumeration.CommentType;
import com.stanzaliving.estate_v2.enumeration.LayoutType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LayoutResponse {
    private String name;
    private LayoutType layoutType;
    private CommentType commentType;
    private ApprovalType approvalType;
    private LayoutData layoutData;
    private Integer displayOrder;
}

