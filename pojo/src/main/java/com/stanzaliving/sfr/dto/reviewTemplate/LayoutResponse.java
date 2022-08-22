package com.stanzaliving.sfr.dto.reviewTemplate;

import com.stanzaliving.sfr.enumeration.ApprovalType;
import com.stanzaliving.sfr.enumeration.CommentType;
import com.stanzaliving.sfr.enumeration.LayoutType;
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
}

