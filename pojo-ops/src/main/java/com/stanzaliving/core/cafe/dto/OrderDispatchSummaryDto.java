package com.stanzaliving.core.cafe.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OrderDispatchSummaryDto {

    private OrderType orderType;

    private String orderId;

    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;

    private String residenceId;

    @NotBlank(message = "Empty Slot Id")
    private String slotId;

    private Integer rcCode;
    
    private LocalDateTime rcGeneratedAt;
    
    private boolean receivingStatus;
    
    private LocalDateTime rcReceivedAt;

    private boolean orderStatus;

    private Long hotbagsDispatchCount;

    private Long orderPackedCount;

    private Long packetDispatchCount;

	

}
