package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentsDto {

    @NotNull(message = "type cannot be null")
    private String type;

    @NotNull(message = "folder cannot be null")
    private String folder;

    private String description;

    @NotNull(message = "propertyType cannot be null")
    private String propertyId;

    private DocumentVersionsDto documentVersion;


}
