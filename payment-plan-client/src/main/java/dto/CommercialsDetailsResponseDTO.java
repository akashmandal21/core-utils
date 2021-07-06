package dto;

import com.stanzaliving.booking.enums.MaintenanceFeeCollectionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialsDetailsResponseDTO {

    private Double securityDeposit;

    private Double maintenanceFee;

    private MaintenanceFeeCollectionType maintenanceFeeCollectionType;

    private Double licenseFee;

    private Double cityHeadBuffer;

    private Double upsell;

    private Double priceBump;

    private ServicePriceDto packagedServicePriceDto;

    private ServicePriceDto foodServicePriceDto;

    private ServicePriceDto vasPriceDto;

    private int startingAdvanceRentalMonths;

    private int lastAdvanceRentalMonths;

    private Double startingAdvanceRentalMonthsAmount;

    private Double lastAdvanceRentalMonthsAmount;


}