package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class SearchBatchOrderSummaryPDto {
    @NotBlank(message = "Empty Cafe Id")
    private String cafeId;
    @NotBlank(message = "Empty Residence Id")
    private String residenceId;
    @NotBlank(message = "Empty Slot Id")
    private String slotId;
}
