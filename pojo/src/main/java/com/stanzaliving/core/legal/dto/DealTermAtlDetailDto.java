package com.stanzaliving.core.legal.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DealTermAtlDetailDto {
    List<AtlDetailDto> atlDetailDtoList;
    List<DealTermDto> dealTermDtoList;
    String fullAtlDetailsPdfUrl;
}
