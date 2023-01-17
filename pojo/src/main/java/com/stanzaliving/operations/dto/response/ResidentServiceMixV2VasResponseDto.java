package com.stanzaliving.operations.dto.response;

import com.stanzaliving.operations.enums.ResidentServiceMixAction;
import com.stanzaliving.operations.enums.ResidentStatus;
import com.stanzaliving.operations.enums.ServiceMixServiceType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ResidentServiceMixV2VasResponseDto {

    private String residentCode;
    private String residenceUuid;
    private String serviceMixUuid;
    private String residentServiceMixUuid;
    private ResidentStatus residentStatus;
    private ServiceMixServiceType updatedServiceMixServiceType;
    private String updatedPlanId;
    private String updatedPlanName;
    private ResidentServiceMixAction residentServiceMixAction;

}
