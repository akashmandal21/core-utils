package com.stanzaliving.wanda.response;

import com.stanzaliving.support.dto.FeedbackReasonDto;
import com.stanzaliving.support.dto.SubTicketTaskDto;
import com.stanzaliving.support.enums.Priority;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private List<SupportVideoDto> subCategoryVideoDtos = new ArrayList<>();

    public SubCategoryDto(String name, String uuid) {
        this.name = name;
        this.uuid = uuid;
    }
}
