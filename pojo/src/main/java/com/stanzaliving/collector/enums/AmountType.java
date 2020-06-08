package com.stanzaliving.collector.enums;

import com.stanzaliving.core.base.utils.DateUtil;

import java.time.LocalDate;

public enum AmountType {
    RENT{
        public Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount) {
            return getNetAmountTillFromDate(fromDate, userCommercialFromDate, userCommercialToDate, amount);
        }
    }, DISCOUNT{
        public Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount) {
            return getNetAmountTillFromDate(fromDate, userCommercialFromDate, userCommercialToDate, -1d * amount);
        }
    }, CREDIT_NOTE{
        public Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount) {
            return getNetAmountTillFromDate(fromDate, userCommercialFromDate, userCommercialToDate, -1d * amount);
        }
    };

    private static Double getNetAmountTillFromDate(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, double amount) {
        Double perDayRent = amount / ((double) DateUtil.getCountOfDates(userCommercialFromDate, userCommercialToDate));
        if (fromDate.isAfter(userCommercialToDate)) {
            return amount;
        }
        if (((fromDate.isEqual(userCommercialFromDate) || fromDate.isAfter(userCommercialFromDate)) && (fromDate.isBefore(userCommercialToDate) || fromDate.isEqual(userCommercialToDate)))) {
            return DateUtil.getCountOfDates(userCommercialFromDate, fromDate.minusDays(1)) * perDayRent;
        }
        return 0d;
    }

//    private static Double getNetAmountFromFromDateToToday(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount, Double perDayRent) {
//        if (fromDate.isAfter(userCommercialToDate)) {
//            return amount;
//        }
//
//        if (((fromDate.isEqual(userCommercialFromDate) || fromDate.isAfter(userCommercialFromDate)) && (fromDate.isBefore(userCommercialToDate) || fromDate.isEqual(userCommercialToDate)))
//                && LocalDate.now().isAfter(userCommercialToDate)) {
//            return DateUtil.getCountOfDates(fromDate, userCommercialToDate) * perDayRent;
//        }
//
//        if (((fromDate.isEqual(userCommercialFromDate) || fromDate.isAfter(userCommercialFromDate)) && (fromDate.isBefore(userCommercialToDate) || fromDate.isEqual(userCommercialToDate)))
//                && ((LocalDate.now().isEqual(userCommercialFromDate) || LocalDate.now().isAfter(userCommercialFromDate)) && (LocalDate.now().isBefore(userCommercialToDate) || LocalDate.now().isEqual(userCommercialToDate)))) {
//            return DateUtil.getCountOfDates(fromDate, LocalDate.now()) * perDayRent;
//        }
//
//        if (fromDate.isBefore(userCommercialFromDate) && LocalDate.now().isAfter(userCommercialToDate)) {
//            return amount;
//        }
//
//        if (fromDate.isBefore(userCommercialFromDate) &&
//                ((LocalDate.now().isEqual(userCommercialFromDate) || LocalDate.now().isAfter(userCommercialFromDate)) && (LocalDate.now().isBefore(userCommercialToDate) || LocalDate.now().isEqual(userCommercialToDate)))) {
//            return DateUtil.getCountOfDates(userCommercialFromDate, LocalDate.now()) * perDayRent;
//        }
//
//        return 0.0;
//    }

    public abstract Double getAmount(LocalDate fromDate, LocalDate userCommercialFromDate, LocalDate userCommercialToDate, Double amount);
}