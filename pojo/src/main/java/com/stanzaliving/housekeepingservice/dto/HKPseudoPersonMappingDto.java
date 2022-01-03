package com.stanzaliving.housekeepingservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HKPseudoPersonMappingDto extends AbstractDto {

    private String hkPseudoPersonUuid;

    private String residenceUuid;

    private String microclusterUuid;

    private String pseudoName;

    private String residenceName;

    private String taskUuid;
}
