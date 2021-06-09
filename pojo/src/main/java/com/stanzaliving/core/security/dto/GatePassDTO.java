package com.stanzaliving.core.security.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GatePassDTO {

    @NotNull @NotEmpty private String residentUuid;

    @NotNull @NotEmpty private String residenceUuid;

    private Long requestId;

    @NotNull private String requestUuid;

    // TODO: Needs to be mapped to a type
    private String qrCodeData;
}
