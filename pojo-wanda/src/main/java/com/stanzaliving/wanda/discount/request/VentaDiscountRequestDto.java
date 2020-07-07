package com.stanzaliving.wanda.discount.request;

import com.stanzaliving.wanda.discount.enums.BookingType;
import com.stanzaliving.wanda.discount.enums.PropertyType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class VentaDiscountRequestDto {
    private PropertyType propertyType;
    private BookingType bookingType;
    private String residenceUuid;
    private String mocromarketUuid;
    private String cityUuid;
    private Double bookingMonthlyRent;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
}
