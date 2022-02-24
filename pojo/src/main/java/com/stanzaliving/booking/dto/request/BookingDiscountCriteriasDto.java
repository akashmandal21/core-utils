package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.MathematicalSymbol;
import com.stanzaliving.booking.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingDiscountCriteriasDto {
	@Builder.Default
	private MathematicalSymbol upfrontPaymentSymbol=MathematicalSymbol.GREATER_THAN_EQUAL_TO;
    private Double upfrontPaymentMonth;
    @Builder.Default
    private MathematicalSymbol lockInDurationSymbol=MathematicalSymbol.GREATER_THAN_EQUAL_TO;
    private Double lockInDurationMonth;
    private PaymentMode paymentMode;
    private String specificInventory;
    @Builder.Default
    private Boolean applicableOnRoomConversion = Boolean.FALSE;
    private String leadTag;
    private Boolean entireFlatBooking;

}
