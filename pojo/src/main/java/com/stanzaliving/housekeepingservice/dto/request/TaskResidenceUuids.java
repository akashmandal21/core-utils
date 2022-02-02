package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResidenceUuids {

    private String taskUuids;

    private String residenceUuids;

    private String beatPersonUuid;

}
