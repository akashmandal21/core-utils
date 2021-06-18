package com.stanzaliving.core.commercialcode.dto.response;

import com.stanzaliving.commercialcard.enums.CommercialCardStatus;
import com.stanzaliving.core.commercialcode.dto.request.CommercialCardRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommercialCardResponseDto extends CommercialCardRequestDto {
    private CommercialCardStatus cardStatus;
}
