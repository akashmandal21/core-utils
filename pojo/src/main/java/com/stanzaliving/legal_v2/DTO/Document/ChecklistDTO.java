package com.stanzaliving.legal_v2.DTO.Document;

import com.stanzaliving.legal_v2.enums.CheckListStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChecklistDTO {

    private String checkPointName;

    private CheckListStatus status;

    private String comment;
}
