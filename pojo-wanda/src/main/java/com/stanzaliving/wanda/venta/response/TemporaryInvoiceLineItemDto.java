package com.stanzaliving.wanda.venta.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemporaryInvoiceLineItemDto {
    private Long id;
    private double amount;
    private double cgst;
    private double sgst;
    private double igst;
    private double amountPaid;
    private double cgstPaid;
    private double sgstPaid;
    private double igstPaid;
    private String lineItem;
    private Long paymentPlanId;
}
