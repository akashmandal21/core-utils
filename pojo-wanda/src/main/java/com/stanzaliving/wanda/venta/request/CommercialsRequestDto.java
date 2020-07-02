package com.stanzaliving.wanda.venta.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommercialsRequestDto {
    private String bookingUuid;
    private String moveInDate;
    private Integer contractId;
}