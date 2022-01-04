package com.stanzaliving.generictaskservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Pradeep Naik R
 * @date 9-Oct-21
 **/
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskRequestDto {

    private List<String> taskUuids;

    private Boolean taskTemplate;

}
