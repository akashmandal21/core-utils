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
    private String discountCode;
    private Boolean canBeApplied;
    private Double amount;
    private DiscountValueType discountValueType;
    private DiscountValue discountValue;
    private Double percentageOfRent;
    private Boolean isAutomatic;
    private List<String> description;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
}
