package com.stanzaliving.core.operations.dto.request.report.food;

import com.stanzaliving.core.operations.enums.Frequency;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class FoodReportGraphRequestDto extends FoodReportRequestDto {

    Frequency frequency = Frequency.DAILY;

}
