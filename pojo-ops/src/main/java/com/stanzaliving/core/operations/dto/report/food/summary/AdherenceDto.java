package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdherenceDto {

    int menuAdherence;

    int quantityAdherence;

    int onTimeDelivery;

    int orderedOnTime;

    int menuCreated;

}
