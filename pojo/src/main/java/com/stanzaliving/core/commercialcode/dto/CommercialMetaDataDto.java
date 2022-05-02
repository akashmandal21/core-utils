package com.stanzaliving.core.commercialcode.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class CommercialMetaDataDto {
    private String label;
    private String value;
    @Builder.Default
    private List<String> note=new ArrayList<>();
}
