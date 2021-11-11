package com.stanzaliving.generictaskservice.dto.request;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

/**
 * @author Vikas S T
 * @date 25-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealTypeRequestDto {
    @NotBlank(message = "Residence uuid is required")
    private String residenceUuid;

    @NotBlank(message = "Module is required")
    private String module;

    @NotNull(message = "Meal time is mandatory")
    private LocalTime mealTime;

    @NotNull(message = "Default duration is mandatory")
    private LocalTime duration;

    @NotBlank(message = "MealType is required")
    private String mealType;
}
