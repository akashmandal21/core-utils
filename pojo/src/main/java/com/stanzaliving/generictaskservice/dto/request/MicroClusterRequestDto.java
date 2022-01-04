package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MicroClusterRequestDto{

    @NotNull(message = "MicroCluster is mandatory")
    private String microClusterName;

    @NotNull(message = "ResidenceIds Cannot be blank")
    private List<String> residenceIds;

    @NotNull(message = "Micromarket uuid Cannot be blank")
    private String microMarketUuid;

    @NotNull(message = "Micromarket name Cannot be blank")
    private String microMarketName;

    @NotBlank(message = "CityUuid Cannot be blank")
    private String cityUuid;
}