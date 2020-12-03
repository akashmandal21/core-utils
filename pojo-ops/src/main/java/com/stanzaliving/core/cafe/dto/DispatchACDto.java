package com.stanzaliving.core.cafe.dto;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DispatchACDto {

    private OrderType orderType;

    private String orderId;

    private String cafeId;

    private String residenceId;

    private String slotId;

    private Integer rcCode;

    private boolean orderStatus;

    private Long hotbagsDispatchCount;

    private Long orderPackedCount;

    private Long packetDispatchCount;

}
