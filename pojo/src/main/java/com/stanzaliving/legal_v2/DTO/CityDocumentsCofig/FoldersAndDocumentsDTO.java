package com.stanzaliving.legal_v2.DTO.CityDocumentsCofig;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoldersAndDocumentsDTO {

    private String uuid;

    @NotNull(message = "Document Type Must Not be NULL or EMPTY")
    private String documentType;

    @NotNull(message = "Folder Must Not be NULL or EMPTY")
    private String folder;

    private String description;
}
