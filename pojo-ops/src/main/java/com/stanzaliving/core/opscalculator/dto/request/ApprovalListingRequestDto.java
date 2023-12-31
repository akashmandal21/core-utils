package com.stanzaliving.core.opscalculator.dto.request;

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
    @Builder.Default
    private List<String> residenceUuids = new ArrayList<>();
    private int page;
    private int limit;
    //private String role;
    @Builder.Default
    private List<ApprovalStatus> approvalStatusList = new ArrayList<>();
}
