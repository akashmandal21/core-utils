package com.stanzaliving.legal_v2.DTO.CityDocumentsConfig;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoldersAndDocumentsDTO {

    @NotNull(message = "Document Type Must Not be NULL or EMPTY")
    private String documentType;

    @NotNull(message = "Folder Must Not be NULL or EMPTY")
    private String folder;

    private String description;

    private List<ChecklistConfigDTO> checklistConfigPoints;
}
