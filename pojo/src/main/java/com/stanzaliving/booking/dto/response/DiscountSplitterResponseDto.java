package com.stanzaliving.booking.dto.response;


import com.stanzaliving.booking.dto.DiscountSplitterDto;
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

    List<DiscountSplitterDto> monthWiseDiscountSplitter;
}
