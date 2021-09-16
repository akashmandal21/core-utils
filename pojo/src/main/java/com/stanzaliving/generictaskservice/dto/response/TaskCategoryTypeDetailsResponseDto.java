package com.stanzaliving.generictaskservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskCategoryTypeDetailsResponseDto {

    private String description;
    private boolean autoCompleteTask;
    private boolean overLapTask;
    private boolean overrideTask;
    private LocalTime startTime;
    private String autoCompletionEvent;
    private List<TagsGenericResponseDto> tags;

}
