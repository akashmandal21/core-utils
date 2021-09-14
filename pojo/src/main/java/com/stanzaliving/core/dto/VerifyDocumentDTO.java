package com.stanzaliving.core.dto;

import com.stanzaliving.core.dto.DocumentMetadataDTO;
import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifyDocumentDTO {

    @NotNull(message = "Document is missing")
    private MultipartFile file;

    @NotBlank(message = "Document Type is missing")
    private DocumentTypeEnum documentType;

    @NotBlank(message = "Metadata is missing")
    private DocumentMetadataDTO metadata;

    @NotBlank(message = "Document Side is missing")
    private DocumentSide documentSide;
}
