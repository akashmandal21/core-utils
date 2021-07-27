package com.stanzaliving.ventaInvoice.dto;

import com.stanzaliving.ventaInvoice.enums.Split;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
