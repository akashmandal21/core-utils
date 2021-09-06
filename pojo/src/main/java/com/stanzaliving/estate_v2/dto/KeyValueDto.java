package com.stanzaliving.estate_v2.dto;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class KeyValueDto implements Serializable {
    private String label;
    private String value;
}
