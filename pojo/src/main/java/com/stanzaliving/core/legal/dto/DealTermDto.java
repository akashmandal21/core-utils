package com.stanzaliving.core.legal.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.leadership.enums.DealTermsEnum;
import com.stanzaliving.core.legal.enums.LegalStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
public class DealTermDto extends AbstractDto {

    private String name;

    private String value;

    private LegalStatus legalStatus;

	private String estateUuid;

    private DealTermsEnum dealTermEnum;     //useful for versioning service

}
