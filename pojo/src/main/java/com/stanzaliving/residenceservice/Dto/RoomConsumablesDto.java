package com.stanzaliving.residenceservice.Dto;

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

    private String type;

    @Valid
    private List<ConsumablesPricesDto> consumablesPrices;

}

