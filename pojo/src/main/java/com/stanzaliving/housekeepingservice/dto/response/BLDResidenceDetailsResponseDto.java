package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 09-Nov-21
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BLDResidenceDetailsResponseDto {

    private String mealType;

    private String duration;

    private String residenceId;

    private String residenceName;
}
