package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentMetadataDTO {
    private DocumentTypeEnum documentType;
    @JsonSetter(value = "idNumber")
    private String idNumber;
}
