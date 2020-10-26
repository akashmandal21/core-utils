package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.electricity.constants.MeterType;
import com.stanzaliving.core.electricity.constants.ReadingUnitType;
import com.stanzaliving.core.utility.dto.MeterAddDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(exclude = "image")
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class EMeterAddDto {

    @NotBlank(message = "Meter Category Cannot be blank")
    private String categoryId;

    @NotBlank(message = "Meter Number Cannot be blank")
    private String number;

    @NotNull(message = "Start reading is mandatory")
    @Min(value = 0, message = "Meter reading cannot be negative")
    private Double reading;

    @NotBlank(message = "Meter image is mandatory")
    private String image;

    private MeterType meterType;

    private ReadingUnitType unitType;
}
