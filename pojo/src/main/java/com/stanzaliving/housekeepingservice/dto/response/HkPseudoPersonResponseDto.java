package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 13-Oct-21
 **/

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class HkPseudoPersonResponseDto extends AbstractDto {

    private String hkPersonName;

    private String hkPseudoName;

}
