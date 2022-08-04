package com.stanzaliving.estate_v2.dto.propertyType;

import com.stanzaliving.estate_v2.enumeration.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyTypeListDto {
    private String label;
    private String value;
    private Status status;
}
