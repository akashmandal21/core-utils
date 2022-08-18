package com.stanzaliving.core.client.dto;

import java.io.Serializable;
import java.util.Date;

import com.stanzaliving.booking.dto.response.CommercialsDetailsResponseDTO;
import com.stanzaliving.commercialcard.enums.CommercialCardStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCodeDto implements Serializable {
	
	private CommercialCardStatus cardStatus;

    private String uuid;

    private Date startDate;

    private Date endDate;
    
    private Double refundableDeposit;

    private Integer availableCount;
    
    private Double upsellAmount;
    
    private CommercialsDetailsResponseDTO commercialsDetailsResponseDTO;
    
    private MonthlyBreakupResponseDto monthlyBreakupResponseDto;
}
