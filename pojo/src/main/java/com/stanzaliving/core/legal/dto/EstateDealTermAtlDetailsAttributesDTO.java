package com.stanzaliving.core.legal.dto;

import com.stanzaliving.core.estate.dto.EstateAttributeDto;
import com.stanzaliving.core.estate.dto.EstateDto;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EstateDealTermAtlDetailsAttributesDTO {
    List<AtlDetailDto> atlDetailDtoList;
    List<DealTermDto> dealTermDtoList;
    List<EstateAttributeDto> estateAttributeDtoList;
    EstateDto estateDto;
}
