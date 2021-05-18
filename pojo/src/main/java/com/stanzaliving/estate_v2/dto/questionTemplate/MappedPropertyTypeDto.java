package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MappedPropertyTypeDto {
    private String uuid;
    private String name;
}
