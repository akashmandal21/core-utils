package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.DeliveryType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDeliveryPreferenceRDto {
    private DeliveryType type;
    private String residenceId;
    private String name;
    private String roomNo;
    private String instructions;
}
