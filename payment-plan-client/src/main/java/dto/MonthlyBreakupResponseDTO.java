package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyBreakupResponseDTO {
	
	private Double monthlyFee;

    private Double licenseFee;

    private Double cityHeadBuffer;

    private Double upsell;

    private Double priceBump;

    private ServicePriceDto packagedServicePriceDto;

    private ServicePriceDto foodServicePriceDto;

    private ServicePriceDto vasPriceDto;

}