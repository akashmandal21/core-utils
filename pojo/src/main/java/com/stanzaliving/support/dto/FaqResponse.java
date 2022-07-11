package com.stanzaliving.support.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FaqResponse {
    private int count;
    private List<FaqResponseDto> faqList;
}
