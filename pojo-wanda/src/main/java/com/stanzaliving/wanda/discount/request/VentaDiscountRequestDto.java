package com.stanzaliving.wanda.discount.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDiscountRequestDto {
    private com.stanzaliving.wanda.discount.enums.PropertyType propertyType;
    private com.stanzaliving.wanda.discount.enums.BookingType bookingType;
    private String residenceUuid;
    private String mocromarketUuid;
    private String cityUuid;
    private Double bookingMonthlyRent;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
}
