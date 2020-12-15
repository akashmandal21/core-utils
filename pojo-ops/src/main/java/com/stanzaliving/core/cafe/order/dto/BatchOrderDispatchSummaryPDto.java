package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BatchOrderDispatchSummaryPDto {
    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;
    @NotBlank(message = "Empty Residence Id")
    private String residenceId;
    @NotBlank(message = "Empty Slot Id")
    private String slotId;
    @Min(value = 1, message = "Hotbags Count can not be empty")
    private int hotbagCount;
    @Min(value = 1, message = "Order Count can not be empty")
    private int orderCount;
    @Min(value = 1, message = "Packet Count can not be empty")
    private int packetCount;
    private LocalDate orderDate;
}
