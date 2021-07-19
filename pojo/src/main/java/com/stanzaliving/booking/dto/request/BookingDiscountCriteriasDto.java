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
    private MathematicalSymbol upfrontPaymentSymbol;
    private Double upfrontPaymentMonth;
    private MathematicalSymbol lockInDurationSymbol;
    private Double lockInDurationMonth;
    private PaymentMode paymentMode;
    private String specificInventory;
    private Boolean applicableOnRoomConversion = Boolean.FALSE;
    private String leadTag;
//    private MathematicalSymbol leadTagSymbol;
}
