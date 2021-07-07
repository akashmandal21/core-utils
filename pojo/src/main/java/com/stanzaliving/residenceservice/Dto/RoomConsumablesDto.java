package com.stanzaliving.residenceservice.Dto;


import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Data;

@Getter
@Setter
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class RoomConsumablesDto {

    @NotBlank(message = "roomUUID field cannot be empty")
    private String roomUUID;

    private List<ConsumablesPricesDto> consumablesPrices;

}

