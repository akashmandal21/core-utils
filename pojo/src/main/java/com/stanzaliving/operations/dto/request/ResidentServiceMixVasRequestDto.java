package com.stanzaliving.operations.dto.request;

import com.stanzaliving.operations.enums.ResidentServiceMixAction;
import com.stanzaliving.operations.enums.ServiceMixServiceType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentServiceMixVasRequestDto {

    @NotBlank(message = "ResidentCode can't be null")
    private String residentCode;

    @NotBlank(message = "PlanId can't be null")
    private String planId;

    private ServiceMixServiceType serviceMixServiceType;

    private ResidentServiceMixAction residentServiceMixAction;

}

