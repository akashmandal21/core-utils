package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentMap {

    String documentType;

    DocumentDataDTO versionList;
}
