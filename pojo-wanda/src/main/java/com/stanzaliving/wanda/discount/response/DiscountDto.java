package com.stanzaliving.wanda.discount.response;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.stanzaliving.wanda.discount.enums.BookingType;
import com.stanzaliving.wanda.discount.enums.DiscountValue;
import com.stanzaliving.wanda.discount.enums.DiscountValueType;
import com.stanzaliving.wanda.discount.enums.PropertyType;
import com.stanzaliving.wanda.discount.request.BookingDiscountCriteriasDto;

import lombok.Getter;

@Getter
public class DiscountDto implements Comparable<DiscountDto> {
    @NotNull
    private String discountCode;
    @NotNull
    private Double amount;
    @NotNull
    private PropertyType propertyType;
    @NotNull
    private BookingType bookingType;
    private Integer totalCount;
    private LocalDate fromDate;
    private LocalDate toDate;
    @NotNull
    private DiscountValue discountValue;
    @NotNull
    private DiscountValueType discountValueType;
    @NotNull
    private String applicabilityLevelUuid;
    private BookingDiscountCriteriasDto bookingDiscountCriterias;
    private List<String> description;
    private String createdBy;
    @Override
    public int compareTo(DiscountDto discountDto) {
        if (Double.compare(this.amount, discountDto.amount) == 0)
            return 0;
        return Double.compare(this.amount, discountDto.amount) > 0 ? -1 : 1;
    }
}