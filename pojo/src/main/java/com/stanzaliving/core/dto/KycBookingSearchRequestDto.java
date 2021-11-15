package com.stanzaliving.core.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class KycBookingSearchRequestDto extends AbstractDto {

    private String searchKeyword;

    private PageAndSortDto pageDto;

}