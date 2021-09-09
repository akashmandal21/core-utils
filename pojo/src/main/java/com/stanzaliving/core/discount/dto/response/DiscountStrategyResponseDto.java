package com.stanzaliving.core.discount.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscountStrategyResponseDto {

    List<DiscountStrategyListingResponseDto> discountStrategyList;
}
