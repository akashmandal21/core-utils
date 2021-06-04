package com.stanzaliving.community.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventAttributeDTO {
    private String fieldName;
    private String alias;
    private String fieldType;
    private Boolean mandatory;
    private Long width;
}
