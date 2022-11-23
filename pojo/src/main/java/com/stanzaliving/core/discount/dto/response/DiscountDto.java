package com.stanzaliving.core.discount.dto.response;


import com.stanzaliving.booking.dto.request.BookingDiscountCriteriasDto;
import com.stanzaliving.booking.enums.*;
import com.stanzaliving.core.discount.enums.ApplyType;
import com.stanzaliving.core.discount.enums.DiscountCategory;
import com.stanzaliving.core.discount.enums.DiscountStatus;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DiscountDto implements Comparable<DiscountDto>{

    @NotNull
    private String discountCode;
    @NotNull
    private DiscountCategory discountCategory;
    @NotNull
    private Double amount;
    @NotNull
    private PropertyType propertyType;
    @NotNull
    private BookingType bookingType;
    @NotNull
    private ApplyType applyType;
    private Integer totalCount;
    private LocalDate fromDate;
    private LocalDate toDate;
    @NotNull
    private DiscountValue discountValue;
    @NotNull
    private DiscountValueType discountValueType;
    @NotNull
    private ApplicabilityLevelType applicabilityLevelType;
    @NotNull
    private String applicabilityLevelUuid;
    private DiscountStatus discountStatus = DiscountStatus.NOT_APPROVED;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
    private List<String> description;
    private String createdBy;
    private DiscountApplicabilityType discountApplicabilityType;

    @Override
    public int compareTo(DiscountDto discountDto) {
        if (Double.compare(this.amount, discountDto.amount) == 0)
            return 0;
        return Double.compare(this.amount, discountDto.amount) > 0 ? -1 : 1;
    }
}
