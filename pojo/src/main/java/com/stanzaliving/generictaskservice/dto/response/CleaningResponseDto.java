package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Vikas S T
 * @date 22-Oct-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CleaningResponseDto {

    private String residenceName;

    private String residenceUuid;

    private List<AreaTagDetailsResponseDto> areaTags;

    private LocalDate date;

    private LocalTime duration;
}
