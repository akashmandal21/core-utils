package com.stanzaliving.core.invoice.dto;

import com.stanzaliving.core.generic.dto.UIKeyValue;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OtherFeeRowDto {
    @EqualsAndHashCode.Include
    private String poFeeUuid;
    private String feeName;

    private BigDecimal poFeeSubTotal;
    private BigDecimal poFeeGst;
    private BigDecimal poFeeTotal;
    private BigDecimal remainingAmt;

    private BigDecimal invoiceFeeAmt;

    private  double gstPct;
    private double tdsPct;

    private String feeItemUuid;
    private boolean rcmTransaction;
}
