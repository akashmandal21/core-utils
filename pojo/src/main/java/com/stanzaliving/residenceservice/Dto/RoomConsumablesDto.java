package com.stanzaliving.residenceservice.Dto;


import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class RoomConsumablesDto {

    @NotBlank(message = "residenceUuid field cannot be empty")
    private String residenceUuid;

    private List<ConsumablesPricesDto> consumablesPrices;

}

