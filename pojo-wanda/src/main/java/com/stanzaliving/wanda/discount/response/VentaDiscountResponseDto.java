package com.stanzaliving.wanda.discount.response;

import com.stanzaliving.wanda.discount.enums.*;
import com.stanzaliving.wanda.discount.request.BookingDiscountCriteriasDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VentaDiscountResponseDto {
    String discountCode;
    Boolean canBeApplied;
    Double amount;
    DiscountValueType discountValueType;
    DiscountValue discountValue;
    Double percentageOfRent;
    Boolean isAutomatic;
    List<String> description;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
}
