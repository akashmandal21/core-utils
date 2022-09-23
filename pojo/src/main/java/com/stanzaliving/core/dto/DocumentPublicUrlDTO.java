package com.stanzaliving.core.dto;

import com.opencsv.bean.CsvBindByName;
import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentPublicUrlDTO {

    @CsvBindByName(column = "Document Type")
    private DocumentTypeEnum documentType;

    @CsvBindByName(column = "Document UUID")
    private String documentUuid;

    @CsvBindByName(column = "Document ID Number")
    private String documentIdNumber;

    @CsvBindByName(column = "Resident First Name")
    private String residentFirstName;

    @CsvBindByName(column = "Resident Last Name")
    private String residentLastName;

    @CsvBindByName(column = "Resident Mobile Number")
    private String residentMobileNumber;

    @CsvBindByName(column = "URL Front")
    private String urlFront;

    @CsvBindByName(column = "URL Back")
    private String urlBack;
}