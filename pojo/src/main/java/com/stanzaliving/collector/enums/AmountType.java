package com.stanzaliving.collector.enums;

import com.stanzaliving.core.base.utils.DateUtil;

import java.time.LocalDate;

public enum AmountType {
    RENT{
        public Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount) {
            if(fromDate.isAfter(userCommercialToDate)) {
                return amount;
            }

            if((fromDate.isBefore(userCommercialToDate) && fromDate.isAfter(userCommercialFromDate)) || fromDate.equals(userCommercialToDate) ) {
                Integer noOfDays = DateUtil.getCountOfDates(userCommercialFromDate, userCommercialToDate);
                return  (DateUtil.getCountOfDates(userCommercialFromDate, fromDate.minusDays(1)) * amount)/noOfDays;
            }
            return 0.0;
        }
    }, DISCOUNT{
        public Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount) {
            if(fromDate.isAfter(userCommercialToDate)) {
                return amount*(-1);
            }
            if((fromDate.isBefore(userCommercialToDate) && fromDate.isAfter(userCommercialFromDate)) || fromDate.equals(userCommercialToDate) ) {
                Integer noOfDays = DateUtil.getCountOfDates(userCommercialFromDate, userCommercialToDate);
                return  (-1)*(DateUtil.getCountOfDates(userCommercialFromDate, fromDate.minusDays(1)) * amount)/noOfDays;
            }
            return 0.0;
        }
    };
    public abstract Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount);
}