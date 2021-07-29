package com.stanzaliving.booking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VasPriceDto implements Serializable {

    private String vasUuid;

    @Builder.Default
    @Min(value = 0, message = "service fee cannot be negative")
    private Double serviceFee = 0.0;

    @Builder.Default
    @Min(value = 0, message = "cgst cannot be negative")
    private Double cgst = 0.0;

    @Builder.Default
    @Min(value = 0, message = "sgst cannot be negative")
    private Double sgst = 0.0;

    @Builder.Default
    @Min(value = 0, message = "igst cannot be negative")
    private Double igst = 0.0;

}
