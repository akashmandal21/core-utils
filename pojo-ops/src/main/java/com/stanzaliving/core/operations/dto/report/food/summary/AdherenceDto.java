package com.stanzaliving.core.operations.dto.report.food.summary;

import com.stanzaliving.core.operations.dto.report.PercentDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdherenceDto {

    PercentDto menuAdherence;

    PercentDto quantityAdherence;

    PercentDto onTimeDelivery;

    PercentDto onTimeOrder;

    PercentDto onTimeMenuCreation;

}
