package com.stanzaliving.residence.dto;

import lombok.*;

import java.util.Map;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EscalationDto {
    Map<Double, Integer> escalationPercentageMap;
    Double inventoryPrice;
}
