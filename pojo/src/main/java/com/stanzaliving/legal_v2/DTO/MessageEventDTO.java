package com.stanzaliving.legal_v2.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageEventDTO {
    private boolean designUploaded;
    private String propertyId;
    private String propertyStatus;
    private boolean approved;
    private boolean legalDeviations;
}
