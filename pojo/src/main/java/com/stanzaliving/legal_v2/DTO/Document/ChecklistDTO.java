package com.stanzaliving.legal_v2.DTO.Document;

import com.stanzaliving.legal_v2.enums.CheckListStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ChecklistDTO {

    private String checkPointName;

    private CheckListStatus status;

    private String comment;
}
