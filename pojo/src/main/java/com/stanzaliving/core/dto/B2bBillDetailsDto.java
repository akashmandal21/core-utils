package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class B2bBillDetailsDto {
    private Boolean isBillingEnabled;
    private Double roomPrice;

}
