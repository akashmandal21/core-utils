package com.stanzaliving.website.request.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;

import javax.persistence.Column;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PropertyLocationDetailsRequestDto extends AbstractDto {

    private Integer preBookingAmount;
    private Integer unlockDiscountAmount;
    private Integer sortOrder;
}
