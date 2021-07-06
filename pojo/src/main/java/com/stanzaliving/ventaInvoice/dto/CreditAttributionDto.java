package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.Split;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditAttributionDto {
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double amount;
    private Split split;

}
