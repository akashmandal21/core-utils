package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.enums.BookingType;
import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import com.stanzaliving.booking.enums.PaymentTerm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingCommercialsCardResponseDto {

    private BookingType bookingType;

    private PaymentTerm paymentTerm;

    private String commercialsCardUuid;

    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;

    private Double annualMaintenanceFee;

    private Double monthlyMaintenanceFee;

    private Double onBoardingCharge;

    private boolean priceStrategy;
}
