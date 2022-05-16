package com.stanzaliving.booking.dto.request;

import com.stanzaliving.booking.dto.response.SoldBookingDto;
import lombok.*;


import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentReqDto {
    Map<String, SoldBookingDto> refIdsMap;
}