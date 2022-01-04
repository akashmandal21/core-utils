package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
public class HkBeatGarbageCollectionResidenceDetailsDto {

    private List<GarbageCollectionResidenceDetailsResponseDto> residencesDetails;
}
