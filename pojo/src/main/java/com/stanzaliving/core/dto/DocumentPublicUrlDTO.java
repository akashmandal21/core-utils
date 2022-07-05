package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentPublicUrlDTO {
    private DocumentTypeEnum documentType;
    private String documentUuid;
    private List<DocumentFileDTO> files;
}
