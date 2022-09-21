package com.stanzaliving.booking.dto.request;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ServiceMixEvent {
    private String residentServiceMixUuid;

    private String residentCode;

    private String residenceId;
}
