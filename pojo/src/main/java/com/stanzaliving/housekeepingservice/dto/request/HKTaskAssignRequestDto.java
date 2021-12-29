package com.stanzaliving.housekeepingservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKTaskAssignRequestDto {

    private String hkPseudoPersonUuid;

    private String residenceUuid;

    private String microclusterUuid;

    private List<String> taskUuids;
}
