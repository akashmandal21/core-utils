package com.stanzaliving.core.operations.dto.response.report;

import com.stanzaliving.core.base.enums.ColorCode;
import com.stanzaliving.core.operations.enums.FeElementType;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FeElementDto {

    FeElementType type;

    double value;

    boolean isHover;

    int numerator;

    int denominator;

    String bgColorCode;

}

