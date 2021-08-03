package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author anudeep.alevoor
 *
 *
 * Task History Dto class for Task Service History.
 *
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskServiceHistoryDto {

    private String taskId;

    private Date generatedDate;

    private String taskStatus;

    private String description;

    private List<String> attachments;

}