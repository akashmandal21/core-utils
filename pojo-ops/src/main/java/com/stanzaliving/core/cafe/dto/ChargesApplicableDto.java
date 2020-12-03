package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ChargesApplicableDto {

    @Valid
    private ApplicableChargesDto chargesDto;

    private boolean mandatory;

    private Double chargeValue;

}
