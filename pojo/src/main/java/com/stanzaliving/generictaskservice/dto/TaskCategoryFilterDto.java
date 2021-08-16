package com.stanzaliving.generictaskservice.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Vikas S T
 * @date 11-Aug-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class TaskCategoryFilterDto {
    private String module;
    private String taskCategoryName;
}
