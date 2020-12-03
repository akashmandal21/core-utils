package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.enums.ChargeType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicableChargesDto {

    @NotBlank(message = "Charge selection is mandatory")
    private String chargeId;

    private ChargeType chargesType;

    private String chargeTypeName;

    private Double gst;


}
