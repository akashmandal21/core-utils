package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BatchOrderReceivingSummaryPDto {
    @NotBlank
    private String dispatchSummaryId;
    @Min(value = 0, message = "Hotbags Count can not be empty")
    private int hotbagCount;
    @Min(value = 0, message = "Order Count can not be empty")
    private int orderCount;
    @Min(value = 0, message = "Packet Count can not be empty")
    private int packetCount;
}
