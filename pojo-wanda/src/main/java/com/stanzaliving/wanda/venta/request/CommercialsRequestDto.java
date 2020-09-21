package com.stanzaliving.wanda.venta.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommercialsRequestDto {
    private String bookingUuid;
    private String moveInDate;
    private Integer contractId;
    private String couponCode;
}