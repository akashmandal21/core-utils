package com.stanzaliving.core.security.dto;

import com.stanzaliving.core.security.enums.StatusCard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusCardDTO {

    private StatusCard status;

    private String colourCode;
}
