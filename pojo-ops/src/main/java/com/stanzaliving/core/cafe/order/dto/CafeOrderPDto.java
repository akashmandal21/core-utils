package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.PaymentType;
import com.stanzaliving.core.cafe.order.constants.ServingMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPDto {
    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;
    private String residenceId;
    @NotNull(message = "Empty Serving Mode")
    private ServingMode servingMode;
    @NotNull(message = "Empty Payment Type")
    private PaymentType paymentType;
    private Double amount;
    private Double gst;
    @NotNull(message = "Empty Items Details")
    private List<CafeOrderItemPDto> items;
    @NotNull(message = "Empty User Details")
    private OrderUserPDto userDetails;

    private CafeOrderDeliveryPDto deliveryDetails;

}
