package com.stanzaliving.website.request.dto;

import lombok.*;

import javax.persistence.Column;

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
    private Integer sortOrder;
}
