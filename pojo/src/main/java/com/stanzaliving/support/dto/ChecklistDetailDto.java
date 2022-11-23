package com.stanzaliving.support.dto;

import com.stanzaliving.support.enums.ActionFlag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChecklistDetailDto {
    private String checklist;
    private String uuid;
    private boolean mandatory;
    private boolean active;
    private int position;
    private ActionFlag actionFlag;
}
