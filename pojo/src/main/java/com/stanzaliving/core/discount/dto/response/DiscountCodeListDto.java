package com.stanzaliving.core.discount.dto.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class DiscountCodeListDto {

    List<VentaDiscountResponseDto> availableCodes;

    List<VentaDiscountResponseDto> unavailableCodes;

}
