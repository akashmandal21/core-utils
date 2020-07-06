package com.stanzaliving.wanda.discount.request;

import com.stanzaliving.wanda.discount.enums.*;
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
}
