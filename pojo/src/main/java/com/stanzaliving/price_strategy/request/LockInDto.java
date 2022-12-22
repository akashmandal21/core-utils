package com.stanzaliving.price_strategy.request;

import com.stanzaliving.commercialcard.enums.CriteriaCondition;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LockInDto {

    private Date moveIn;
    private CriteriaCondition operator;
    private String value;
}
