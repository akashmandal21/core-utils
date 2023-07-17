package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.DocumentTypeEnum;
import com.stanzaliving.core.enums.VerificationField;
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
    private String idNumber;
    private String idName;
    private String idDob;
    private String idAddress;
    private String panType;
    private String idType;
    private String idGender;
    private String idState;
    private String idCity;
    private String idPincode;
}
