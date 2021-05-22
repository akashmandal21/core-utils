package com.stanzaliving.legal_v2.DTO.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentRequestEmailDTO {

    private String propertyCreatedBDEmail;

    private String documentType;

    private String documentName;

    private String description;

}
