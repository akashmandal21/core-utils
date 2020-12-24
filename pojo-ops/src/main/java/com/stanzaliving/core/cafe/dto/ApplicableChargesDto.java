package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.enums.ChargeType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicableChargesDto {

    private String chargeId;

    private ChargeType chargesType;

    private String chargeTypeName;

    private Double gst;

}