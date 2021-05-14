package com.stanzaliving.legal_v2.DTO.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DocumentRequestDto {

    @NotNull(message = "name cannot be null")
    private String name;

    @NotNull(message = "type cannot be null")
    private String type;

    @NotNull(message = "folder cannot be null")
    private String folder;

    @NotNull(message = "description cannot be null")
    private String description;

    private Boolean isActive;

    @NotNull(message = "propertyType cannot be null")
    private String propertyTypeId;

    private List<DocumentVersionRequestDto> documentVersionList;


}
