package com.stanzaliving.estate_v2.dto.questionTemplate;

import com.stanzaliving.estate_v2.annotation.constraint.EmptyOrNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubSectionDisplayTypeDto {
    @EmptyOrNull(message = "Display-Type cannot be null")
    private String type;
    private Object data;

}
