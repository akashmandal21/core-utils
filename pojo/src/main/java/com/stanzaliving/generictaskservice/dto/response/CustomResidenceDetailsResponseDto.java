package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 30-Nov-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomResidenceDetailsResponseDto {

    private String residenceUuid;

    private String residenceName;
}
