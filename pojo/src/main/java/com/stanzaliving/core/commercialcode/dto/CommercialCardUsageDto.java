package com.stanzaliving.core.commercialcode.dto;

import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardUsageDto {
    private String uuid;

    private String commercialCodeName;

    private Integer availableCount;

    private Integer usageCount;

    private CommercialCardStatus cardStatus;
}

