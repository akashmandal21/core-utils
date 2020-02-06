package com.stanzaliving.core.operations.dto.response.report.food.summary;

import com.stanzaliving.core.operations.dto.response.report.FeElementDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AdherenceResponseDto {

    FeElementDto menuAdherence;

    FeElementDto quantityAdherence;

    FeElementDto onTimeDelivery;

    FeElementDto onTimeOrder;

    FeElementDto onTimeMenuCreation;

}
