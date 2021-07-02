package com.stanzaliving.estate_v2.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KeyValueDto {
    private String label;
    private String value;
}
