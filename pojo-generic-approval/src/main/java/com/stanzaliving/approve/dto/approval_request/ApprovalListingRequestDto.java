package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.*;
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

    private String requestedDate;

    @Builder.Default
    private List<String> category = new ArrayList<>();

    @Builder.Default
    private List<String> cityUuids = new ArrayList<>();

    @Builder.Default
    private List<String> micromarketUuids = new ArrayList<>();

    @Builder.Default
    private List<String> residenceUuids = new ArrayList<>();

    @Builder.Default
    private List<ApprovalStatus> approvalStatusList = new ArrayList<>();
}
