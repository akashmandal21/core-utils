package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentDataDTO {

    private String documentUUID;

    private String description;

    private List<DocumentVersionsDto> versions;
}
