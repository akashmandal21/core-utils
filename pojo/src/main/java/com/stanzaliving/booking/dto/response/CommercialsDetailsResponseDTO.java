package com.stanzaliving.booking.dto.response;

import com.stanzaliving.booking.dto.MonthlyBreakupDto;
import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialsDetailsResponseDTO implements Serializable {

    private Double securityDeposit;

    private Double maintenanceFee;

    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;

    private Double bookingAmount;

    private Double totalAmount;

    private Double discountApplied;

    private MonthlyBreakupDto monthlyBreakup;

    private AdvanceRentalDto startingAdvanceRental;

    private AdvanceRentalDto lastAdvanceRental;
}
