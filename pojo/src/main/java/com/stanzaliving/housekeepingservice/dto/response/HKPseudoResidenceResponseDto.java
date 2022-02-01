package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKPseudoResidenceResponseDto extends AbstractDto {

    private String residenceUuid;

    private String pseudoName;

    private String otp;

}
