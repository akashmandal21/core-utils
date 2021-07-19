package com.stanzaliving.legal_v2.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignalEventDTO {

    private String messageName;
    private String propertyId;
    private String propertyStatus;

}
