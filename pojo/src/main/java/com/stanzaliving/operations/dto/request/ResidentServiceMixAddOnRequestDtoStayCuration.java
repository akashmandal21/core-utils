package com.stanzaliving.operations.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidentServiceMixAddOnRequestDtoStayCuration {

    @NotBlank(message = "ResidentCode can't be null")
    private String residentCode;

    @NotBlank(message = "ServiceMixUuid can't be null")
    private String serviceMixUuid;

    List<ResidentServiceMixVasRequestDetailDtoStayCuration> addOnsSelected;

}
