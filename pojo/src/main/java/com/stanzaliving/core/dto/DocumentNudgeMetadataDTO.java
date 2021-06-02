package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentNudgeMetadataDTO {

    private String documentUuid;

    private DocumentTypeEnum documentType;

    private String message;

    private String comment;
}
