package com.stanzaliving.core.inventory.dto;

import com.stanzaliving.core.inventory.enums.AwlItemStatus;
import lombok.*;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class AwlItemStatusUpdateDto {

    @NotBlank(message = "awlTransactionId cannot be blank")
    private String awlTransactionId;

    @NotBlank(message = "awlRefNo cannot be blank")
    private String awlRefNo;

    @NotBlank(message = "addressUuid cannot be blank")
    private String addressUuid;

    @NotBlank(message = "itemUuid cannot be blank")
    private String itemUuid;

    @NotBlank(message = "awlBatchId cannot be blank")
    private String awlBatchId;

    @DecimalMin(message = "quantity cannot be less than 1", value = "1.0")
    private BigDecimal quantity;

    private AwlItemStatus itemStatusFrom;

    private AwlItemStatus itemStatusTo;
}
