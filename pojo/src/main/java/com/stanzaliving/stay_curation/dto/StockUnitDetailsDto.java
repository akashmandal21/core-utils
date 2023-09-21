package com.stanzaliving.stay_curation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockUnitDetailsDto {

    private String skuId;

    private String skuCode;

    private Map<String, Object> meta;
}
