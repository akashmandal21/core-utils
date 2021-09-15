package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.PropertyType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDiscountRequestDto {
	private PropertyType propertyType;
	private BookingType bookingType;
	private String residenceUuid;
	private String mocromarketUuid;
	private String cityUuid;
	@Builder.Default
	private Double bookingMonthlyRent=0.0;
	private BookingDiscountCriteriasDto bookingDiscountCriterias;
	// to distinguish between venta and alfred flow
	@Builder.Default
	private Boolean ventaFlow = Boolean.FALSE;
	private String discountUuid;
}
