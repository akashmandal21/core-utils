package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequestDto {
    private double price;
    private double cgstPercent;
    private double sgstPercent;
    private double igstPercent;
}
