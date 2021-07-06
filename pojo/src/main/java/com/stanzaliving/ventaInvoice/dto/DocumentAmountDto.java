package com.stanzaliving.ventaInvoice.dto;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentAmountDto {
    private double amount;
    private Long uniqueUser;
}