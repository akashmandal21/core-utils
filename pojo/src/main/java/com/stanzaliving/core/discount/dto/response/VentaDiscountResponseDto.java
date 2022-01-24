package com.stanzaliving.core.discount.dto.response;

import com.stanzaliving.booking.dto.request.BookingDiscountCriteriasDto;
import com.stanzaliving.booking.enums.DiscountApplicabilityType;
import com.stanzaliving.booking.enums.DiscountValue;
import com.stanzaliving.booking.enums.DiscountValueType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
    private DiscountApplicabilityType discountApplicabilityType;
    private List<String> applicabilityCriteria;

    private Integer usedCount;
    private Integer availableCount;
    private LocalDate endDate;
    private Integer totalCount;
}
