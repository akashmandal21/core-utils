package com.stanzaliving.booking.dto;

import com.stanzaliving.booking.dto.request.ServicePriceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
	
public class MonthlyBreakupDto implements Serializable {

    private Double subContract1MonthlyRent;

    private Double subContract2MonthlyRent;
    
	private Double monthlyFee;

    private Double licenseFee;

    private Double cityHeadBuffer;

    private Double upsell;

    private Double priceBump;

    private ServicePriceDto packagedServicePriceDto;

    private ServicePriceDto foodServicePriceDto;

    private List<ServicePriceDto> vasPriceDto;

}
