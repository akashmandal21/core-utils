package com.stanzaliving.core.grsi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrsiUpdateDto {

    private String potoUuid;
    private Double grsiPct;
    private boolean grsiCompleted;
}
