package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 03-Feb-22
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkPseudoPersonMicrolusterResponseDto {
    List<HKPseudoResidenceResponseDto> hkPseudoPersons;
    private String residenceName;
    private String residenceUuid;

}
