package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycDocumentsResponseDTO {

    private List<KycDocumentDTO> documents;

    private DocumentTypeEnum[] validDocuments;

    private DocumentTypeEnum[] documentTypes;

    private DocumentTypeEnum[] dualSideDocuments;

    private DocumentSide[] documentSideTypes;
}
