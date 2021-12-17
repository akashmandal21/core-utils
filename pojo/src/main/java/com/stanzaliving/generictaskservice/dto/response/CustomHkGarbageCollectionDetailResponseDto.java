package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.housekeepingservice.dto.response.GarbageCollectionResidenceDetailsResponseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 16-Dec-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomHkGarbageCollectionDetailResponseDto {
    List<GarbageCollectionResidenceDetailsResponseDto> details;
    CustomResidenceDetailsResponseDto residence;
    private String duration;
}
