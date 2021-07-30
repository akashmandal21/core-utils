package com.stanzaliving.core.discount.dto.response;


import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDiscountDetailsResponseDto {

    private double discountAmount;

    private String discountCode;

    private String strategyUuid;

    private List<String> invoicesDateList;
}
