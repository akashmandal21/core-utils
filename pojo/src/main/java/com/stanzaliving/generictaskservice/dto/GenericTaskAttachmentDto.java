package com.stanzaliving.generictaskservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuperBuilder
public class GenericTaskAttachmentDto {

    private String attachmentReferenceId;

    private String attachmentFilePath;

    private String attachmentFileName;

    private String module;

    private String attachmentBucket;
}
