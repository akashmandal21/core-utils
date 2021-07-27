package com.stanzaliving.ventaInvoice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GstDto {
    private double sgstAmount;
    private double cgstAmount;
    private double igstAmount;
    private double amountExclusiveTax;
    private double amountInclusiveTax;
}
