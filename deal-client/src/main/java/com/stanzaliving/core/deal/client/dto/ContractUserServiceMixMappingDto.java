package com.stanzaliving.core.deal.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContractUserServiceMixMappingDto {

    @NotNull(message = "Contract Uuid cannot be null")
    private String contractUuid;

    @NotNull(message = "Residence Uuid cannot be null")
    private String residenceUuid;

    private String opsResidenceUuid;

    @NotNull(message = "ServiceMix Uuid cannot be null")
    private String serviceMixUuid;

    private String serviceMixAssignedBy;

    private String mobile;

    private String residentCode;

    @NotNull(message = "Resident Uuid cannot be null")
    private String residentUuid;

    private String bookingId;
}
