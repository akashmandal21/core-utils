package com.stanzaliving.support.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqResponseDto {
    private String message;
    private FaqDto faqDto;
    private List<FaqDetailDto> faqDetail;
}
