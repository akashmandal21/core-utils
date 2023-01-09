package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadDocumentV2Dto {

    MultipartFile file;
    String bookingUuid;
    String residentUuid;
    String residentCode;
    DocumentTypeEnum documentType;
    String metadata;
    DocumentSide documentSide;
    boolean isReuploaded;
    boolean isActive;
    boolean allowRejection;

}
