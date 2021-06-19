package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoryResponseDto {
    private Long index;
    private String uuid;
    private String name;
    private String defaultPriorityUuid;
    private Long sla;
    private boolean active;
    private List<ChecklistDetailDto> checklistDetails;
    private List<SubTicketTaskDto> subTicketTasks = new ArrayList<>();
    private List<FeedbackReasonDto> feedbackReasons = new ArrayList<>();
}
