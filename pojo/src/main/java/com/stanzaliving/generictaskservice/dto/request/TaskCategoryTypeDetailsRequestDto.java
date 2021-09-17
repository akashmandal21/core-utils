package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Convert;
import java.time.LocalTime;
import java.util.ArrayList;
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
public class TaskCategoryTypeDetailsRequestDto{


    private String description;
    private boolean autoCompleteTask;
    private boolean overLapTask;
    private boolean overrideTask;
    private LocalTime startTime;
    private String autoCompletionEvent;
    private List<String> tagsList = new ArrayList<String>();


}
