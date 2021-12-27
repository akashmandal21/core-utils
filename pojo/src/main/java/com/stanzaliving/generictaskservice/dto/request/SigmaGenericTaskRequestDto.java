package com.stanzaliving.generictaskservice.dto.request;

import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author Vikas S T
 * @date 26-Dec-21
 **/
@Setter
@Getter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SigmaGenericTaskRequestDto {

    private Date startDate;

    private Date dueDate;

    private TaskType type;

    private String priorityUuid;

    private String description;

    private String var1;

    private String var2;

    private String var3;

    private String var4;

    private String var5;

    private String parentTaskUuid;

    private String taskTemplateUuid;

    private List<String> attachmentsList;

    private boolean adhocTask;
}
