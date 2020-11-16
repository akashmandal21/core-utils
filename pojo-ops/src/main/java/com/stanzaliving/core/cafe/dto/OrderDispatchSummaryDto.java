package com.stanzaliving.core.cafe.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.cafe.order.constants.OrderType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class OrderDispatchSummaryDto {

    @NotNull(message = "Order Type can not be empty")
    private OrderType orderType;

    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;

    @NotBlank(message = "Empty Residence Id")
    private String residenceId;

    @NotBlank(message = "Empty Slot Id")
    private String slotId;

    private Integer rcCode;
    
    private Date rcGeneratedAt;
    
    private boolean receivingStatus;
    
    private Date rcReceivedAt;

    private boolean orderStatus;

    @NotNull(message = "Hotbags Dispatch Count can not be empty")
    private Integer hotbagsDispatchCount;

    @NotNull(message = "Order Packed Count can not be empty")
    private Integer orderPackedCount;

    @NotNull(message = "Packet Dispatch Count can not be empty")
    private Integer packetDispatchCount;

	

}
