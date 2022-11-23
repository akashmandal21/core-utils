package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderRefundItemPDto {
    @NotBlank(message = "Empty Item Id")
    private String itemId;
    private boolean refund;
    private String reason;
    private String remarks;

}
