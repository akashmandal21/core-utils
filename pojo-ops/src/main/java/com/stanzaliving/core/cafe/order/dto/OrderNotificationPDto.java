package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderNotificationPDto {
    @NotBlank(message = "Empty Order Id")
    private String orderId;
    @NotNull(message = "Empty Order Status")
    private OrderStatus status;

    private boolean reminder;
}
