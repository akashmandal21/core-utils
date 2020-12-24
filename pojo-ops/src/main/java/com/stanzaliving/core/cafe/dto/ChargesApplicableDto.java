package com.stanzaliving.core.cafe.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ChargesApplicableDto {

    private ApplicableChargesDto chargesDto;

    private boolean mandatory;

    private Double chargeValue;

}