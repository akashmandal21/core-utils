package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class MicroClusterRequestDto extends AbstractDto {

    @NotNull(message = "MicroCluster is mandatory")
    private String microClusterName;

    @NotBlank(message = "MicroMarket cannot be blank")
    private String microMarketName;

    @NotNull(message = "ResidenceIds Cannot be blank")
    private List<String> residenceIds;

    @NotBlank(message = "State Cannot be blank")
    private String state;

    @NotBlank(message = "City Cannot be blank")
    private String city;
}
