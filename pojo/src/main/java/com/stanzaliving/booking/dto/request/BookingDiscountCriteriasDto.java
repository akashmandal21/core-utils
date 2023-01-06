package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.enums.MathematicalSymbol;
import com.stanzaliving.booking.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date preBookFromDate;
    private Date preBookToDate;
    @Builder.Default
    private MathematicalSymbol tokenAmountSymbol=MathematicalSymbol.GREATER_THAN_EQUAL_TO;
    private Integer tokenAmount;
    private Boolean remoteBooking;
    private Double closureDuration;
    private Boolean allowSameDayLeadCreation;

}
