package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.RefundMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderRefundPDto {
    @NotNull(message = "Empty Order Id")
    private String orderId;
    @NotNull(message = "Empty Refund Mode")
    private RefundMode refundMode;
    @NotNull(message = "Empty Items")
    private List<CafeOrderRefundItemPDto> items;

}
