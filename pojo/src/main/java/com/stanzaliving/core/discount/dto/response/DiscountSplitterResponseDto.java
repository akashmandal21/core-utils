package com.stanzaliving.core.discount.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountSplitterResponseDto {

    private String description;

    List<DiscountSplitterDto> monthWiseDiscountSplitter;
}
