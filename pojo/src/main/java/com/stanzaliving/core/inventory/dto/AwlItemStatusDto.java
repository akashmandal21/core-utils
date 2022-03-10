package com.stanzaliving.core.inventory.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class AwlItemStatusDto {

    private BigDecimal pieceDamaged;
    private BigDecimal cartonDamaged;
    private BigDecimal qcChk;
    private BigDecimal rePck;
    private BigDecimal okQty;
}
