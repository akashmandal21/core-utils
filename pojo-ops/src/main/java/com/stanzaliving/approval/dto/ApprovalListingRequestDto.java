package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalListingRequestDto {
    private int page;
    private int limit;
    private ApprovalEntityType approvalEntityType;
    @Builder.Default
    private List<String> micromarketUuids = new ArrayList<>();
    @Builder.Default
    private List<String> residenceUuids = new ArrayList<>();
    @Builder.Default
    private List<ApprovalStatus> approvalStatusList = new ArrayList<>();
}
