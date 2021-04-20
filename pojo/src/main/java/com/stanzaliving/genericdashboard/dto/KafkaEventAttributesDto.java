package com.stanzaliving.genericdashboard.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class KafkaEventAttributesDto {

    private String attributeName;

    private String attributeValue;
}

