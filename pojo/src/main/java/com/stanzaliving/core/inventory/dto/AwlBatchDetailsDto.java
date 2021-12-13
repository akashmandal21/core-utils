package com.stanzaliving.core.inventory.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class AwlBatchDetailsDto {

    private String awlBatchId;
    private String awlRefNo;
    private String itemUuid;
    private BigDecimal quantity;
}
