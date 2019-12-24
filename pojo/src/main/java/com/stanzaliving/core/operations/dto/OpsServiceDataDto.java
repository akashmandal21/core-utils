package com.stanzaliving.core.operations.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OpsServiceDataDto {

    @NotNull(message = "Access Level is Mandatory")
    private AccessLevel accessLevel;

    @NotBlank(message = "City Id is Mandatory")
    private String cityId;

    private String cityName;

    private String microMarketId;

    private String microMarketName;

    private String residenceId;

    private String residenceName;
}
