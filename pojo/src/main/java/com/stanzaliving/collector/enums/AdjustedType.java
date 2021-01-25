package com.stanzaliving.collector.enums;

import com.stanzaliving.collector.dto.UserRentAggregationDto;
import com.stanzaliving.core.base.utils.DateUtil;

import java.time.LocalDate;

public enum AdjustedType {
    NONE{
        public Double getAdjustedAmountForActionTrackerByResidents(UserRentAggregationDto userRentAggregationDto) {
            return 0.0;
        }
    }, BOTH{
        public Double getAdjustedAmountForActionTrackerByResidents(UserRentAggregationDto userRentAggregationDto) {
            return AR_ONLY.getAdjustedAmountForActionTrackerByResidents(userRentAggregationDto) + userRentAggregationDto.getSecurityDeposit();
        }
    }, AR_ONLY{
        public Double getAdjustedAmountForActionTrackerByResidents(UserRentAggregationDto userRentAggregationDto) {
            LocalDate todayDate = LocalDate.now();
            if (userRentAggregationDto.getAdvanceRentalDuration().equals(0)) {
                return 0d;
            }
            if(todayDate.isBefore(userRentAggregationDto.getContractEndDate()
                    .minusMonths(userRentAggregationDto.getAdvanceRentalDuration())) || todayDate.isEqual(userRentAggregationDto.getAdvanceRentalFromDate())){
                return userRentAggregationDto.getAdvanceRentalAmount();
            }
            if(todayDate.isAfter(userRentAggregationDto.getAdvanceRentalFromDate()) && todayDate.isBefore(userRentAggregationDto.getAdvanceRentalToDate())){
                Double perDayAdvanceRental = userRentAggregationDto.getAdvanceRentalAmount()/DateUtil.getCountOfDates(userRentAggregationDto.getAdvanceRentalFromDate()
                        , userRentAggregationDto.getAdvanceRentalToDate());
                return DateUtil.getCountOfDates(todayDate, userRentAggregationDto.getAdvanceRentalToDate())*perDayAdvanceRental;
            }
            return 0.0;
        }
    }, SD_ONLY{
        public Double getAdjustedAmountForActionTrackerByResidents(UserRentAggregationDto userRentAggregationDto) {
            return userRentAggregationDto.getSecurityDeposit();
        }
    };
    public abstract Double getAdjustedAmountForActionTrackerByResidents(UserRentAggregationDto userRentAggregationDto);
}
