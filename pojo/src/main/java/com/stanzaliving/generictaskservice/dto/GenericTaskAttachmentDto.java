package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.enums.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class GenericTaskAttachmentDto {

    @NotEmpty(message = "Task Id is mandatory")
    private String taskId;

    private String attachmentFilePath;

    private String attachmentFileName;

    @NotEmpty(message = "Module is mandatory")
    private String module;

    private String attachmentBucket;

    @NotEmpty(message = "Department is mandatory")
    private Department department;

    private String url;
}
