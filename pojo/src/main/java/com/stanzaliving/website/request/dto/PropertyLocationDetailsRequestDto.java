package com.stanzaliving.website.request.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationDetailsRequestDto {

    private Long locationId;
    private Integer preBookingAmount;
    private Integer unlockDiscountAmount;
}
