package com.stanzaliving.legal_v2.DTO.Document;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DocumentVersionsDto {

    private String documentName;

    private String docPath;

    private String emailUuid;

    private String url;

    private int version;

    private boolean isFinal;

    private List<ChecklistDTO> checklistDTOList;


}
