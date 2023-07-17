package com.stanzaliving.residenceservice.Dto;


import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

