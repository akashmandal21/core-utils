package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BaseKitchenResidenceDto {

    private String baseKitchenId;

    private String baseKitchenName;

    private List<ResidenceMicromarketDto> residences;

}