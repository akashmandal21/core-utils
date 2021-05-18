package com.stanzaliving.legal_v2.DTO.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentsDto {

    @NotNull(message = "type cannot be null")
    private String type;

    @NotNull(message = "folder cannot be null")
    private String folder;

    private String description;

    @NotNull(message = "propertyType cannot be null")
    private String propertyTypeId;

    private DocumentVersionsDto documentVersion;


}
