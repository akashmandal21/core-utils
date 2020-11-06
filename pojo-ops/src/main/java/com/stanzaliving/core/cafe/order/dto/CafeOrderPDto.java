package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.PaymentType;
import com.stanzaliving.core.cafe.order.constants.ServingMode;
import com.stanzaliving.core.cafe.order.constants.UserType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPDto {
    private String cafeId;
    private String residenceId;
    private ServingMode servingMode;
    
    private UserType userType;
    private String userId;
    private PaymentType paymentType;
    private Double amount;
    private List<CafeOrderItemPDto> items;
    private CafeOrderDeliveryPDto deliveryDetails;

}
