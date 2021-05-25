package com.stanzaliving.estate_v2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class KeyValueDto {
    private String label;
    private String value;
}
