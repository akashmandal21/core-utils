package com.stanzaliving.core.deal.client.dto;


import com.stanzaliving.core.deal.client.enums.DocumentSideType;
import com.stanzaliving.core.deal.client.enums.DocumentUploadType;
import com.stanzaliving.core.deal.client.enums.ResidentDocumentContext;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DealKycRequestDto {

    private ResidentDocumentContext residentDocumentContext;

    private DocumentUploadType documentUploadType;

    private DocumentSideType documentSideType;

    private String fileName;

    private String filePath;

    private Map<String, String> metadata;

    private String contractUuid;

}
