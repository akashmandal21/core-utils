package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.Priority;
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
public class SubCategoryDto {
    private int position;
    private String uuid;
    private String name;
    private String defaultPriorityUuid;
    private Long sla;
    private boolean active;
    private int checkListDetailsCount;
    private Priority priority;
    private List<SubTicketTaskDto> subTicketTasks = new ArrayList<>();
    private List<FeedbackReasonDto> feedbackReasons = new ArrayList<>();
    private int templateCount;
}
